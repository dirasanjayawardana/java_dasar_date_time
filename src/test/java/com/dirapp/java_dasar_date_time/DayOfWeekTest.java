package com.dirapp.java_dasar_date_time;

import java.time.DayOfWeek;

import org.junit.jupiter.api.Test;

public class DayOfWeekTest {
  // DayOfWeek merupakan implementasi dari data hari
  // DayOfWeek berupa Enum

  @Test
  void create() {
    DayOfWeek dayOfWeek1 = DayOfWeek.SUNDAY;
    DayOfWeek dayOfWeek2 = dayOfWeek1.plus(5);
    DayOfWeek dayOfWeek3 = dayOfWeek1.plus(1);

    System.out.println(dayOfWeek1);
    System.out.println(dayOfWeek2);
    System.out.println(dayOfWeek3);
  }
}
