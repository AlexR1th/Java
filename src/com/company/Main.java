package com.company;

public class Main {

    public static void main(String[] args) {
        String hello = "Hello OOP / good bie!!!!!!!!!!!";
        System.out.println(hello);

        //OOP это тип данных
        int a = 5;
        Integer b = 6; // больше возможностей

        // нам необходимо , "а" переделать в тип данныъ "double"

        double c = (double) a;
        System.out.println("a = " + a);
        System.out.println("c = " + c);

        Double d = b.doubleValue();

        String number = "123456789";
        Integer numberInt = Integer.valueOf(number);

        // Найти площадь прямоугольника длиной 3 см и шириной 4 !
//recfactoring причесывания кода
        int leghte = 3;
        int wigthe = 4;
        int area = leghte * wigthe;
        System.out.println(area);

        Rectangle r1 = new Rectangle(3,4);
        int areaR1 = r1.getArea();
        System.out.println(areaR1);

        Rectangle r2 = new Rectangle(7,12);
        int areaR2 = r2.getArea();
        System.out.println(areaR2 + " and " + areaR1);

        System.out.println(r2.getPerimetr());

        // Мы хотим в нашем 4 угольнике ректангле R2 увеличить длину на 3 !!
        // Это длается с помощью Seterra !!!
        r2.setLength(10); // добаили +3 ....
        System.out.println(r2.getArea());
        r2.setWidth(20);
        System.out.println(r2.getWidth());

        System.out.println(r2.toString());

        Rectangle r3 = new Rectangle();
        r3.setWidth(5);
        r3.setLength(6);
        System.out.println(r3.toString());



    }
}
