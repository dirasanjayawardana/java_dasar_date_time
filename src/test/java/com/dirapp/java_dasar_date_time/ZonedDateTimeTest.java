package com.dirapp.java_dasar_date_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;

public class ZonedDateTimeTest {
  // pada LocalTime, LocalDate, LocalDateTime, tidak memiliki informasi timezone
  // jika memerlukan informasi timezone bisa gunakan ZonedDateTime
  // class ZonedDateTime mirip seperti LocalDateTime, tetapi mendukung timezone
  // format defaultnya adalah yyyy-MM-ddTHH:mm:ss.nano+/-ZoneOffset[ZoneId]
  // Dimana ZoneId tidak wajib, jik ZoneId diisi maka ZoneOffset akan dihiraukan


  @Test
  void create() {
    // mendapatkan waktu saat ini
    ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
    // menetapkan waktu tertentu
    ZonedDateTime zonedDateTime2 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Jakarta"));
    // menentapkan waktu sekarang pada timezone GMT
    ZonedDateTime zonedDateTime3 = ZonedDateTime.now(ZoneId.of("GMT"));
    // menentapkan waktu sekarang dengan offset 5 jam
    ZonedDateTime zonedDateTime4 = ZonedDateTime.now(ZoneOffset.ofHours(5));

    System.out.println(zonedDateTime1);
    System.out.println(zonedDateTime2);
    System.out.println(zonedDateTime3);
    System.out.println(zonedDateTime4);
  }


  @Test
  void parsing() {
    // menetapkan waktu dari String menjadi ZonedDateTime, seusai dengan formatnya
    ZonedDateTime zonedDateTime1 = ZonedDateTime.parse("1980-10-10T10:10:10+07:00[Asia/Jakarta]");
    ZonedDateTime zonedDateTime2 = ZonedDateTime.parse("1980-10-10T10:10:10+05:00");

    System.out.println(zonedDateTime1);
    System.out.println(zonedDateTime2);
  }


  @Test
  void changeZoneId() {
    ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
    System.out.println(zonedDateTime1);

    // merubah timezone tanpa merubah tanggal dan waktu
    ZonedDateTime zonedDateTime2 = zonedDateTime1.withZoneSameLocal(ZoneId.of("GMT"));
    // merubah timezone dengan merubah tanggal dan waktu mengikuti timezone yang baru
    ZonedDateTime zonedDateTime3 = zonedDateTime1.withZoneSameInstant(ZoneId.of("GMT"));

    System.out.println(zonedDateTime2);
    System.out.println(zonedDateTime3);
  }
}
