import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.Main.Calc;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestListCalc {

    @Test
    @DisplayName("Пустая строка")
    void test001EmptyInput(){
        Assertions.assertThrows(RuntimeException.class, () -> Calc(""));
    }

    @Test
    @DisplayName("Тест суммы арабских чисел")
    void test002SumTest(){
        assertEquals("20",Calc("10+10"));
    }

    @Test
    @DisplayName("Тест вычитания арабских чисел")
    void test003SubTest(){
        assertEquals("5",Calc("10-5"));
    }

    @Test
    @DisplayName("Тест умножения арабских чисел")
    void test004MulTest(){
        assertEquals("30",Calc("6*5"));
    }

    @Test
    @DisplayName("Тест деления арабских чисел")
    void test005DivTest(){
        assertEquals("1",Calc("10/10"));
    }

    @Test
    @DisplayName("Тест суммы римских чисел")
    void test006SumTest(){
        assertEquals("XX",Calc("X+X"));
    }

    @Test
    @DisplayName("Тест вычитания римских чисел")
    void test007SubTest(){
        assertEquals("V",Calc("X-V"));
    }

    @Test
    @DisplayName("Тест умножения римских чисел")
    void test008MulTest(){
        assertEquals("XXX",Calc("VI*V"));
    }

    @Test
    @DisplayName("Тест деления римских чисел")
    void test009DivTest(){
        assertEquals("I",Calc("X/X"));
    }

    @Test
    @DisplayName("Тест неверной операции")
    void test010BadAction(){
        Assertions.assertThrows(RuntimeException.class, () -> Calc("5%5"));
    }

    @Test
    @DisplayName("Больше двух операндов")
    void test011MoreThanTwoOperations(){
        Assertions.assertThrows(RuntimeException.class, () -> Calc("1+2+3"));
    }

    @Test
    @DisplayName("Арабское число, больше 10")
    void test012ArabianMore10(){
        Assertions.assertThrows(RuntimeException.class, () -> Calc("11+5"));
    }

    @Test
    @DisplayName("Римское число, больше 10")
    void test013RomanMore10(){
        Assertions.assertThrows(RuntimeException.class, () -> Calc("XXI+V"));
    }

    @Test
    @DisplayName("Разные форматы чисел")
    void test014DifferentTypes(){
        Assertions.assertThrows(RuntimeException.class, () -> Calc("5+V"));
    }

    @Test
    @DisplayName("Проверка на отрицательный результат при вычитании в римской системе")
    void test015RomanSub(){
        Assertions.assertThrows(RuntimeException.class, () -> Calc("I-V"));
    }

    @Test
    @DisplayName("Проверка на ноль при вычитании в римской системе")
    void test016RomanSub(){
        Assertions.assertThrows(RuntimeException.class, () -> Calc("V-V"));
    }

    @Test
    @DisplayName("Одно число на входе")
    void test017OneOperand(){
        Assertions.assertThrows(RuntimeException.class, () -> Calc("1"));
    }

    @Test
    @DisplayName("Деление с остатком для арабских чисел")
    void test018DivWithRemains(){
        assertEquals("3",Calc("10/3"));
    }

    @Test
    @DisplayName("Деление с остатком для римских чисел")
    void test019DivWithRemains(){
        assertEquals("II",Calc("V/II"));
    }
}
