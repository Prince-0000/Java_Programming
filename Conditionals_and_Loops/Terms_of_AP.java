package Java_Programming.Conditionals_and_Loops;

import java.util.Scanner;

public class Terms_of_AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, res;
        int no = 1, count = 0;
        while (count < n) {
            res = 3 * no + 2;
            if (res % 4 != 0) {
                System.out.print(res + " ");
                count++;
            }
            no++;
        }
    }
}
