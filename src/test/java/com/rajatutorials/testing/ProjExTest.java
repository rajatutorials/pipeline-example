package com.rajatutorials.testing;

import org.junit.jupiter.api.*;

class ProjExTest {

    public ProjEx fB;

    @BeforeEach
    public void setUp() {
        fB = new ProjEx();
    }

    @DisplayName("Play ProjEx with number = 1")
    @Test
    public void testNumber() {
        String projEx = fB.play(1);
        Assertions.assertEquals(projEx, "1");
    }

    @DisplayName("Play ProjEx with number = 3")
    @Test
    public void testEx() {
        String projEx = fB.play(3);
        Assertions.assertEquals(projEx, "Proj");
    }

    @DisplayName("Play ProjEx with number = 5")
    @Test
    public void testEx() {
        String projEx = fB.play(5);
        Assertions.assertEquals(projEx, "Ex");
    }

    @DisplayName("Don't Play ProjEx with number = 0")
    @Test
    public void testZero() {

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> fB.play(0));
    }

    @AfterEach
    public void tearDown() {
        fB = null;
    }

}