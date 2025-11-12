package Laba1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int firstNumber = in.nextInt();

        System.out.println("Введите второе число: ");
        int secondNumber = in.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("Ваше число: " + sum);
        in.close();
    }
}
