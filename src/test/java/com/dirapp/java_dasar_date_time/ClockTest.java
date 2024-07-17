package com.dirapp.java_dasar_date_time;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;

public class ClockTest {
  // Class Clock adalah representasi dari tanggal dan waktu mengikuti timezone yang dipilih
  // Class Clock cocok untuk membuat LocalDateTime, ZonedDateTime, Year, dll yang multi timezone


  @Test
  void create() {
    // membuat clock susuai waktu UTC
    Clock clock1 = Clock.systemUTC();
    System.out.println(clock1);

    // membuat clock sesuai timezone sistem
    Clock clock2 = Clock.systemDefaultZone();
    System.out.println(clock2);

    // membuat Clock sesuai dengan timezone tertentu
    Clock clock3 = Clock.system(ZoneId.of("Asia/Jakarta"));
    System.out.println(clock3);
  }


  @Test
  void instant() throws Throwable {
    Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));

    // mendapatkan waktu saat ini dari Clock, akan mengembalikan Instant (akan otomatis dikonvert ke UTC)
    Instant instant1 = clock.instant();
    System.out.println(instant1);

    Thread.sleep(1_000);

    Instant instant2 = clock.instant();
    System.out.println(instant2);
  }


  @Test
  void fromClock() {
    Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));

    // mendapatkan waktu saat ini dari Clock, dalam bentuk Year, LocalTime, dll
    Year year = Year.now(clock);
    System.out.println(year);

    YearMonth yearMonth = YearMonth.now(clock);
    MonthDay monthDay = MonthDay.now(clock);
    LocalTime localTime = LocalTime.now(clock);
    LocalDateTime localDateTime = LocalDateTime.now(clock);
    OffsetTime offsetTime = OffsetTime.now(clock);
    OffsetDateTime offsetDateTime = OffsetDateTime.now(clock);
    ZonedDateTime zonedDateTime = ZonedDateTime.now(clock);

    System.out.println(zonedDateTime);
    System.out.println(offsetDateTime);
    System.out.println(offsetTime);
  }
}
