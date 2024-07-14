package com.dirapp.java_dasar_date_time;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

public class LocalTimeTest {
  // LocalTime merupakan representasi untuk tipe data waktu (tanpa tanggal)
  // LocalTime juga immutable, jika diubah maka akan menghasilkan object baru
  // format standard LocalTime adalah HH:mm:ss.nano, dimana second dan nano second nya optional

  @Test
  void create() {
    // mendapatkan waktu saat ini
    LocalTime localTime1 = LocalTime.now();
    
    // menetapkan waktu tertentu
    LocalTime localTime2 = LocalTime.of(10, 10, 10);
    
    // menetapkan waktu dari String menjadi LocalTime, seusai dengan formatnya
    LocalTime localTime3 = LocalTime.parse("08:08");

    System.out.println(localTime1);
    System.out.println(localTime2);
    System.out.println(localTime3);
  }


  @Test
  void change() {
    LocalTime localTime1 = LocalTime.now();

    // melakukan perubahan waktu, bisa chaining beberapa method with
    // ketika melakukan perubahan pada LocalTime, akan menghasilkan object yang baru
    LocalTime localTime2 = localTime1.withHour(10);
    LocalTime localTime3 = localTime1.withHour(5).withMinute(10).withSecond(0);

    System.out.println(localTime1);
    System.out.println(localTime2);
    System.out.println(localTime3);
  }


  @Test
  void modify() {
    LocalTime localTime1 = LocalTime.now();

    // melakukan manipulasi waktu, bisa chaining beberapa method plus
    // ketika melakukan manipulasi pada LocalTime, akan menghasilkan object yang baru
    LocalTime localTime2 = localTime1.plusHours(10);
    LocalTime localTime3 = localTime1.plusHours(5).minusMinutes(10).minusSeconds(5);

    System.out.println(localTime1);
    System.out.println(localTime2);
    System.out.println(localTime3);
  }


  @Test
  void get() {
    LocalTime localTime = LocalTime.now();

    System.out.println(localTime.getHour());
    System.out.println(localTime.getMinute());
    System.out.println(localTime.getSecond());
    System.out.println(localTime.getNano());
  }
}
