package com.company.darsdagilar;
import java.io.*;

public class FileWR {
        public static void main(String[] args) {

            File file = new File("D:\\zako\\hello.txt"); // out yozish paytida fileni yaratib ketadi
            System.out.println(file.exists());
            try {
                OutputStream out = new FileOutputStream(file);
//            out.write(65);
//                byte[] bytes = new byte[6];
//                bytes[0] = 's';
//                bytes[1] = 'a';
//                bytes[2] = 'l';
//                bytes[3] = 'o';
//                bytes[4] = 'm';
//            out.flush();
//                out.write(bytes);
//                out.close();
                InputStream inputStream = new FileInputStream(file);
//                System.out.println(inputStream.available()); // file ichida nechta belgi bor
//            System.out.println(inputStream.read());
                byte[] input = new byte[inputStream.available()];
                inputStream.read(input);
                for (byte b : input) {
                    System.out.println((char) b);
                }
                inputStream.close();


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
