package com.udayan.oca;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class LambdaPractice {
    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.parse("2018-07-11"));
        dates.add(LocalDate.parse("1919-02-25"));
        dates.add(LocalDate.of(2020, 4, 8));
        dates.add(LocalDate.of(1980, Month.DECEMBER, 31));

        dates.removeIf(date -> date.getYear() < 2000);

        System.out.println(dates);
    }
}
