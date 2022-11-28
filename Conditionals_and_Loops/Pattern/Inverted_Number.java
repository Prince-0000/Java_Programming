package Java_Programming.Conditionals_and_Loops.Pattern;
import java.util.Scanner;
public class Inverted_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n,i,j;
        n = sc.nextInt();
        for(i=0;i<n;i++){
            for(j=n-i;j>=1;j--){
                System.out.print(n-i);
            }
            System.out.println();
        }
	}
}
 
