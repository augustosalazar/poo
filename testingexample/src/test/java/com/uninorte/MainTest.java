package com.uninorte;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class MainTest {
    private Main main;

    @BeforeEach
    public void setUp() {
        main = new Main();
    }

    @Test
    public void testAdd() {
        assertEquals(5, main.add(2, 3));
    }


}
