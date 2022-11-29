package Java_Programming.Arrays;
import java.util.Scanner;
public class Find_Unique {
    public static int findUnique(int[] arr) {
        int len = arr.length;
        int num = 0;
        boolean seen;
        for (int i = 0; i < len; i++) {
            seen = false;
            int thisInt = arr[i];
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    continue;
                }
                else if (thisInt == arr[j]) {
                    seen = true;
                    break;
                }
            }
            if (seen == false) {
                num = arr[i];
            }
        }
        return num;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
        System.out.print(findUnique(arr));
    }
}
