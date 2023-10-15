package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb058MyCalendarTest {

    @Test
    void book() {
        Pb058MyCalendar pb = new Pb058MyCalendar();
        assertTrue(pb.book(10, 20));
        assertFalse(pb.book(15, 25));
        assertTrue(pb.book(20, 30));
    }
}