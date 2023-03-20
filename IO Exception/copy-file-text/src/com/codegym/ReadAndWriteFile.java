package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<String> readFile(String filePath) {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc là nội dung có lỗi!");
        }
        return lines;
    }
    public void writeFile(String filePath, List<String> lines) {
        try {
            FileWriter writer = new FileWriter(filePath,true);
            BufferedWriter bufferedWriter =new BufferedWriter(writer);
            for (int i=0;i<lines.size();i++) {
                bufferedWriter.write(lines.get(i)+"\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
