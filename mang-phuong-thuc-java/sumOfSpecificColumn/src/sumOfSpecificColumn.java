
import java.util.Scanner;

public class sumOfSpecificColumn {
    public static void main(String[] args) {
        int firstSize;
        int secondSize;
        Scanner sc=new Scanner(System.in);
        double [][] array;
        do{
            System.out.print("Enter first size : ");
            firstSize=sc.nextInt();
            System.out.print("Enter second size : ");
            secondSize=sc.nextInt();
            if (firstSize>20 || secondSize>20 || firstSize<0 || secondSize<0) {
                System.out.println("Size should not exceed 20 or below 0");
            }
        } while (firstSize>20 || secondSize>20 || firstSize<0 || secondSize<0);
        array =new double[firstSize][secondSize];
        System.out.println("Enter "+array.length+" rows and "+array[0].length+" column: ");
        for (int i=0;i<array.length;i++) {
            for (int j=0;j<array[i].length;j++) {
                array[i][j]=sc.nextDouble();
            }
        }
        int index;
        int sum=0;
        System.out.println("Nhập cột để tính tổng của cột đó: ");
        index=sc.nextInt();
        for (double[] doubles : array) {
            sum += doubles[index];
        }
        System.out.print("Tổng các số ở một cột xác định là "+sum+" ở cột "+index);
    }
}