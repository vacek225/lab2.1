package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class MainTest {

    @Test
    void testButton() {
        Button button = new Button();
        assertEquals(1, button.click());
        assertEquals(2, button.click());
    }

    @Test
    void testBalance() {
        Balance balance = new Balance();
        assertEquals("=", balance.result());

        balance.addLeft(10);
        assertEquals("L", balance.result());

        balance.addRight(15);
        assertEquals("R", balance.result());

        balance.addLeft(5);
        assertEquals("=", balance.result());
    }

    @Test
    void testBell() {
        Bell bell = new Bell();
        assertEquals("ding", bell.sound());
        assertEquals("dong", bell.sound());
        assertEquals("ding", bell.sound());
    }

    @Test
    void testOddEvenSeparator() {
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(2);
        separator.addNumber(5);
        separator.addNumber(10);

        List<Integer> evens = separator.even();
        List<Integer> odds = separator.odd();

        assertEquals(List.of(2, 10), evens);
        assertEquals(List.of(5), odds);
    }

    @Test
    void testTable() {
        Table table = new Table(2, 2);
        table.setValue(0, 0, 10);
        table.setValue(1, 1, 20);

        assertEquals(10, table.getValue(0, 0));
        assertEquals(20, table.getValue(1, 1));
        assertEquals(2, table.rows());
        assertEquals(2, table.cols());
        assertEquals(7.5, table.average());
    }
}