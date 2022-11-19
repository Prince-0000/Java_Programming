package Java_Programming.Conditionals_and_Loops.Pattern_1;

import java.util.Scanner;
public class Character_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, m;
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            m = i;
            for (j = 1; j <= i; j++) {
                System.out.print((char) ('A' + m - 1));
                m++;
            }
            System.out.println();
        }
    }
}
