package docs;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Junit5Annotations {

    @BeforeAll
    static void setup() {
        System.out.println("Setup here");
    }

    @BeforeEach
    void before() {
        System.out.println("Before each here");
    }

    @Test
    @DisplayName("Some test")
    void someTest() {
        System.out.println("SomeTest here");
        assertTrue(true);
    }

    @Test
    @DisplayName("Another test")
    void anotherTest() {
        System.out.println("Anothertest here");
        assertTrue(true);
    }
    @AfterEach
    void after() {
        System.out.println("After each");
    }
//aaa
    @AfterAll
    static void shutDown() {
        System.out.println("Shutdown here");
    }
}
