package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testSaudacao() {
        assertEquals("Olá, GitHub Actions!", Main.saudacao());
    }
}