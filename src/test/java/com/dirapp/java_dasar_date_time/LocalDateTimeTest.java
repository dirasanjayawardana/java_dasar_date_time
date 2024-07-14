package com.dirapp.java_dasar_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

import org.junit.jupiter.api.Test;

public class LocalDateTimeTest {
  // LocalDateTime merupakan representasi tanggal dan waktu, mirip seperti class Date
  // LocalDateTime juga immutable, jika diubah maka akan menghasilkan object baru
  // LocalDateTime mirip seperti gabungan antara LocalDate dan LocalTime
  // format defaultnya adalah yyyy-MM-ddTHH:mm:ss.nano


  @Test
  void create() {
    // mendapatkan tanggal dan waktu saat ini
    LocalDateTime localDateTime1 = LocalDateTime.now();

    // menetapkan tanggal dan waktu tertentu
    LocalDateTime localDateTime2 = LocalDateTime.of(1980, Month.FEBRUARY, 8, 10, 9, 10, 456000000);

    // menetapkan tanggal dan waktu dari String menjadi LocalDateTime, seusai dengan formatnya
    LocalDateTime localDateTime3 = LocalDateTime.parse("1980-01-08T10:09:10.456");

    System.out.println(localDateTime1);
    System.out.println(localDateTime2);
    System.out.println(localDateTime3);
  }


  @Test
  void with() {
    LocalDateTime localDateTime1 = LocalDateTime.now();

    // melakukan perubahan tanggal dan waktu, bisa chaining beberapa method with
    // ketika melakukan perubahan pada LocalDateTime, akan menghasilkan object yang baru
    LocalDateTime localDateTime2 = localDateTime1.withYear(1980).withMonth(1);
    LocalDateTime localDateTime3 = localDateTime1.withYear(1988).withHour(9);

    System.out.println(localDateTime1);
    System.out.println(localDateTime2);
    System.out.println(localDateTime3);
  }


  @Test
  void modify() {
    LocalDateTime localDateTime1 = LocalDateTime.now();

    // melakukan manipulasi tanggal dan waktu, bisa chaining beberapa method plus
    // ketika melakukan manipulasi pada LocalDateTime, akan menghasilkan object yang baru
    LocalDateTime localDateTime2 = localDateTime1.plusYears(5).minusHours(5);
    LocalDateTime localDateTime3 = localDateTime1.minusYears(5).plusHours(5);

    System.out.println(localDateTime1);
    System.out.println(localDateTime2);
    System.out.println(localDateTime3);
  }


  @Test
  void get() {
    LocalDateTime localDateTime = LocalDateTime.now();

    System.out.println(localDateTime.getYear());
    System.out.println(localDateTime.getMonth());
    System.out.println(localDateTime.getDayOfMonth());
    System.out.println(localDateTime.getHour());
    System.out.println(localDateTime.getMinute());
    System.out.println(localDateTime.getSecond());
    System.out.println(localDateTime.getNano());
  }


  @Test
  void date() {
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);

    // melakukan konversi LocalDateTime ke LocalDate
    LocalDate localDate = localDateTime.toLocalDate();
    System.out.println(localDate);

    // melakukan koncersi LocalDate ke LocalDateTime, butuh menambahkan wakutnya di parameter
    LocalDateTime result = localDate.atTime(10, 10, 10, 10);
    System.out.println(result);
  }


  @Test
  void time() {
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);

    // melakukan konversi LocalDateTime ke LocalTime
    LocalTime localTime = localDateTime.toLocalTime();
    System.out.println(localTime);

    // melakukan koncersi LocalDate ke LocalDateTime, butuh menambahkan LocalDate di parameter
    LocalDateTime result = localTime.atDate(LocalDate.now());
    System.out.println(result);
  }
}
