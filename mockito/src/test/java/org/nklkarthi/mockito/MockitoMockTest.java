package org.nklkarthi.mockito;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.containsString;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.mockito.MockSettings;
import org.mockito.exceptions.verification.TooLittleActualInvocations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class MockitoMockTest {


    @Test
    public void whenUsingSimpleMockTest() {
        MyList listMock = mock(MyList.class);
        when(listMock.add(anyString())).thenReturn(false);
        boolean added = listMock.add(randomAlphabetic(6));

        verify(listMock).add(anyString());
        assertThat(added, is(false));
    }

    @Test
    public void whenUsingSimpleMockBDDTest() {
        MyList listMock = mock(MyList.class);
        given(listMock.add(anyString())).willReturn(false);
        boolean added = listMock.add(randomAlphabetic(6));

        then(listMock).should().add(anyString());
        assertThat(added, is(false));
    }

    private static class CustomAnswer implements Answer<Boolean> {
        @Override
        public Boolean answer(InvocationOnMock invocation) throws Throwable {
            return false;
        }
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void whenUsingMockWithNameTest() {
        MyList listMock = mock(MyList.class, "myMock");
        given(listMock.add(anyString())).willReturn(false);
        listMock.add(randomAlphabetic(6));

        thrown.expect(TooLittleActualInvocations.class);
        thrown.expectMessage(containsString("myMock.add"));

        verify(listMock, times(2)).add(anyString());
    }

    @Test
    public void whenUsingMockWithAnswerTest() {
        MyList listMock = mock(MyList.class, new CustomAnswer());
        boolean added = listMock.add(randomAlphabetic(6));

        verify(listMock).add(anyString());
        assertThat(added, is(false));
    }

    @Test
    public void whenUsingMockWithSettingsTest() {
        MockSettings customSettings = withSettings().defaultAnswer(new CustomAnswer());
        MyList listMock = mock(MyList.class, customSettings);
        boolean added = listMock.add(randomAlphabetic(6));

        verify(listMock).add(anyString());
        assertThat(added, is(false));
    }
}