package com.dirapp.java_dasar_date_time;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class DateTest {

  // pada java.util.Date banyak method yg sudah deprecated
  // hanya new Date() dan new Date(long date) yang belum deprecated
  
  @Test
  void create() {

    // mendapatkan waktu sekarang
    var date1 = new Date();

    // mendapatkan waktu sekarang
    var date2 = new Date(System.currentTimeMillis());

    // mendapatkan waktu sesuai waktu UNIX epoch
    var date3 = new Date(339958800000L);

    System.out.println(date1);
    System.out.println(date2);
    System.out.println(date3);

  }
}
