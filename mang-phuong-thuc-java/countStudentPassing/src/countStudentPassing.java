import java.util.Scanner;

public class countStudentPassing {
    public static void main(String[] args) {
        int size;
        Scanner sc=new Scanner(System.in);
        int [] array;
        do {
            System.out.print("Enter a size : ");
            size=sc.nextInt();
            if (size >30 || size<0)
                System.out.println("Size should not exceed 30 or below 0");
        } while (size>30 || size<0);
        array=new int[size];
        for (int i=0;i<array.length;i++) {
            do {
                System.out.print("Enter score of student "+(i+1)+" : ");
                array[i] = sc.nextInt();
                if (array[i] > 10 || array[i] < 0)
                    System.out.println("Score should not exceed 10 or below 0");
            } while (array[i] > 10 || array[i] < 0);
        }
        int count=0;
        System.out.print("List of mark: ");
        for (int i : array) {
            System.out.print(i + "\t");
            if (i >= 5)
                count++;
        }
        System.out.print("\n The number of students passing the exam is "+count);
    }
}