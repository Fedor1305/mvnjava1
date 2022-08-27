package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
    public void Test1() {
        SQRService service = new SQRService();

        int actual = service.calculate(100, 120);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        SQRService service = new SQRService();

        int actual = service.calculate(100, 130);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        SQRService service = new SQRService();

        int actual = service.calculate(100, 150);
        int expected = 3;

        assertEquals(expected, actual);
    }
}