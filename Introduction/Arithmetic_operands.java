import java.util.Scanner;
public class Arithmetic_operands{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of a and b : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    System.out.println("Sum of "+a+" + "+b+" is "+(a+b));
    System.out.println("Subtraction of "+a+" - "+b+" is "+(a-b));
    System.out.println("Multiplication of "+a+" * "+b+" is "+(a*b));
    System.out.println("Division of "+a+" / "+b+" is "+(a/b));
    
  }
}
