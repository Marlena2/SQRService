package ru.netology.sqr;

public class SQRService {
     public int calculateSquare(int lowerdate, int highdate) {
         int counter = 0;
         for (int i = 10; i <= 99; i++) {
             if (i * i >= lowerdate) {
                 if (i * i <= highdate) {
                     counter++;
                 }
             }
         }
         return counter;
     }
}

