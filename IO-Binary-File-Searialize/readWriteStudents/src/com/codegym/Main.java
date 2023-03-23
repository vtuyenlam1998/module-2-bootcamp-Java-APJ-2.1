package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String FILE_PATH =
            "C:\\codegym\\module-02-bootcamp-Java-Apj-2.1\\source\\IO-Binary-File-Searialize\\readWriteStudents\\student.txt";

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Lê Văn Tý", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Văn Tèo", "Sài Gòn"));
        students.add(new Student(3, "Trần Thị Tồ", "Đà Nẵng"));
        students.add(new Student(4, "Đinh Bộ Bin", "Quảng Trị"));
        students.add(new Student(5, "Lý Công Bo", "Cần Thơ"));

        writeToFile(FILE_PATH, students);

        List<Student> studentDataFromFile = readDataFromFile(FILE_PATH);
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }

    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
}