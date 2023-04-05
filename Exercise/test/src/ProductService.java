import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    private static List<Product> productList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    static {
        productList.add(new Product("bút chì", 20000, 5, "Đồ dùng học tập"));
        productList.add(new Product("thước kẻ", 10000, 15, "Đồ dùng học tập"));
        productList.add(new Product("bút xanh", 5000, 50, "Đồ dùng học tập"));
        productList.add(new Product("bút dạ quang", 25000, 5, "Đồ dùng học tập"));
        productList.add(new Product("tẩy", 2000, 150, "Đồ dùng học tập"));
    }

    public static void displayProduct() {
        do {
            try {
                System.out.println("Nhấn Enter để hiển thị nội dung từng sản phẩm: ");
                String nextProduct = sc.nextLine();
                if (nextProduct.equals("")) {
                    for (Product product : productList) {
                        System.out.println(product);
                    }
                } else return;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public static void addProduct() {
        do {
            try {
                System.out.println("Nhập tên sản phẩm: ");
                String nameProduct = sc.nextLine();
                System.out.println("Nhập giá sản phẩm: ");
                int price = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập số lượng sản phẩm: ");
                int quantity = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập nội dung sản phẩm: ");
                String detail = sc.nextLine();
                productList.add(new Product(nameProduct, price, quantity, detail));
                System.out.println("Bạn đã thêm sản phẩm thành công!");
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public static void deleteProduct() {
        do {
            try {
                System.out.println("Mời nhập ID muốn xóa: ");
                int id = Integer.parseInt(sc.nextLine());
                if (id <= productList.size()) {
                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getId() == id) {
                            productList.remove(i);
                            System.out.println("bạn đã xóa sản phẩm thành công");
                            break;
                        } else System.out.println("Id sản phẩm không tồn tại!");
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}
