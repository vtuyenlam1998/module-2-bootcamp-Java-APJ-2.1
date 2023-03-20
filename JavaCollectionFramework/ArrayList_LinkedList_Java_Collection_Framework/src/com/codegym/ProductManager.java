package com.codegym;

import java.util.*;

public class ProductManager {
    private static List<Product> lists;
    private static Scanner sc= new Scanner(System.in);
    static {
        lists =new ArrayList<Product>();
        addProduct("Con vợ Thái",500);
        addProduct("Con vợ Nhật",1000);
    }
    public static void addProduct(String name,long price){
        lists.add(new Product(name,price));
    }
    public static void editProduct(long id,String name,long price){
        for(Product product : lists) {
            if(product.getId() == id) {
                product.setName(name);
                product.setPrice(price);
            }
        }
    }
    public static void deleteProduct(long id) {
//        for(Product product : lists) {
//            if(product.getId() == id) {
//                lists.remove(product);
//                break;
//            }
//        }
        for(int i=0;i<lists.size();i++) {
            if(lists.get(i).getId() == id) {
                lists.remove(i);
            }
        }
    }
    public static void displayProduct() {
        for (Product product : lists) {
            System.out.println(product.toString());
        }
    }
    public static void searchProduct(String name){
        for (Product product : lists) {
            if(Objects.equals(product.getName(), name)) {
                System.out.println(product);
                return;
            }
        } System.out.println("Không tìm thấy con vợ này hoặc là đang đi khách rồi");
    }
    public static void setCurrentProductByPrice(int choice) {
        switch (choice) {
            case 1:
                lists.sort(Comparator.comparingLong(Product::getPrice));
                for (Product product : lists) {
                    System.out.println(product);
                }
                break;
            case 2:
                lists.sort(Comparator.comparingLong(Product::getPrice).reversed());
                for (Product product : lists) {
                    System.out.println(product);
                }
                break;
        }
    }
    public static void nextRunProduct() {
        System.out.print("""
                            1. Quay lại menu
                            2. Kết thúc
                            """);
        int newChoice = Integer.parseInt(sc.nextLine());
        switch (newChoice) {
            case 1: return;
            case 2: System.exit(0);
        }
    }
    public static void runProductProgram() {
        do {
            System.out.print("""
                Menu:
                1. Thêm đào mới
                2. Xóa đào có sẵn
                3. Sửa đào có sẵn
                4. Hiển thị danh sách đào
                5. Tìm kiếm đào theo tên
                6. Sắp xếp đào tăng dần, giảm dần theo giá
                7. Đóng cửa sổ
                Nhấn phím tắt để thao tác ứng dụng:
                """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên sản phẩm: ");
                    String addName = sc.nextLine();
                    System.out.println("Nhập giá sản phẩm: ");
                    long price = Long.parseLong(sc.nextLine());
                    addProduct(addName,price);
                    System.out.println("Đào của bạn đã được thêm vào danh sách");
                    nextRunProduct();
                    break;
                case 2:
                    displayProduct();
                    System.out.println("Nhập ID đào muốn xóa: ");
                    long deleteID = Long.parseLong(sc.nextLine());
                    deleteProduct(deleteID);
                    System.out.println("Sản phẩm ID " + deleteID + " đã bị xóa khỏi danh sách");
                    displayProduct();
                    nextRunProduct();
                    break;
                case 3:
                    displayProduct();
                    System.out.println("Nhập ID đào muốn sửa: ");
                    long id = Long.parseLong(sc.nextLine());
                    System.out.println("Nhập tên đào muốn sửa: ");
                    String newName = sc.nextLine();
                    System.out.println("Cập nhật giá cho sản phẩm đào");
                    long newPrice = Long.parseLong(sc.nextLine());
                    editProduct(id,newName,newPrice);
                    System.out.println("Đào bạn đã được danh phận mới");
                    displayProduct();
                    nextRunProduct();
                    break;
                case 4:
                    displayProduct();
                    nextRunProduct();
                    break;
                case 5:
                    System.out.println("Nhập tên đào muốn vui vẻ tối nay: ");
                    String name = sc.nextLine();
                    searchProduct(name);
                    nextRunProduct();
                    break;
                case 6:
                    System.out.println("""
                            Bạn muốn sắp xếp đào như thế nào?
                            1. Từ tàu nhanh tới sugarbaby
                            2. Từ sugarbaby tới tàu nhanh
                            """);
                    int arrangeChoice = Integer.parseInt(sc.nextLine());
                    setCurrentProductByPrice(arrangeChoice);
                    nextRunProduct();
                    break;
                case 7:
                    System.exit(0);
            }
        } while (true);
    }
}
