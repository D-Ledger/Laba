package Laba1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int currentYear = 2025;

        System.out.println("Введите ваш возраст: ");
        int age = in.nextInt();

        int yearOfBirth = currentYear - age;

        System.out.println("Ваш год рождения: " + yearOfBirth);
        in.close();
    }
}
