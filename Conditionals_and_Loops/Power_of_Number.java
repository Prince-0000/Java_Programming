package Java_Programming.Conditionals_and_Loops;

import java.util.Scanner;

public class Power_of_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();

        int p = 1;
        for (int i = 0; i < n; i++) {
            p = p * x;
        }
        System.out.println(p);

    }
}
