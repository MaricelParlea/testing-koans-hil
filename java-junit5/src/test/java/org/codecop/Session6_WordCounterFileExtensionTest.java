package org.codecop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;

import org.codecop.Session6_TempFile.Temp;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

/**
 * Session 6: WordCounterFileExtensionTest - Reuse fixtures in Extensions. <br />
 * @see "http://junit.org/junit5/docs/current/user-guide/#extensions"
 */
// TODO Use the TempFile extension to create a temporary words file for each test. 
class Session6_WordCounterFileExtensionTest {

    @ExtendWith(Session6_TempFile.class)
    @Test
    void shouldReturnCountOfWordsBetter(@Temp File wordsFile) throws IOException {
        WordCounter counter = new WordCounter(wordsFile);
        assertEquals(9, counter.numberOfWords()); 
    }

    @Test
    void shouldVerifyContainmentOfWord(@Temp File wordsFile) throws IOException {
        WordCounter counter = new WordCounter(wordsFile);
        assertTrue(counter.containsWord("bar")); 
    }
}
