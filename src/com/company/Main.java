package com.company;

public class Main {


    public static void main(String[] args) {


        Home home = new Home("17", "Карабеков");


        Father objectA = new Father("Абдилашим", 60, home, "Жаркын",EnumFamily.valueOf("Working") );
        System.out.println(objectA.getInfo());


        System.out.println("---------------------------");
        Son objectB = new Son("Каныбек", 40, home , "Наташа", EnumFamily.Working, 180);
        System.out.println(objectB.getInfo());


        System.out.println("------------------------------");
        Son objectC = new Son("Айбол", 35, home , "Айгул", EnumFamily.Working, 175);
        System.out.println(objectC.getInfo());






    }
}
