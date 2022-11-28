package Java_Programming.Conditionals_and_Loops.Pattern;
import java.util.Scanner;
public class Mirror_Image_Number {
    
	public static void main(String[] args) {
     	
        Scanner sc = new Scanner(System.in);
        int n,i,j,k;
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" "); 
            }
            for(k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
	}

}


