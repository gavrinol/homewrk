package com.company;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        int i = 12;
        byte b = 8;
        short s = 10;
        long l = 82778;
        float f = 76.98f;
        double d = 437.77;
        System.out.println();
        System.out.println();


        // Задание 2
        double boxerOne = 78.2;
        double boxerTwo = 82.7;
        double boxerSum = boxerOne + boxerTwo;
        System.out.println("Вес двух боксеров " + boxerSum);
        double boxerDif = boxerTwo - boxerOne;
        System.out.println("Разница в весе " + boxerDif);
        System.out.println();

        // Задание 3
        double banana = 80;
        double milk = 210;
        double icecream = 100;
        double eggs = 70;
        double mealGr = 5*banana + milk + 2*icecream + 4*eggs;
        double mealKg = mealGr/1000;
        System.out.println("Завтрак спортсмена в килограммах " + mealKg);
        System.out.println();

        //Задание 4
        double weight = 7000;
        double weightMin = 250;
        double weightMax = 500;
        double weightLossMin = weight / weightMin;
        double weightLossMax = weight / weightMax;
        System.out.println("Минимум дней " + weightLossMin);
        System.out.println("Максимум дней " + weightLossMax);
        double weightLossMiddle = (weightLossMax + weightLossMin) / 2;
        System.out.println("Дней в среднем " + weightLossMiddle);
        System.out.println();

        // Задание 5
        double Masha = 67760;
        double Denis = 83690;
        double Christina = 76230;
        double rise = 0.1;
        double salaryMasha = Masha + Masha*rise;
        double salaryDenis = Denis + Denis*rise;
        double salaryChristina = Christina + Christina*rise;
        double salaryDifMasha = salaryMasha - Masha;
        double salaryDifDenis = salaryDenis - Denis;
        double salaryDifChristina = salaryChristina - Christina;
        System.out.println("Маша теперь получает " + salaryMasha);
        System.out.println("Денис теперь получает " + salaryDenis);
        System.out.println("Кристина теперь получает " + salaryChristina);
        System.out.println("Прибавка к зарплате у Маши " + salaryDifMasha);
        System.out.println("Прибавка к зарплате у Дениса " + salaryDifDenis);
        System.out.println("Прибавка к зарплате у Кристины " + salaryDifChristina);
    }
}

