package ru.netology.javaqa.homework.services;

public class SQRService {

    public long calcSqr(int rangeStart, int rangeFinish) {

        int resultSqr = 0;
        int x; //счетчик для перебора чисел от 10 до 99

        for (x = 10; x >= 10 && x <= 99; x++) {
            if (rangeStart <= (x * x) && (x * x) <= rangeFinish) {
                resultSqr++;
                continue;
            }
            if ((x * x) > rangeFinish) {
                break;
            }
        }
        return resultSqr;
    }
}

