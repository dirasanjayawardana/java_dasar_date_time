package com.dirapp.java_dasar_date_time;

import java.util.Arrays;
import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;

import org.junit.jupiter.api.Test;

public class TimeZoneTest {
  // Class TimeZone merupakan representasi dari time zone
  // secara default ketika membuat object Calendar, timezone nya mengikuti timezone sistem operasi
  // TimeZone.getDefault() --> untuk mengetahui default timezone
  // TimeZone.getTimeZone("Zone ID") --> untuk membuat object TimeZone sesuai dengan timezone id nya
  // TimeZone.getAvailableIDs() --> untuk mengetahui semua timezone id yang didukung oleh java


  @Test
  void create() {
    TimeZone timeZoneDefault = TimeZone.getDefault();
    System.out.println(timeZoneDefault);

    TimeZone timeZoneGMT = TimeZone.getTimeZone("GMT");
    System.out.println(timeZoneGMT);
    
    TimeZone timeZoneIndonesia = TimeZone.getTimeZone("Asia/Jakarta");
    System.out.println(timeZoneIndonesia);

    String[] availableIDs = TimeZone.getAvailableIDs();
    Arrays.asList(availableIDs).forEach(zoneId -> System.out.println(zoneId));
  }


  @Test
  void date() {
    // ketika membuat Date dari java.util.Date timezone nya otomatis timezone sistem operasi dan tidak bisa diubah

    Date date = new Date();
    System.out.println(date.toString());
    System.out.println(date.toGMTString());
  }


  @Test
  void calendar() {
    // jika menggunakan Calendar, bisa menentukan ingin memakai timezone mana
    // dengan membuat object TimeZone pada parameter method Calendar.getInstance()
    // atau dengan menggunakan method setTimeZone()
  
    Calendar calendarJakarta = Calendar.getInstance(TimeZone.getTimeZone("Asia/Jakarta"));
    Calendar calendarGMT = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    System.out.println(calendarJakarta.get(Calendar.HOUR_OF_DAY));
    System.out.println(calendarGMT.get(Calendar.HOUR_OF_DAY));

    calendarJakarta.setTimeZone(TimeZone.getTimeZone("GMT"));
    System.out.println(calendarJakarta.get(Calendar.HOUR_OF_DAY));
  }
}
