package Java_Programming.Conditionals_and_Loops.Pattern_1;

import java.util.Scanner;
public class Square_Pattern {
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n,i,j;
        n = sc.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(n);
            }
            System.out.println();
        }
	}
}
