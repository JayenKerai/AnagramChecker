package com.sparta.jk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAnagramChecker {
    AnagramChecker anagramChecker = new AnagramChecker();

    @Test
    public void testThatValidAnagramsReturnTrue(){
        Assertions.assertTrue(anagramChecker.isAnagram("listen", "silent"));
    }

    @Test
    public void testThatValidAnagramsReturnTrueWithCapitalLetters(){
        Assertions.assertTrue(anagramChecker.isAnagram("Listen", "Silent"));
    }

    @Test
    public void testThatValidAnagramsReturnTrueWithRandomCapitalLetters(){
        Assertions.assertTrue(anagramChecker.isAnagram("LisTen", "SilEnT"));
    }

    @Test
    public void testThatSameInputsWithDifferentCaseReturnsTrue(){
        Assertions.assertTrue(anagramChecker.isAnagram("HELLO", "hello"));
    }

    @Test
    public void testThaInvalidAnagramsReturnFalse(){
        Assertions.assertFalse(anagramChecker.isAnagram("Hello", "There"));
    }

    @Test
    public void testThaInvalidAnagramsReturnFalseWithNoCapitalisedLetters(){
        Assertions.assertFalse(anagramChecker.isAnagram("hello", "there"));
    }

    @Test
    public void testThatTwoEmptyStringsReturnTrue(){
        Assertions.assertTrue(anagramChecker.isAnagram("", ""));
    }

    @Test
    public void testThatTwoSpaceInputsReturnTrue(){
        Assertions.assertTrue(anagramChecker.isAnagram(" ", " "));
    }

    @Test
    public void testThatMultipleWordAnagramsWork(){
        Assertions.assertTrue(anagramChecker.isAnagram("School master", "The classroom"));
    }

    @Test
    public void testThatNullInputsReturnTrue(){
        Assertions.assertTrue(anagramChecker.isAnagram(null, null));
    }

    @Test
    public void testThatMissingFirstInputReturnsFalse(){
        Assertions.assertFalse(anagramChecker.isAnagram(null, "There"));
    }

    @Test
    public void testThatMissingSecondInputReturnsFalse(){
        Assertions.assertFalse(anagramChecker.isAnagram("Hello", null));
    }
}
