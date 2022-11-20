package Java_Programming.Conditionals_and_Loops.Pattern_1;
import java.util.Scanner;
public class Half_Diamond {
   
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("*");
        for (int i = 1; i <= n; i++) 
        {
            int j = 1;
            System.out.print("*");
            while (j <= i)
            {
                System.out.print(j);
                j++;
            }
            j--;
            while (--j >= 1)
            {
                System.out.print(j );
            }
            System.out.println("*");
        }
        for (int i = n - 1; i >= 1; i--) 
        {
            int j = 1;
            System.out.print("*");
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            j--;
            while (--j >= 1) 
            {
                System.out.print(j );
            }
            System.out.println("*");
        }
        System.out.println("*");
    }
}


