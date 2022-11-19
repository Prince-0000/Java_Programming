package Java_Programming.Conditionals_and_Loops;
import java.util.Scanner;
public class Fahrenheit_to_celsius{
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int S= s.nextInt();
		int E= s.nextInt();
		int W= s.nextInt();
	    int f;
        while(S<=E)
        {
            f=((5*(S-32))/9);
            System.out.println(S+" "+f);
            S=S+W;     
        }
	}
}
