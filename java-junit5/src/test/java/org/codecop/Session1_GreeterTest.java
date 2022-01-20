package org.codecop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Session 1: GreeterTest - Your first tests.
 */
class Session1_GreeterTest {

    // TODO We will add the proper assertions together.
    
    @Test
    void shouldReturnHelloName() {
        Greeter greeter = new Greeter();
        // TODO Check that "Hello Peter", greeter.greet("Peter").
        Assertions.assertEquals(greeter.greet("Peter"), "Hello Peter");
    }

    @Test
    @DisplayName("should return 'Hello' for 'null'")
    void shouldReturnHelloForNull() {
        Greeter greeter = new Greeter();
        // TODO Check that "Hello", greeter.greet(null).
        Assertions.assertEquals(greeter.greet(null), "Hello");
    }

    @Test
    void shouldIgnoreWhitespace() {
        Greeter greeter = new Greeter();
        // TODO Check that "Hello Peter", greeter.greet(" Peter ").
        Assertions.assertEquals(greeter.greet(" Peter "), "Hello Peter");
    }
}
