package org.nklkarthi.uribuilder;

import static org.junit.Assert.assertEquals;

import java.util.Collections;

import org.junit.Test;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SpringUriBuilderTest {

    @Test
    public void constructUri() {
        UriComponents uriComponents = UriComponentsBuilder.newInstance().scheme("http").host("www.nklkarthi.com").path("/junit-5").build();

        assertEquals("http://www.nklkarthi.com/junit-5", uriComponents.toUriString());
    }

    @Test
    public void constructUriEncoded() {
        UriComponents uriComponents = UriComponentsBuilder.newInstance().scheme("http").host("www.nklkarthi.com").path("/junit 5").build().encode();

        assertEquals("http://www.nklkarthi.com/junit%205", uriComponents.toUriString());
    }

    @Test
    public void constructUriFromTemplate() {
        UriComponents uriComponents = UriComponentsBuilder.newInstance().scheme("http").host("www.nklkarthi.com").path("/{article-name}").buildAndExpand("junit-5");

        assertEquals("http://www.nklkarthi.com/junit-5", uriComponents.toUriString());
    }

    @Test
    public void constructUriWithQueryParameter() {
        UriComponents uriComponents = UriComponentsBuilder.newInstance().scheme("http").host("www.google.com").path("/").query("q={keyword}").buildAndExpand("nklkarthi");

        assertEquals("http://www.google.com/?q=nklkarthi", uriComponents.toUriString());
    }

    @Test
    public void expandWithRegexVar() {
        String template = "/myurl/{name:[a-z]{1,5}}/show";
        UriComponents uriComponents = UriComponentsBuilder.fromUriString(template).build();
        uriComponents = uriComponents.expand(Collections.singletonMap("name", "test"));

        assertEquals("/myurl/test/show", uriComponents.getPath());
    }
}
