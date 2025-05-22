package by.it_academy.jd2;

import com.ibm.icu.text.RuleBasedNumberFormat;

/**
 * Класс для преобразования чисел в строку
 * @author Kristina
 * @version 3.9.9
 */
public class ConvertToString {

    public static RuleBasedNumberFormat nf = new RuleBasedNumberFormat(RuleBasedNumberFormat.SPELLOUT);

    /**
     * Преобразовывает число в формат текста
     * @param number
     * @return текстовая запись числа
     */
    public static String numberToString(int number) {
        System.out.println(nf.format(number));
        return nf.format(number);
    }

    /**
     * Преобразовывает вещественное число в формат текста
     * @param number
     * @return текстовая запись числа
     */
    public static String doubleToString(double number) {
        double result = Math.floor(number * 100) / 100;
        System.out.println(nf.format(result));
        return nf.format(result);
    }
}
