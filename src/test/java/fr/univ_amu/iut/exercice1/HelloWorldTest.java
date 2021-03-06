package fr.univ_amu.iut.exercice1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {


    @Test
    public void test_hello_with_empty_string_is_compared_by_value() {
        assertEquals("Hello, World!", HelloWorld.hello(new String()));
    }

    @Test
    public void test_hello_with_no_name_should_return_helloworld() {
        assertEquals("Hello, World!", HelloWorld.hello(null));
    }

    @Test
    public void test_hello_should_return_hello_alice_when_alice() {
        assertEquals("Hello, Alice!", HelloWorld.hello("Alice"));
    }

    @Test
    public void test_hello_should_return_hello_bob_when_bob() {
        assertEquals("Hello, Bob!", HelloWorld.hello("Bob"));
    }
}
