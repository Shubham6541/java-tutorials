package com.nklkarthi.commons.lang3;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class StringUtilsTest {
    @Test
    public void givenString_whenCheckingContainsAny_thenCorrect() {
        String string = "nklkarthi.com";
        boolean contained1 = StringUtils.containsAny(string, 'a', 'b', 'c');
        boolean contained2 = StringUtils.containsAny(string, 'x', 'y', 'z');
        boolean contained3 = StringUtils.containsAny(string, "abc");
        boolean contained4 = StringUtils.containsAny(string, "xyz");
        assertTrue(contained1);
        assertFalse(contained2);
        assertTrue(contained3);
        assertFalse(contained4);
    }

    @Test
    public void givenString_whenCheckingContainsIgnoreCase_thenCorrect() {
        String string = "nklkarthi.com";
        boolean contained = StringUtils.containsIgnoreCase(string, "nklkarthi");
        assertTrue(contained);
    }

    @Test
    public void givenString_whenCountingMatches_thenCorrect() {
        String string = "welcome to www.nklkarthi.com";
        int charNum = StringUtils.countMatches(string, 'w');
        int stringNum = StringUtils.countMatches(string, "com");
        assertEquals(4, charNum);
        assertEquals(2, stringNum);
    }

    @Test
    public void givenString_whenAppendingAndPrependingIfMissing_thenCorrect() {
        String string = "nklkarthi.com";
        String stringWithSuffix = StringUtils.appendIfMissing(string, ".com");
        String stringWithPrefix = StringUtils.prependIfMissing(string, "www.");
        assertEquals("nklkarthi.com", stringWithSuffix);
        assertEquals("www.nklkarthi.com", stringWithPrefix);
    }

    @Test
    public void givenString_whenSwappingCase_thenCorrect() {
        String originalString = "nklkarthi.COM";
        String swappedString = StringUtils.swapCase(originalString);
        assertEquals("nklkarthi.com", swappedString);
    }

    @Test
    public void givenString_whenCapitalizing_thenCorrect() {
        String originalString = "nklkarthi";
        String capitalizedString = StringUtils.capitalize(originalString);
        assertEquals("nklkarthi", capitalizedString);
    }

    @Test
    public void givenString_whenUncapitalizing_thenCorrect() {
        String originalString = "nklkarthi";
        String uncapitalizedString = StringUtils.uncapitalize(originalString);
        assertEquals("nklkarthi", uncapitalizedString);
    }

    @Test
    public void givenString_whenReversingCharacters_thenCorrect() {
        String originalString = "nklkarthi";
        String reversedString = StringUtils.reverse(originalString);
        assertEquals("gnudleab", reversedString);
    }

    @Test
    public void givenString_whenReversingWithDelimiter_thenCorrect() {
        String originalString = "www.nklkarthi.com";
        String reversedString = StringUtils.reverseDelimited(originalString, '.');
        assertEquals("com.nklkarthi.www", reversedString);
    }

    @Test
    public void givenString_whenRotatingTwoPositions_thenCorrect() {
        String originalString = "nklkarthi";
        String rotatedString = StringUtils.rotate(originalString, 4);
        assertEquals("dungbael", rotatedString);
    }

    @Test
    public void givenTwoStrings_whenComparing_thenCorrect() {
        String tutorials = "nklkarthi Tutorials";
        String courses = "nklkarthi Courses";
        String diff1 = StringUtils.difference(tutorials, courses);
        String diff2 = StringUtils.difference(courses, tutorials);
        assertEquals("Courses", diff1);
        assertEquals("Tutorials", diff2);
    }
}
