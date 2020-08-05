package com.udayan.oca.test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Eclipse {
    public static void main(String[] args){
        LocalDate nowDate = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        LocalDateTime nowDateTime = LocalDateTime.of(nowDate, nowTime);
        System.out.println("It is currently " + nowDateTime + " where I am");

        LocalDate eclipseDate1 = LocalDate.of(2017, 8, 21);
        LocalDate eclipseDate2 = LocalDate.parse("2017-08-21");
        System.out.println("Eclipse date: " + eclipseDate1 + ", " + eclipseDate2);

        LocalTime begins = LocalTime.of(9, 6, 43);
        LocalTime totality = LocalTime.parse("10:19:36");
        System.out.println("Eclipse begins at " + begins + " and totality is at " + totality);

        String eclipseDateTime = "2017-08-21 10:19";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime eclipseDay = LocalDateTime.parse(eclipseDateTime, formatter);
        String eclipseDayFormat = eclipseDay.format(DateTimeFormatter.ofPattern("dd, MM, yy hh, mm"));
        System.out.println("Eclipse day: " + eclipseDay);
        System.out.println("Eclipse day format: " + eclipseDayFormat);

        System.out.println("Mom time: " + eclipseDay.plusHours(2));

        LocalDateTime austinEclipse = LocalDateTime.of(2024, 4, 8, 13, 35, 56);
        Period period = Period.ofMonths(1);
        System.out.println("Next eclipse will happen on: " + austinEclipse + ". So set reminder for: " + austinEclipse.minus(period));

        Period allPeriods = Period.of(2, 3, 4);
        Period years = Period.ofYears(5);
        Period months = Period.ofMonths(8);
        Period days = Period.ofDays(15);
        Period weeks = Period.ofWeeks(9);

        System.out.println("Periods of years, months and days: " + allPeriods);
        System.out.println("Periods of years: " + years);
        System.out.println("Periods of months: " + months);
        System.out.println("Periods of days: " + days);
        System.out.println("Periods of weeks: " + weeks);

        String dateString = "2018-09-15T09:45:30";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime date_time1 = LocalDateTime.parse("2018-09-15T09:45:30");
        System.out.println(date_time1);
        LocalDateTime date_time2 = LocalDateTime.parse("2017-08-21 10:19", formatter1);
        Period period1 = Period.between(LocalDate.of(2020, 7, 23), LocalDate.now());
        System.out.println(date_time2);

        Period period2 = Period.of(0,8,9);
        System.out.println(period2);
    }
}
