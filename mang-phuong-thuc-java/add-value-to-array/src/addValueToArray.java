import java.util.Arrays;
import java.util.Scanner;

public class addValueToArray {
    public static void main(String[] args) {
        int []arr = {1,5,9,3,5,7,4,5,6} ;
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập số cần chèn: ");
        int number=input.nextInt();
        int index;
        do {
            System.out.print("Vị trí cần chèn: ");
            index=input.nextInt();
        } while (index <= -1 || index >= arr.length-1);
        for (int i=0;i<arr.length;i++) {
            if(i == index) {
                for (int j=arr.length;j>i;j--) {
                    arr[j - 1] = arr[j-2];
                }
                arr[i]=number;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}