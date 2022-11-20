package Java_Programming.Conditionals_and_Loops.Pattern_1;

import java.util.Scanner;
public class Parallelogram_Pattern {
   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++)
        {
            for (int j = 2; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}


