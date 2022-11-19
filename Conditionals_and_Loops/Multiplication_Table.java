package Java_Programming.Conditionals_and_Loops;
import java.util.Scanner;
public class Multiplication_Table {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int i = 1;
		int mul;
		for(i=1;i<=10;i++) {
			mul =N*i;
			System.out.println(mul);
		}
	}
}

