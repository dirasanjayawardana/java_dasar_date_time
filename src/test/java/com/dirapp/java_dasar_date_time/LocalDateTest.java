package com.dirapp.java_dasar_date_time;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

public class LocalDateTest {
  // LocalDate merupakan representasi untuk tipe data tanggal (tanpa waktu)
  // default formatnya yyyy-MM-dd


  @Test
  void create() {
    // mendapatkan tanggal saat ini
    LocalDate localDate1 = LocalDate.now();

    // menetapkan tanggal tertentu
    LocalDate localDate2 = LocalDate.of(1980, Month.JANUARY, 10);

    // menetapkan tanggal dari String menjadi LocalDate, seusai dengan formatnya
    LocalDate localDate3 = LocalDate.parse("1980-02-10");

    System.out.println(localDate1);
    System.out.println(localDate2);
    System.out.println(localDate3);
  }


  @Test
  void with() {
    LocalDate localDate1 = LocalDate.now();

    // melakukan perubahan tanggal, bisa chaining beberapa method with
    // ketika melakukan perubahan pada LocalDate, akan menghasilkan object yang baru
    LocalDate localDate2 = localDate1.withYear(1980);
    LocalDate localDate3 = localDate1.withYear(1980).withMonth(1);

    System.out.println(localDate1);
    System.out.println(localDate2);
    System.out.println(localDate3);
  }


  @Test
  void modify() {
    LocalDate localDate1 = LocalDate.now();

    // melakukan manipulasi tanggal, bisa chaining beberapa method plus
    // ketika melakukan manipulasi pada LocalDate, akan menghasilkan object yang baru
    LocalDate localDate2 = localDate1.plusYears(10);
    LocalDate localDate3 = localDate1.minusMonths(10);

    System.out.println(localDate1);
    System.out.println(localDate2);
    System.out.println(localDate3);
  }


  @Test
  void get() {
    LocalDate localDate1 = LocalDate.now();

    System.out.println(localDate1.getYear());
    System.out.println(localDate1.getMonth());
    System.out.println(localDate1.getMonthValue());
    System.out.println(localDate1.getDayOfMonth());
    System.out.println(localDate1.getDayOfWeek());
    System.out.println(localDate1.getDayOfYear());
  }
}
