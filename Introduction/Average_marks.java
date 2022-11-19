package Java_Programming.Introduction;
import java.util.Scanner;
public class Average_marks {
	public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marks of top three subjects : ");
        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int m3 = s.nextInt();
        System.out.println((m1+m2+m3)/3);
	}
}
