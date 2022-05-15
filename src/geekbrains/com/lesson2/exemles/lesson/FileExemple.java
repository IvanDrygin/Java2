package geekbrains.com.lesson2.exemles.lesson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExemple {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("testfile.txt");
            byte[] bytes = fileInputStream.readAllBytes();
            String string = new String(bytes);
            System.out.println(string);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }  finally {
            System.out.println("Блок Finally");
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        }
    }
