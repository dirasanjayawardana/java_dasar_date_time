package com.dirapp.java_dasar_date_time;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

import org.junit.jupiter.api.Test;

public class YearTest {
  // pada java.time terdapat class Year, YearMonth, dan MonthDay
  // Year digunakan untuk tanggal yang hanya berisi tahun, YearMonth berisi tahun dan bulan, MonthDay berisi bulan dan hari
  // format defaultnya adalah yyyy, yyyy-MM, --MM-dd 


  @Test
  void create() {
    // mendapatkan tahun saat ini
    Year year1 = Year.now();
    // menetapkan tahun tertentu
    Year year2 = Year.of(1980);
    // menetapkan tahun dari String menjadi Year, seusai dengan formatnya
    Year year3 = Year.parse("2020");

    System.out.println(year1);
    System.out.println(year2);
    System.out.println(year3);

    YearMonth yearMonth1 = YearMonth.now();
    YearMonth yearMonth2 = YearMonth.of(1980, Month.JUNE);
    YearMonth yearMonth3 = YearMonth.parse("2020-09");

    System.out.println(yearMonth1);
    System.out.println(yearMonth2);
    System.out.println(yearMonth3);

    MonthDay monthDay1 = MonthDay.now();
    MonthDay monthDay2 = MonthDay.of(Month.DECEMBER, 18);
    MonthDay monthDay3 = MonthDay.parse("--10-09");

    System.out.println(monthDay1);
    System.out.println(monthDay2);
    System.out.println(monthDay3);
  }


  @Test
  void name() {
    Year year = Year.now();
    System.out.println(year);

    // konversi dari Year ke LocalDate, butuh menambahkan bulan dan tanggal
    LocalDate localDate = year.atMonth(Month.DECEMBER).atDay(19);
    System.out.println(localDate);

    // konversi dari LocalDate ke Year
    MonthDay monthDay = MonthDay.from(localDate);
    System.out.println(monthDay);
  }


  @Test
  void get() {
    Year year = Year.now();
    YearMonth yearMonth = YearMonth.now();
    MonthDay monthDay = MonthDay.now();

    System.out.println(year.getValue());
    System.out.println(yearMonth.getYear());
    System.out.println(yearMonth.getMonth());
    System.out.println(monthDay.getMonth());
    System.out.println(monthDay.getDayOfMonth());
  }
}
