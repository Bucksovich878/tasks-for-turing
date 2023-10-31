package org.example;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int allSumOfDrink = 0;
        System.out.print("Введите кол-во употреблений в неделю: ");
        int timesOfDrink = console.nextInt();
        System.out.print("Введите кол-во литров жидкости за одно употребление: ");
        int litersOfOneDrink = console.nextInt();

        if (timesOfDrink > 0 && litersOfOneDrink > 0){
            for (int i = 1; i <= 16 ; i++) {
                int summaOfThisWeek = (litersOfOneDrink*timesOfDrink);
                allSumOfDrink += summaOfThisWeek;
                System.out.println("К " + i + " неделе будет выпито " + (allSumOfDrink) + " литров жидкости");
            }
            if (allSumOfDrink >= 120){
                System.out.println("Студент принят в IT-клуб");
            }else{
                System.out.println("К сожалению, студент не принят в клуб");
            }
        }else{
            System.out.println("Введены некорректные данные");
            System.out.println("Попробуйте снова!");
        }

    }
}
