package Java_Programming.Conditionals_and_Loops;

import java.util.Scanner;
import java.lang.Math;
public class Total_Salary {
		public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int B = s.nextInt();
		String str=s.next();
		char G = str.charAt(0);
		int all;
		if(G==65) {
			all=1700;
		}
		else if (G==66) {
			all=1500;
		}
		else {
			all=1300;
		}
		double ts;
		ts= ((B+(0.20*B)+(0.50*B)+all)-(0.11*B));
				System.out.println(Math.round(ts));
	}
}
