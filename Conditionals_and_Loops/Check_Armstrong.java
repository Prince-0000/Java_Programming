package Java_Programming.Conditionals_and_Loops;

import java.util.Scanner;
public class Check_Armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c, r, f, sum = 0, i, n = 0;
        c = s.nextInt();
        a = c;
        b = c;
        while (c > 0) {
            c = c / 10;
            n++;
        }
        while (a > 0) {
            f = 1;
            r = a % 10;
            for (i = 1; i <= n; i++)
                f = f * r;
            sum = sum + f;
            a = a / 10;
        }
        if (b == sum)
            System.out.println("true");
        else
            System.out.println("false");

    }
}
