package com.company.Gson.jsonDars;
import java.io.*;

    public class FileExample {
        public static void main(String[] args) {


            String fileName = "D:\\zako\\test.txt";
            String fileNameEdit = "D:\\zako\\testEdit.txt";
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
//                String line = null;
//            System.out.print(reader.readLine());
//            System.out.print(reader.readLine());
//            System.out.print(reader.readLine());
//                System.out.print(reader.readLine());
//            while ((line=reader.readLine()) !=null){
//                System.out.println(line);
//            }
//
//            reader.close();
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileNameEdit, true));
//            writer.write("bu java orqali\n kiritildi \n yangi qator qo'shildi");
                String line = null;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                    writer.write(line);
                }
//                writer.write("\nnewRow");
                reader.close();
                writer.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                System.out.println("finish");
            }
        }
}
