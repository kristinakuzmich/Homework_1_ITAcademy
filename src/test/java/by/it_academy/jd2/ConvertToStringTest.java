package by.it_academy.jd2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Класс тестирования преобразования чисел в строки
 * @author Kristina
 * @version 3.9.9
 */
public class ConvertToStringTest {
    @Test
    public void testToStringNumber(){
        ConvertToString conv = new ConvertToString();
        Assertions.assertEquals(conv.numberToString(223), "двести двадцать три");
    }

    @Test
    public void testToStringDouble(){
        ConvertToString conv = new ConvertToString();
        Assertions.assertEquals(conv.doubleToString(223.1599999), "двести двадцать три целых пятнадцать сотых");
    }
}
