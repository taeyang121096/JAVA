package java8.DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate localDate = LocalDate.of(2024, 02, 24);
        System.out.println(localDate);
        localDate = LocalDate.parse("2024-02-25");
        System.out.println(localDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(LocalDate.parse("2024-03-01 12:12:12", formatter));

        LocalDateTime nowDate = LocalDateTime.now();
        System.out.println(nowDate.format(formatter));

        System.out.println(nowDate.plusDays(1));

        LocalDateTime dateTime = LocalDateTime.now();
        //서울시간
        ZonedDateTime zoneTime = dateTime.atZone(ZoneId.of("Asia/Seoul"));
        System.out.println("ZonedDateTime : " + zoneTime);

        //세계표준시.
        Instant instant = zoneTime.toInstant();
        System.out.println("Instant : " + instant);

        LocalDate endDate = LocalDate.now();
        LocalTime endTime = LocalTime.now();
        LocalDate startDate = LocalDate.of(1996, 12, 10);
        LocalTime startTime = LocalTime.of(0, 0);

        Period period = Period.between(startDate, endDate);
        Duration duration = Duration.between(startTime, endTime);

        System.out.println(String.format("년 차이 %d년 월 차이 %d월 일 차이 %d일",
                period.getYears(), period.getMonths(), period.getDays()));

        System.out.printf("초 %d, 나노초 %d", duration.getSeconds(), duration.getNano());


    }
}
