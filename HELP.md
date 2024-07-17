# Java Date and Time API
Java Date dan Time API pada package `java.time` merupakan fitur baru sejak java versi 8, yang bisa digunakan untuk menggantikan `java.util.Date` dan `java.util.Callendar`

## Perbedaan java.util.Date dengan Date and Time Api yang baru
- Object di `java.Time` bersifat immutable dan thread save, artinya tidak bisa diubah, jika diubah maka akan membuat object baru sehingga aman digunakan pada proses paralel
- Terdapat pemisah antara tanggal dan waktu, tidak digabung seperti pada class `java.util.Date`
- Mendukung data lain speerti durasi, periose, timezone, dll.
- Pada `java.util.Date` banyak method yang sudah deprecated.

## Learning
- test/DateTest.java
- test/CalendarTest.java
- test/TimeZoneTest.java
- test/LocalDateTest.java
- test/LocalTimeTest.java
- test/LocalDateTimeTest.java
- test/YearTest.java
- test/ZoneTest.java
- test/ZonedDateTimeTest.java
- test/OffsetTimeTest.java
- test/InstantTest.java
- test/ClockTest.java
- test/DurationTest.java
- test/PeriodTest.java
- test/TemporalTest.java
- test/DayOfWeekTest.java
- test/DateFormaterTest.java
- test/LegacyTestTest.java