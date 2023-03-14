import java.util.Arrays;
import java.util.Scanner;

public class concatArray {
    public static void main(String[] args) {
        int size;
        int [] firstArray;
        int [] secondArray;
        int [] thirdArray;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size=sc.nextInt();
            if (size>20 || size <0)
                System.out.println("Size should not exceed 20 or below 0");
        } while (size>20 || size <0);
        firstArray=new int[size];
        secondArray=new int[size];
        for (int i=0;i<firstArray.length;i++) {
            System.out.println("Enter element "+(i+1)+" : ");
            firstArray[i]=sc.nextInt();
        }
        for (int i=0;i<secondArray.length;i++) {
            System.out.println("Enter element "+(i+1)+" : ");
            secondArray[i]=sc.nextInt();
        }
        thirdArray=new int[firstArray.length+secondArray.length];
        System.arraycopy(firstArray, 0, thirdArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, thirdArray, firstArray.length, secondArray.length);
        System.out.println("Hiển thị chuỗi thirdArray: "+ Arrays.toString(thirdArray));
    }
}