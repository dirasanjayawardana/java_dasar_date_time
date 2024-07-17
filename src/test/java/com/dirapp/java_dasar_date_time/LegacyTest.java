package com.dirapp.java_dasar_date_time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.junit.jupiter.api.Test;

public class LegacyTest {
  // Melakukan konversi Date & Time Legacy dengan Date & Time API yang baru
  

  @Test
  void fromLegacy() {
    // dirubah ke Instant terlebih dahulu
    // setelah menjadi Instant bisa dilakukan konversi ke Date & Time API yang lain

    Date date = new Date();
    System.out.println(date);

    Instant instant = date.toInstant();
    System.out.println(instant);

    Calendar calendar = Calendar.getInstance();
    System.out.println(calendar);
    Instant instant1 = calendar.toInstant();
    System.out.println(instant1);

    TimeZone timeZone = TimeZone.getDefault();
    System.out.println(timeZone);
    ZoneId zoneId = timeZone.toZoneId();
    System.out.println(zoneId);
  }


  @Test
  void toLegacy() {
    ZonedDateTime zonedDateTime = ZonedDateTime.now();

    // untuk merubah ke Date diubah ke Instant terlebih dahulu, lalu menggunakan method .from(Instant)
    Date date = Date.from(zonedDateTime.toInstant());

    // untuk mengubah ke Calendar, harus diubah ke ZonedDateTime terlebih dahulu
    Calendar calendar = GregorianCalendar.from(zonedDateTime);
    
    // untuk mengubah ke TimeZone, harus diubah ke ZoneId terlebih dahulu
    ZoneId zoneId = ZoneId.systemDefault();
    TimeZone timeZone = TimeZone.getTimeZone(zoneId);
  }
}
