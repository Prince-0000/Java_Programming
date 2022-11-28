package Java_Programming.Conditionals_and_Loops.Pattern;

import java.util.Scanner;
public class Interesting_Alphabets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        n = sc.nextInt();

        int m = 65 + n;
        for (i = 1; i <= n; i++) {
            m -= i;
            for (j = 1; j <= i; j++) {
                System.out.print((char) (m));
                m++;
            }
            System.out.println();
        }
    }
}
