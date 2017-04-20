package test.java.com.nklkarthi.selenium.junit;

import main.java.com.nklkarthi.selenium.SeleniumExample;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.testng.Assert.*;

public class SeleniumWithJUnitLiveTest {

    private static SeleniumExample seleniumExample;
    private String expectedTitle = "About nklkarthi | nklkarthi";

    @BeforeClass
    public static void setUp() {
        seleniumExample = new SeleniumExample();
    }

    @AfterClass
    public static void tearDown() {
        seleniumExample.closeWindow();
    }

    @Test
    public void whenAboutnklkarthiIsLoaded_thenAboutEugenIsMentionedOnPage() {
            seleniumExample.getAboutnklkarthiPage();
            String actualTitle = seleniumExample.getTitle();
            assertNotNull(actualTitle);
            assertEquals(expectedTitle, actualTitle);
            assertTrue(seleniumExample.isAuthorInformationAvailable());
    }

}
