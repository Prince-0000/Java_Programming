package Java_Programming.Conditionals_and_Loops;

import java.util.Scanner;
public class Sum_or_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        if (c == 1) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            System.out.print(sum);
        } else if (c == 2) {
            int mul = 1;
            for (int i = 1; i <= n; i++) {
                mul = mul * i;
            }
            System.out.print(mul);

        } else
            System.out.print("-1");
    }
}
