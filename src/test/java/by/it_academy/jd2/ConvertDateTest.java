package by.it_academy.jd2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Класс тестирования преобразования даты и времени
 * @author Kristina
 * @version 3.9.9
 */
public class ConvertDateTest {
    @Test
    public void testToWeek0(){
        Assertions.assertEquals(ConvertDate.toWeek(5), "0 недель");
    }

    @Test
    public void testToWeek1(){
        ConvertDate conv = new ConvertDate();
        Assertions.assertEquals(conv.toWeek(7), "1 неделя");
    }

    @Test
    public void testToWeek2(){
        ConvertDate conv = new ConvertDate();
        Assertions.assertEquals(conv.toWeek(14), "2 недели");
    }

    @Test
    public void testToWeek25(){
        ConvertDate conv = new ConvertDate();
        Assertions.assertEquals(conv.toWeek(177), "25 недель");
    }

    @Test
    public void testToStringTimeTrue(){
        ConvertDate conv = new ConvertDate();
        Assertions.assertEquals(conv.toHoursMinuteSecondMillisecond(7789001, true), "02:09:49.001");
    }

    @Test
    public void testToStringTimeFalse1(){
        ConvertDate conv = new ConvertDate();
        Assertions.assertEquals(conv.toHoursMinuteSecondMillisecond(7789001, false), "2 часа 9 минут 49 секунд 1 миллисекунда");
    }

    @Test
    public void testToStringTimeFalse2(){
        ConvertDate conv = new ConvertDate();
        Assertions.assertEquals(conv.toHoursMinuteSecondMillisecond(3661001, false), "1 час 1 минута 1 секунда 1 миллисекунда");
    }

    @Test
    public void testToStringTimeFalse3(){
        ConvertDate conv = new ConvertDate();
        Assertions.assertEquals(conv.toHoursMinuteSecondMillisecond(1564565, false), "0 часов 26 минут 4 секунды 565 миллисекунд");
    }

    @Test
    public void testToStringTimeFalse4(){
        ConvertDate conv = new ConvertDate();
        Assertions.assertEquals(conv.toHoursMinuteSecondMillisecond(21723000, false), "6 часов 2 минуты 3 секунды 0 миллисекунд");
    }

    @Test
    public void testToStringTimeFalse5(){
        ConvertDate conv = new ConvertDate();
        Assertions.assertEquals(conv.toHoursMinuteSecondMillisecond(14825002, false), "4 часа 7 минут 5 секунд 2 миллисекунды");
    }
}
