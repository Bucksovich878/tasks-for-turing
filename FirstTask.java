package org.example;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String userInputString = console.nextLine();
        System.out.print("Введите натуральное значение для числа N: ");
        int userInputInt = console.nextInt();
        if (userInputInt > 0) {
            for (int i = 0; i < userInputInt; i++) {
                System.out.println(userInputString);
            }
        }else{
            System.out.println(userInputString);
        }
    }
}
