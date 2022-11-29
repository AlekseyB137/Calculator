package org.example;

public class CheckAction {

    public static String checkAction(String input) {

        String[] actions = {"+", "-", "/", "*"};
        int actionIndex = -1;
        for (int i = 0; i < actions.length; i++) {
            if (input.contains(actions[i])) {
                actionIndex = i;
                break;
            }
        }

        try {
            if (actionIndex == -1)
                throw new Exception("Ошибка в выражении");
        } catch (Exception e) {
            throw new RuntimeException("Ошибка в выражении");
        }

        return actions[actionIndex];
    }
}
