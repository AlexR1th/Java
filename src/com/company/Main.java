package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,6);
        System.out.println(triangle.getPerimetr());
        System.out.println(triangle.getArea());
        System.out.println();
        System.out.println(triangle.toString());
        System.out.println();
        Triangle triangle2 = new Triangle(3,4,Math.PI/2);
        System.out.println(triangle2.toString());
        System.out.println("_____________________________________________");

        System.out.println("________________________________");
        Student studentOleg = new Student("Oleg","Sergeevich",
                "Seroijko",false,2,"Desing",
                LocalDate.of(2005,Month.FEBRUARY,2));
        System.out.println(studentOleg.toString());
        LocalDate may1st = LocalDate.of(2020,Month.MAY,1);
        System.out.println(may1st.getDayOfWeek());
        System.out.println(may1st.getDayOfYear());
        LocalDate newYear = LocalDate.of(2020,Month.JANUARY,1);
        LocalDate developerDAy = newYear.plusDays(255);
        System.out.println(developerDAy.getDayOfWeek());

        System.out.println(LocalDate.now());

        System.out.println(" Осталось " + ChronoUnit.DAYS.between( LocalDate.now(),developerDAy));
        LocalDate myBirthday = LocalDate.of(1995,Month.OCTOBER,21);
        long myYears = ChronoUnit.YEARS.between(myBirthday,LocalDate.now());
        System.out.println(myYears);

        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        LocalDateTime time2 = LocalDateTime.of(2020,Month.FEBRUARY,1,
                12,56,33,221233123);
        System.out.println(time2);


    }

}
