package Laba1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String month = in.nextLine();

        System.out.println("Введите количество дней в этом месяце: ");
        int numberOfDays = in.nextInt();

        System.out.println(month + " " + "содержит" + " " +  numberOfDays + " дней.");
        in.close();
    }
}
