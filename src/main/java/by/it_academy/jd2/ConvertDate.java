package by.it_academy.jd2;

/**
 * Класс для преобразования даты и времени
 * @author Kristina
 * @version 3.9.9
 */
public class ConvertDate {

    static String text = "";

    /**
     * Считает количество прошедших недель по переданному числу дней
     * @param day
     * @return количество недель
     */
    public static String toWeek(int day) {
        int week = day / 7;
        System.out.println(week + getStringWeek(week));
        return week + getStringWeek(week);
    }

    /**
     * Конвертируют переданные миллисекунды в количество часов, минут, секунд и миллисекунд
     * @param millisecond,shortFormat
     * @return текстовая запись времени
     */
    public static String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat) {
        long hours = millisecond / 3600000;
        long minutes = (millisecond / (1000 * 60)) % 60;
        long seconds = (millisecond / 1000) % 60;
        long milliseconds = millisecond % 1000;

        if (shortFormat) {
            String time = String.format("%02d:%02d:%02d.%03d", hours, minutes, seconds, milliseconds);
            System.out.println(time);
            return time;
        } else {
            String time = String.format("%d" + getStringHour(hours)
                    + " %d" + getStringMinute(minutes)
                    + " %d" + getStringSecond(seconds)
                    + " %d" + getStringMillisecond(milliseconds), hours, minutes, seconds, milliseconds);
            System.out.println(time);
            return time;
        }
    }

    /**
     * Отображает число недели в строчном виде
     * @param weeks
     * @return текстовая запись недели
     */
    public static String getStringWeek(int weeks) {
        switch (weeks % 10) {
            case 0, 5, 6, 7, 8, 9:
                text = " недель";
                break;
            case 1:
                text = " неделя";
                break;
            case 2, 3, 4:
                text = " недели";
                break;
        }
        return text;
    }

    /**
     * Отображает число часа в строчном виде
     * @param hours
     * @return текстовая запись часа
     */
    public static String getStringHour(long hours) {
        switch (Math.toIntExact(hours % 10)) {
            case 0, 5, 6, 7, 8, 9:
                text = " часов";
                break;
            case 1:
                text = " час";
                break;
            case 2, 3, 4:
                text = " часа";
                break;
        }
        return text;
    }

    /**
     * Отображает число минуты в строчном виде
     * @param minutes
     * @return текстовая запись минуты
     */
    public static String getStringMinute(long minutes) {
        switch (Math.toIntExact(minutes % 10)) {
            case 0, 5, 6, 7, 8, 9:
                text = " минут";
                break;
            case 1:
                text = " минута";
                break;
            case 2, 3, 4:
                text = " минуты";
                break;
        }
        return text;
    }

    /**
     * Отображает число секунды в строчном виде
     * @param seconds
     * @return текстовая запись секунды
     */
    public static String getStringSecond(long seconds) {
        switch (Math.toIntExact(seconds % 10)) {
            case 0, 5, 6, 7, 8, 9:
                text = " секунд";
                break;
            case 1:
                text = " секунда";
                break;
            case 2, 3, 4:
                text = " секунды";
                break;
        }
        return text;
    }

    /**
     * Отображает число миллисекунды в строчном виде
     * @param milliseconds
     * @return текстовая запись миллисекунды
     */
    public static String getStringMillisecond(long milliseconds) {
        switch (Math.toIntExact(milliseconds % 10)) {
            case 0, 5, 6, 7, 8, 9:
                text = " миллисекунд";
                break;
            case 1:
                text = " миллисекунда";
                break;
            case 2, 3, 4:
                text = " миллисекунды";
                break;
        }
        return text;
    }
}
