package geekbrains.com.lesson2.exemles.lesson;

import java.io.FileInputStream;
import java.io.IOException;

public class FileExemple2 {
    public static void main(String[] args) {

        try(FileInputStream fileInputStream = new FileInputStream("testfile.txt")) {
            byte[] bytes = fileInputStream.readAllBytes();
            String string = new String(bytes);
            System.out.println(string);
        } catch (IOException e) {
            System.out.println(e.getMessage());
             }
        System.out.println("end of program");
        }
    }

