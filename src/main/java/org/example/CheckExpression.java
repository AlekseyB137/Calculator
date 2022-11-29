package org.example;

import org.example.Convert.Converter;

public class CheckExpression {

    public static int[] checkExpression(String input) {

        Converter converter = new Converter();
        int a = 0;
        int b = 0;
        int isRom = 0;

        String[] numbers;
        numbers = input.split("[-+*/]");

        String firstNumber = numbers[0];
        String secondNumber = numbers[1];

        if (converter.isRoman(firstNumber) == converter.isRoman(secondNumber)) {
            boolean isRoman = converter.isRoman(firstNumber);

            if (isRoman) {
                a = converter.romanToInt(firstNumber);
                b = converter.romanToInt(secondNumber);
                isRom = 1;
            } else {
                a = Integer.parseInt(firstNumber);
                b = Integer.parseInt(secondNumber);
            }
        }
        try {
            if (a < 1 || a > 10 || b < 1 || b > 10 || numbers.length != 2
                      || converter.isRoman(firstNumber) != converter.isRoman(secondNumber)
                      || ((a - b) < 0 && isRom == 1)) throw new Exception("Неверное выражение");
        } catch (Exception e) {
            throw new RuntimeException("Ошибка в выражении");
        }
        return new int[]{a, b, isRom};
    }
}
