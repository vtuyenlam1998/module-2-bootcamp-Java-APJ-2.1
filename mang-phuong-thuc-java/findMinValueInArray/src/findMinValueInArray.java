import java.util.Scanner;

public class findMinValueInArray {
    public static void main(String[] args) {
        int size;
        Scanner sc=new Scanner(System.in);
        int [] array;
        do {
            System.out.print("Enter a size: ");
            size=sc.nextInt();
            if (size >20 || size <0)
                System.out.println("Size should not exceed 20 or below 0");
        } while (size>20 || size<0);
        array=new int[size];
        for (int i=0; i<array.length;i++) {
            System.out.println("Enter element "+(i+1)+" : ");
            array[i]=sc.nextInt();
        }
        int min=array[0];
        int index = 1;
        for (int i=1;i<array.length;i++) {
            if (min> array[i]) {
                min=array[i];
                index= i+1;
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là "+min+" ở vị trí "+index);
    }
}