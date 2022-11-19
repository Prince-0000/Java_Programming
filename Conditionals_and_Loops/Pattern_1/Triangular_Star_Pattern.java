package Java_Programming.Conditionals_and_Loops.Pattern_1;

import java.util.Scanner;

public class Triangular_Star_Pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i, j;
        n = sc.nextInt();
        i = 1;
        while (i <= n) {
            j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
