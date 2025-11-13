package Timus.Task1197;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1197 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int test = in.nextInt();

        for(int i = 0; i < test; ++i) {
            String position = in.next();
            char x1 = position.charAt(0);
            char y1 = position.charAt(1);
            int x = x1 - 96;
            int y = y1 - 48;
            out.println(getInts()[x - 1][y - 1]);
        }

        out.flush();
    }

    public static int[][] getInts() {
        return new int[][]{
                {2, 3, 4, 4, 4, 4, 3, 2},
                {3, 4, 6, 6, 6, 6, 4, 3},
                {4, 6, 8, 8, 8, 8, 6, 4},
                {4, 6, 8, 8, 8, 8, 6, 4},
                {4, 6, 8, 8, 8, 8, 6, 4},
                {4, 6, 8, 8, 8, 8, 6, 4},
                {3, 4, 6, 6, 6, 6, 4, 3},
                {2, 3, 4, 4, 4, 4, 3, 2}};
    }
}