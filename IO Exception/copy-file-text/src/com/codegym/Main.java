package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile =new ReadAndWriteFile();
        List<String> lines =readAndWriteFile.readFile("file number.txt");
        readAndWriteFile.writeFile("clone.txt",lines);
    }
}