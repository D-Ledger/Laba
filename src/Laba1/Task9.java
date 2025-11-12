package Laba1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = in.nextInt();

        int smallerNumber = number - 1;
        int largerNumber = number + 1;
        int squareAmount = (smallerNumber + number + largerNumber) * (smallerNumber + number + largerNumber);

        System.out.println("Число на единицу меньше введенного: " + smallerNumber + "\n"
                            + "Введенное число: " + number + "\n"
                            + "Число на единицу больше введенного: " + largerNumber + "\n"
                            + "Число квадратом суммы первых трех чисел: " + squareAmount);
        in.close();
    }
}
