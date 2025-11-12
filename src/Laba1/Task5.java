package Laba1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int currentYear = 2025;

        System.out.println("Введите год рождения: ");
        int yearOfBirth = in.nextInt();

        int age = currentYear - yearOfBirth;

        System.out.println("Ваш возраст: " + age + " лет");
        in.close();
    }
}
