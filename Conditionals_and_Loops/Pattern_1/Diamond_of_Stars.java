package Java_Programming.Conditionals_and_Loops.Pattern_1;

import java.util.Scanner;
public class Diamond_of_Stars {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, j, k;
        n = sc.nextInt();
        int row = 1;
        int num = 1;
        int s = n / 2;
                System.out.print(" ");
            
            for (k = 1; k <= num; k++) {
                System.out.print("*");
            }
            System.out.println();
            if (row <= n / 2) {
                s -= 1;
                num += 2;
            } else {
                s += 1;
                num -= 2;
            }
            row++;
        }
    }

