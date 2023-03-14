import java.util.Scanner;

public class findMaxValueInArray {
    public static void main(String[] args) {
        int firstSize;
        int secondSize;
        int [][] array;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter a firstSize: ");
            firstSize=sc.nextInt();
            System.out.println("Enter a secondSize: ");
            secondSize=sc.nextInt();
            if (firstSize >10 || firstSize <0 || secondSize>10 || secondSize<0)
                System.out.println("Not valid");
        } while (firstSize >10 || firstSize <0 || secondSize>10 || secondSize<0);
        array=new int[firstSize][secondSize];
        System.out.println("Enter "+array.length+ " rows and "
                + array[0].length+ " columns: ");
        for (int row =0; row < array.length;row++) {
            for (int column=0;column<array[row].length;column++) {
                array[row][column] = sc.nextInt();
            }
        }
        int max=0;
        int indexRow=0;
        int indexColumn=0;
        for (int i=0;i< array.length;i++) {
            for (int j=0;j<array[i].length;j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    indexRow= i+1;
                    indexColumn= j+1;
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là "+max+" ở row "+indexRow+" ở column "+indexColumn);
    }
}