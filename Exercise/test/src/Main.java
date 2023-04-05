import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            try {
                System.out.println("""
                        Menu
                        1. Hiển thị sản phẩm
                        2. Thêm sản phẩm
                        3. Sửa sản phẩm
                        4. Xóa sản phẩm
                        5. sắp xếp sản phẩm theo giá
                        6. tìm sản phẩm đắt nhất
                        7. đọc file
                        8. ghi file
                        9. Thoát ra
                        Mời nhập lựa chọn: 
                        """);
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        ProductService.displayProduct();
                        break;
                    case 2:
                        ProductService.addProduct();
                        break;
                    case 3:
                    case 4:
                        ProductService.deleteProduct();
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        System.exit(0);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}