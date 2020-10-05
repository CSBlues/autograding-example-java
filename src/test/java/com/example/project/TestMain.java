package com.example.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestMain {

   @Test
   public void testLucky7Diff()
   {
     assertTrue(Main.lucky7(2, 9));
   }
    @Test
    public void testLucky7Sum()
    {
        assertTrue(Main.lucky7(2, 5));
    }
    @Test
    public void testLucky7()
    {
        assertTrue(Main.lucky7(2, 7));
    }
    @Test
    public void testLucky7False()
    {
        assertFalse(Main.lucky7(2, 8));
    }
    @Test
    public void mult3()
    {
        assertTrue(Main.mult35(309));
    }
    @Test
    public void mult5()
    {
        assertTrue(Main.mult35(80));
    }
    @Test
    public void testMmult35()
    {
        assertFalse(Main.mult35(15));
    }
    @Test
    public void testMult35False()
    {
        assertFalse(Main.mult35(19));
    }
    @Test
    public void testBlackjackHighest()
    {
        int test1 = Main.blackjack(5, 21);
        assertEquals(21, test1, "Expected: 21. Received: " + test1);
    }
    @Test
    public void testBlackjackHighestNotOver()
    {
        int test1 = Main.blackjack(19, 22);
        assertEquals(19, test1, "Expected: 19. Received: " + test1 + "22 is over 21 so 19 is the highest.");
    }
    @Test
    public void testBlackjackBothOver()
    {
        int test1 = Main.blackjack(22, 24);
        assertEquals(0, test1, "Expected: 0. Received: " + test1);
    }
}
