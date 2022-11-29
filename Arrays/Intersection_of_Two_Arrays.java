package Java_Programming.Arrays;
import java.util.Scanner;
public class Intersection_of_Two_Arrays {
    public static void intersections(int[] arr1, int[] arr2) {
        int i = 0;
        while (i < arr1.length) {
            int temp = arr1[i];
            boolean ans = false;
            for (int j = 0; j < arr2.length; j++) {
                if (temp == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
            i++;
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr1=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=s.nextInt();
		}
        int m = s.nextInt();
        int arr2[] = new int[m];
        for(int i=0;i<m;i++){
            arr2[i] = s.nextInt();
        }
        intersections(arr1, arr2);
    }
}
