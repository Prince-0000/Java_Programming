package Java_Programming.Conditionals_and_Loops.Pattern;
import java.util.Scanner;
public class Triangle_of_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n,i,j,k,l;
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            int p = i;
        	for(k=1;k<=i;k++){
                System.out.print(p);
                p++;
            }
            int q = 2*i-2;
            for(l=1;l<=i-1;l++){
                System.out.print(q);
                q--;
            }
            System.out.println();
        }
	}
}
