package com.alura.java.avancado.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * @autor Adriano Rabello 12/01/2021 - 6:05 PM
 */
public class Datas {

    public static void main(String[] args) {


        /** Actual date */
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        /** date with parametters */
        LocalDate olimpiadas = LocalDate.of(2016, Month.JANUARY,5);

        /** diference between */

        Period between = Period.between(hoje, olimpiadas);

        System.out.println(between.getYears());

        /** Formatter */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(formatter.format(LocalDate.now()));


        /** */

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        System.out.println(dateTimeFormatter.format(localDateTime));

    }
}
