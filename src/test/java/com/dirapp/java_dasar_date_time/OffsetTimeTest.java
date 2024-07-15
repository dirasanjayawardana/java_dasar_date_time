package com.dirapp.java_dasar_date_time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

import org.junit.jupiter.api.Test;

public class OffsetTimeTest {
  // OffsetTime mirip dengan LocalTime, namun memiliki timezone offset
  // berbeda dengan ZonedDateTime, OffsetTime tidak bisa menggunakan ZoneId tetapi hanya bisa menggunakan ZoneOffset
  // format default OffsetTime adalah HH:mm:ss+/-ZoneOffset
  // format default OffsetDateTime adalah yyyy-MM-ddTHH:mm:ss+/-ZoneOffset

  
  @Test
  void create() {
    OffsetTime offsetTime1 = OffsetTime.now();
    // meskipun memasukkan ZoneId tetapi yang diambil hanya offsetnya saja
    OffsetTime offsetTime2 = OffsetTime.now(ZoneId.of("Asia/Jakarta"));
    OffsetTime offsetTime3 = OffsetTime.of(10, 10, 10, 10, ZoneOffset.ofHours(7));
    OffsetTime offsetTime4 = OffsetTime.parse("09:09:09.100+07:00");

    System.out.println(offsetTime1);
    System.out.println(offsetTime2);
    System.out.println(offsetTime3);
    System.out.println(offsetTime4);

    OffsetDateTime offsetDateTime1 = OffsetDateTime.now();
    OffsetDateTime offsetDateTime2 = OffsetDateTime.now(ZoneId.of("Asia/Jakarta"));
    OffsetDateTime offsetDateTime3 = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.ofHours(7));
    OffsetDateTime offsetDateTime4 = OffsetDateTime.parse("1980-09-17T10:10:10.100+05:00");

    System.out.println(offsetDateTime1);
    System.out.println(offsetDateTime2);
    System.out.println(offsetDateTime3);
    System.out.println(offsetDateTime4);
  }


  @Test
  void toLocalTime() {
    LocalTime localTime = LocalTime.now();
    System.out.println(localTime);

    OffsetTime offsetTime = localTime.atOffset(ZoneOffset.ofHours(7));
    System.out.println(offsetTime);

    LocalTime localTime1 = offsetTime.toLocalTime();
    System.out.println(localTime1);
  }
  

  @Test
  void toLocalDateTime() {
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);

    OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(7));
    System.out.println(offsetDateTime);

    LocalDateTime localDateTime1 = offsetDateTime.toLocalDateTime();
    System.out.println(localDateTime1);
  }
}
