package org.example;

import org.example.Convert.Converter;

import static org.example.CheckAction.checkAction;
import static org.example.CheckExpression.checkExpression;

public class Main {

    public static String Calc(String input) {

        Converter converter = new Converter();
        String action = checkAction(input);
        int[] numbers = checkExpression(input);

        int firstNumber = numbers[0];
        int secondNumber = numbers[1];
        int isRom = numbers[2];
        int result = 0;

        switch (action) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
            default:
                break;
        }

        if(isRom == 1){
            return converter.intToRoman(result);
        }
        return String.valueOf(result);
    }
}