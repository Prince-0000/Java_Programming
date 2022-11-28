package Java_Programming.Conditionals_and_Loops.Pattern;

import java.util.Scanner;
public class Star_Pattern {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;
        while (i <= N) {
            int Spaces = 1;
            while (Spaces <= N - i) {
                System.out.print(" ");
                Spaces++;
            }
            int j = 1;
            while (j <= i) {
                System.out.print('*');
                j++;
            }
            int t = i - 1;
            j = 1;
            while (j <= i - 1) {
                System.out.print('*');
                t--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
