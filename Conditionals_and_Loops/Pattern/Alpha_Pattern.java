package Java_Programming.Conditionals_and_Loops.Pattern;

import java.util.Scanner;

public class Alpha_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        n = sc.nextInt();
        char ch = 'A';
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
            ch = (char) (ch + 1);
        }
    }
}
