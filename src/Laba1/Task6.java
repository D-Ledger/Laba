package Laba1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int currentYear = 2025;

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите год рождения: ");
        int yearOfBirth = in.nextInt();

        int age = currentYear - yearOfBirth;

        System.out.println("Имя пользователя: " + name + "\n" + "Возраст: " + age + " лет");
        in.close();
    }
}
