package com.codegym;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvoiceService {
    private static List<Invoice> invoices;
    private static Scanner sc = new Scanner(System.in);
    static {
        invoices = new ArrayList<Invoice>();
        addInvoice("Dúi",50000,4);
        addInvoice("Lâm",20000,4);
        addInvoice("Ân",10000,4);
        addInvoice("Hưởng",500000,5);
        addInvoice("Phước",100000,5);
    }
     public static void addInvoice(String nameCustomer,long price,int day) {
         invoices.add(new Invoice(nameCustomer,price,day));
//         for(int i=0;i<invoices.size();i++) {
//             if(invoices.get(i).getNameCustomer() == nameCustomer) {
//                 System.out.println("Thằng này đã mua sản phẩm này rồi");
//             }
//         }
     }
     public static void writeFile(String filePath, List<Invoice> invoices, int date) {
         try{
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
             bufferedWriter.write("Tên khách hàng \t\t" + "  Tên sản phẩm\t\t" + "Giá sản phẩm\t" + "Ngày bán\n");
             for(Invoice invoice : invoices) {
                 if (invoice.getDay() == date ) {
                     bufferedWriter.write(invoice.toString());
                 }
             }
             bufferedWriter.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
     public static void returnProgram(){
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
     public static void runProgram() {
         do {
             System.out.print("""
                     Thông tin mua hàng:
                     1. Đặt hàng online cho sản phẩm giày
                     2. In hóa đơn
                     Mời nhập lựa chọn:
                     """);
             int choice = Integer.parseInt(sc.nextLine());
             switch (choice) {
                 case 1:
                     System.out.println("Nhập tên khách hàng: ");
                     String nameCustomer = sc.nextLine();
                     System.out.println("Nhập số lượng muốn mua thành tiền: ");
                     long price = Long.parseLong(sc.nextLine());
                     System.out.println("Nhập ngày mua: ");
                     int day = Integer.parseInt(sc.nextLine());
                     addInvoice(nameCustomer, price, day);
                     returnProgram();
                     break;
                 case 2:
                     System.out.println("Nhập ngày muốn xuất hóa đơn: ");
                     int date = Integer.parseInt(sc.nextLine());
                     writeFile("invoice.txt", invoices,date);
                     break;
             }
         } while (true);
     }
}
