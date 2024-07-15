package com.dirapp.java_dasar_date_time;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class ZoneTest {

  // ZoneId mirip seperti TimeZone, yang merupakan representasi timezone id
  // ZoneId.systemDefault() --> mendapatkan time zone default
  // ZoneId.of("Zone Id") --> membuat zone id dengan Zone Id yang sudah ada
  // ZoneId.getAvailableZoneIds() --> mendapatkan zone id yang tersedia

  // ZoneOffset merupakan representasi timezone dengan offset dari timezone Greenwich/UTC, misalnya +07:00
  // ZoneOffset adalah turunan dari ZoneId


  @Test
  void createZoneId() {
    ZoneId zoneId = ZoneId.systemDefault();
    System.out.println(zoneId);

    ZoneId zoneIdGMT = ZoneId.of("GMT");
    System.out.println(zoneIdGMT);

    Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
    availableZoneIds.forEach(id -> System.out.println(id));
  }


  @Test
  void createZoneOffset() {
    ZoneOffset zoneOffset1 = ZoneOffset.of("+07:00");
    ZoneOffset zoneOffset2 = ZoneOffset.ofHours(-7);
    ZoneOffset zoneOffset3 = ZoneOffset.ofHoursMinutes(7, 30);

    System.out.println(zoneOffset1);
    System.out.println(zoneOffset2);
    System.out.println(zoneOffset3);
  }
}
