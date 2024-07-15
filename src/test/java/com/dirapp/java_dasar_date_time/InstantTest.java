package com.dirapp.java_dasar_date_time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;

public class InstantTest {
  // sebelumnya milliseconds direpresentasikan dengan tipe data long
  // di java Date & Time API baru, implementasi milliseconds direpresentasikan dalam class Instant
  // Instant sama seperti class Date, merepresentasikan milliseconds setelah Unix EPOCH, dihitung dari 1970 januari 01, 00:00
  // artinya Instant menggunakan timezone UTC (00:00)


  @Test
  void create() {
    // mendapatkan waktu UTC saat ini
    Instant instant1 = Instant.now();
    System.out.println(instant1);

    // menentukan waktu dari epochMilli dihitung dari 1970 januari 01, 00:00
    Instant instant2 = Instant.ofEpochMilli(0);
    System.out.println(instant2);
  }


  @Test
  void modify() {
    Instant instant1 = Instant.now();
    // melakukan perubahan waktu dengan penambahan atau pengurangan millisecond
    Instant instant2 = instant1.plusMillis(10000);
    Instant instant3 = instant1.minusMillis(10000);

    System.out.println(instant1);
    System.out.println(instant2);
    System.out.println(instant3);
  }


  @Test
  void get() {
    Instant instant = Instant.now();
    System.out.println(instant);

    // merubah format tanggal menjadi epoch millisecond (dihitung dari 1970 januari 01, 00:00)
    System.out.println(instant.toEpochMilli());

    // mendapatkan detik atau secondnya
    System.out.println(instant.getEpochSecond());

    // mendapatkan nano secondnya
    System.out.println(instant.getNano());
  }


  @Test
  void fromInstant() {
    Instant instant = Instant.now();
    ZoneId zoneId = ZoneId.of("Asia/Jakarta");

    // konversi dari Instant ke LocalTime, dengan menentukan ZoneId nya, jika tidak maka timezone defaultnya UTC
    LocalTime localTime = LocalTime.ofInstant(instant, zoneId);
    System.out.println(localTime);

    LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);
    System.out.println(localDateTime);

    ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, zoneId);
    System.out.println(zonedDateTime);

    OffsetDateTime offsetDateTime = OffsetDateTime.ofInstant(instant, zoneId);
    System.out.println(offsetDateTime);
  }


  @Test
  void toInstant() {
    // hanya tipe data yang memiliki date dan time yang bisa dikonversi ke Instant
    // misalnya jika dari LocalTime, harus dibuat menjadi LocalDateTime dulu baru bisa dikonversi ke Instant
    // jika ingin konversi dari LocalDateTime ke Instant harus menambahkan ZoneOffsetnya, namun jika ingin konversi dari ZonedDateTime atau OffsetDateTime tidak mengisi ZoneOffsetnya, karena secara default ZoneOffsetnya sudah ada

    System.out.println(LocalDateTime.now());
    Instant instant1 = LocalDateTime.now().toInstant(ZoneOffset.ofHours(7));
    System.out.println(instant1);

    System.out.println(ZonedDateTime.now());
    Instant instant2 = ZonedDateTime.now().toInstant();
    System.out.println(instant2);

    System.out.println(OffsetDateTime.now());
    Instant instant3 = OffsetDateTime.now().toInstant();
    System.out.println(instant3);
  }
}
