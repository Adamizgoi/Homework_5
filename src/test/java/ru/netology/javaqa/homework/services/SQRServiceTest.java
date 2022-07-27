package ru.netology.javaqa.homework.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")

    public void sqrAmountAreCorrect(int expected, int startRange, int finishRange) {
        SQRService service = new SQRService();
        long actual = service.calcSqr(startRange, finishRange);
        assertEquals(expected, actual);
    }
}
