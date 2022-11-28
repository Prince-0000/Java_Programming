package Java_Programming.Conditionals_and_Loops.Pattern;

import java.util.Scanner;

public class Reverse_Number_Pattern {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int m;
        for (int i = 1; i <= N; i++) {
            m = i;
            for (int j = 0; j < i; j++) {
                System.out.print(m);
                m--;
            }
            System.out.println();
        }
    }
}
