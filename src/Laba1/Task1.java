package Laba1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите вашу фамилию: ");
        String surname = in.nextLine();

        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.println("Введите ваше отчество: ");
        String patronymic = in.nextLine();

        System.out.println("Hello " + surname + " " + name + " " + patronymic);
        in.close();
    }
}
