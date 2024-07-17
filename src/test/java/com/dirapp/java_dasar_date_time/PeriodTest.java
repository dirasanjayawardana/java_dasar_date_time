package com.dirapp.java_dasar_date_time;

import java.time.LocalDate;
import java.time.Period;

import org.junit.jupiter.api.Test;

public class PeriodTest {
  // Period mirip seperti Duration, bedanya pada Period adalah periode untuk tanggal
  // cara penggunaannya sama seperti Duration


  @Test
  void create() {
    // membuat periode 1o hari
    Period period1 = Period.ofDays(10);
    // membuat periode 1o minggu
    Period period2 = Period.ofWeeks(10);
    // membuat periode 1o bulan
    Period period3 = Period.ofMonths(10);
    // membuat periode 1o tahun
    Period period4 = Period.ofYears(10);
    // membuat periode 10 tahun, 10 bulan, 10 hari
    Period period5 = Period.of(10, 10, 10);

    System.out.println(period1);
    System.out.println(period2);
    System.out.println(period3);
    System.out.println(period4);
    System.out.println(period5);
  }


  @Test
  void get() {
    // membuat periode 10 tahun, 10 bulan, 10 hari
    Period period = Period.of(10, 10, 10);

    // mendapatkan data periode
    System.out.println(period.getYears());
    System.out.println(period.getMonths());
    System.out.println(period.getDays());
  }


  @Test
  void between() {
    // membuat periode dihitung dari waktu sekarang dan waktu tertentu
    Period period = Period.between(
        LocalDate.of(1999, 8, 24),
        LocalDate.now()
    );

    System.out.println(period.getYears());
    System.out.println(period.getMonths());
    System.out.println(period.getDays());
  }
}
