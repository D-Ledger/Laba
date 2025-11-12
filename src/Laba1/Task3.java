package Laba1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название текущего дня недели: ");
        String day = in.nextLine();

        System.out.println("Введите название месяца: ");
        String month = in.nextLine();

        System.out.println("Введите дату (номер дня в месяце): ");
        String date = in.nextLine();

        System.out.println("Сегодня: " + day + ", " + date + " " + month);
        in.close();
    }
}
