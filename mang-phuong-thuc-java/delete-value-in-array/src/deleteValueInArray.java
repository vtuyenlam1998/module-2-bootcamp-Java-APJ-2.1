import java.util.Arrays;
import java.util.Scanner;

public class deleteValueInArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 1, 4, 7, 0, 3, 6, 9};
        System.out.println(Arrays.toString(arr));
        int index;
        boolean isChange=false;
        Scanner input = new Scanner(System.in);
        System.out.println("Mời nhập phần tử cần xóa: ");
        int x = input.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                for (int j = index; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                isChange= true;
                break;
            } else isChange=false;
        }
        if (isChange) {
            System.out.println("Mảng sau khi đổi là "+Arrays.toString(arr));
        } else System.out.println("Mảng không thay đổi: "+Arrays.toString(arr));
    }
}