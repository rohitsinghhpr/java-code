package java8_fetaure.date_api;

import java.time.LocalTime;
import java.time.MonthDay;

public class LT {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.now().getHour());
        System.out.println(MonthDay.now().atYear(2000));
    }
}
