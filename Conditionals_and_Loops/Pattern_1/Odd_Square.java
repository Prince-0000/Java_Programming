package Java_Programming.Conditionals_and_Loops.Pattern_1;

import java.util.Scanner;
public class Odd_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j < n; j++) {
                System.out.print(j * 2 + 1 + "");
            }
            for (int k = 0; k < i - 1; k++) {
                System.out.print(k * 2 + 1 + "");
            }
            System.out.println();
        }
    }
}