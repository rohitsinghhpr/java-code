package java8_fetaure.date_api;

import java.time.LocalDate;

public class LD {
  public static void main(String[] args) {
    // LocalDate class is an immutable class that represents Date
    System.out.println(LocalDate.now()); 
    // yesterday 
    System.out.println(LocalDate.now().minusDays(1));
    // tomorrow
    System.out.println(LocalDate.now().plusDays(1));
    // isLeapYear 366 days
    System.out.println(LocalDate.now().isLeapYear());
    // more methods
  }   
}
