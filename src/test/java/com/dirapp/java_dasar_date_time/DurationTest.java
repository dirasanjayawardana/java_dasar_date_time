package com.dirapp.java_dasar_date_time;

import java.time.Duration;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class DurationTest {
  // Class Duration adalah representasi dari data durasi waktu (lama sebuah durasi waktu)
  // mempermudah dalam konversi durasi ke waktu yang diinginkan, misalnya hour, minute, second dan nano second
  // untuk durasi dalam skala tanggal, menggunakan Period


  @Test
  void create() {
    // membuat durasi 1o jam
    Duration duration1 = Duration.ofHours(10);
    // membuat durasi 1o menit
    Duration duration2 = Duration.ofMinutes(10);
    // membuat durasi 1o mili detik
    Duration duration3 = Duration.ofMillis(10);

    System.out.println(duration1);
    System.out.println(duration2);
    System.out.println(duration3);
  }


  @Test
  void get() {
    // membuat durasi 50 jam
    Duration duration = Duration.ofHours(50);

    // melakukan konversi durasi 50 jam ke-
    System.out.println(duration.toDays());
    System.out.println(duration.toHours());
    System.out.println(duration.toMinutes());
    System.out.println(duration.toSeconds());
    System.out.println(duration.toMillis());
    System.out.println(duration.toNanos());
  }


  @Test
  void between() {
    // membuat durasi dihitung dari waktu sekarang dan waktu tertentu
    Duration duration1 = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusHours(10));
    System.out.println(duration1.toHours());
    System.out.println(duration1.toMinutes());

    Duration duration2 = Duration.between(LocalDateTime.now().plusHours(10), LocalDateTime.now());
    System.out.println(duration2.toHours());
    System.out.println(duration2.toMinutes());
  }
}
