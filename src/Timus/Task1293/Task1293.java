package Timus.Task1293;

import java.util.Scanner;

public class Task1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();

        int area = N * A * B * 2;

        System.out.println(area);
    }
}
