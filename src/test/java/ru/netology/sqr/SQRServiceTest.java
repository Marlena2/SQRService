package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void validData() {
        SQRService service = new SQRService();

        int actual = service.calculateSquare(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sameBorders() {
        SQRService service = new SQRService();

        int actual = service.calculateSquare(100, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void startMoreEnd() {
        SQRService service = new SQRService();

        int actual = service.calculateSquare(200, 100);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void noSquares() {
        SQRService service = new SQRService();

        int actual = service.calculateSquare(226, 255);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void rangeLimit() {
        SQRService service = new SQRService();

        int actual = service.calculateSquare(225, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
}