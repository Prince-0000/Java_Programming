package Java_Programming.Arrays;
import java.util.Scanner;
public class Pair_Sum {
    public static int pairSum(int arr[], int x) {
    	int sum=0,temp=0,count=0;
        for(int i=0;i<arr.length;i++){ 
            temp=arr[i];
		    for(int j=i+1;j<arr.length;j++){
                if(temp+arr[j]==x)
                {
                    count ++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
        int x = s.nextInt();
        System.out.println(pairSum(arr, x));
    }
}
