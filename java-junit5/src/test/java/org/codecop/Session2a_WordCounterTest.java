package org.codecop;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Session 2a: WordCounterTest - Basic assertions. <br />
 * @see "http://junit.org/junit5/docs/current/user-guide/#writing-tests-assertions"
 */
class Session2a_WordCounterTest {

    // TODO Add the proper assertions to complete the tests. 
    // The test name explains what needs to be asserted. 
    
    @Test
    void shouldCountNumberOfWords() {
        WordCounter counter = new WordCounter("Keep the bar green to keep the code clean.");
        // TODO Check that 9, counter.numberOfWords().
        Assertions.assertEquals( 9, counter.numberOfWords());
    }

    @Test
    void shouldVerifyContainmentOfWord() {
        WordCounter counter = new WordCounter("green bar green hat");
        // TODO Check that counter.containsWord("bar").
        Assertions.assertTrue(counter.containsWord("bar"));
    }

    @Test
    void shouldVerifyNonContainmentOfWord() {
        WordCounter counter = new WordCounter("green hat");
        // TODO Check that counter.containsWord("red") is false.
        Assertions.assertFalse(counter.containsWord("red"));
    }

    @Test
    void shouldReturnNullForUnknownWordCount() {
        WordCounter counter = new WordCounter("green bar green hat");
        // TODO Check that counter.countOf("else") is null.
        assertNull(counter.countOf("Else"));
    }

    @Test
    void shouldReturnNotNullWordCountForExistingWord() {
        WordCounter counter = new WordCounter("green bar green hat");
        // TODO Check that counter.countOf("green") is not null.
        Assertions.assertNotNull(counter.countOf("green"));
    }

    @Test
    void shouldFindUniqueWords() {
        WordCounter counter = new WordCounter("green bar green hat");
        // TODO Check that new String[] { "bar", "green", "hat" }, counter.uniqueWords().
        Assertions.assertArrayEquals(new String[]{"bar", "green", "hat"}, counter.uniqueWords());
    }

    @Test
    void shouldReturnRatioOfWords() {
        WordCounter counter = new WordCounter("green bar green");
        // TODO Check that 0.33, counter.ratioOf("bar").
        // Note that floating point numbers need an accuracy delta, e.g. 0.01.
        double actualValue = BigDecimal.valueOf(counter.ratioOf("bar"))
                .setScale(2, RoundingMode.HALF_UP).doubleValue();

        Assertions.assertEquals(0.33, actualValue);
    }
}
