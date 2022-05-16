package com.company.Homework;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        try {
            File file = new File("D:\\"); // D - currentFile
            String command = "";
            Scanner sc = new Scanner(System.in);
            while (!command.equals("exit")) {
                System.out.print(file.getAbsolutePath() + "> ");
                command = sc.nextLine();
                if (command.trim().startsWith("cd ")) {
                    if (command.startsWith("cd ..") || command.startsWith("cd ../")) {
                        file = file.getParentFile();
                    } else {
                        file = new File(file.getAbsolutePath() + "\\" + command.substring(3));
                    }
                } else if (command.trim().equals("dir")) {
                    for (String s : file.list()) {
                        System.out.println(s);
                        Date date = new Date(file.lastModified());
                    }
                } else if (command.trim().equals("date")) {
                    System.out.println((file.setLastModified(new Date().getTime())));
                } else if (command.trim().equals("path")) {
                    System.out.println(file.getPath());
                } else if (command.trim().equals("help")) {
                    File[] files = file.listFiles();
                    for (File file1 : files) {
                        Date date = new Date(file1.lastModified());
                        System.out.println(file1.getName() + "    " + date);
                    }
                } else if (command.trim().equals("mkdir")) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Katalog name kiriting=");
                    String name = scanner.nextLine();
                    file = new File(file.getAbsolutePath() + "\\" + name);
                    file.mkdir();
                } else if (command.trim().trim().equals("rename")) {
                    Scanner scanner = new Scanner(System.in);
                    File[] files1 = file.listFiles();
                    System.out.println("yangi fayl kiriting:");
                    String Name = scanner.nextLine();
                    File file2 = new File(file.getParentFile() + "\\" + Name);
                    System.out.println(file2.mkdir());
                    File[] files5 = file.listFiles();
                    for (int i = 0; i < files5.length; i++) {
                        file2 = new File(file2.getAbsolutePath() + "\\" + files5[i].getName());
                        file2.mkdirs();
                        file2 = new File(file2.getParentFile() + "\\");
                    }
                    file.deleteOnExit();
//                String string=file.getName();
//                file=new File(file.getParentFile()+"\\");
//                System.out.println(file.getAbsoluteFile());
//                File[] files=file.listFiles();
//                for (File file1:files){
//                    System.out.println(file1.getName());
//                    System.out.println(file1);
//                    if (file1.getName().equals("zako")){
//                        System.out.println(file1.delete());
//                        break;
//                    }
//                }
                } else if (command.equals("copy") || command.equals("xcopy")) {
                    File[] files = file.listFiles();
                    for (File file1 : files) {
                        System.out.println(file1.getName());
                    }
                    System.out.println("Qaysi fayldagi narsalarni copy qilishni hohlaysz");
                    Scanner scanner = new Scanner(System.in);
                    String copy1 = scanner.nextLine();
                    File[] files1 = file.listFiles();
                    for (File file1 : files1) {
                        if (file1.getName().equals(copy1)) {
                            System.out.println("Qaysi faylga kochirishni hohlaysz");
                            String copy2 = scanner.nextLine();
                            for (File file2 : files1) {
                                if (file2.getName().equals(copy2)) {
                                    file = new File(file.getAbsoluteFile() + "\\" + copy1 + "\\");
                                    File[] files2 = file.listFiles();
                                    file = new File(file.getParentFile() + "\\" + copy2 + "\\");
                                    System.out.println(file.getAbsoluteFile());
                                    for (int i = 0; i < files2.length; i++) {
                                        file = new File(file.getAbsolutePath() + "\\" + files2[i].getName());
                                        file.mkdir();
                                        file = new File(file.getParentFile() + "\\");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }catch (Exception e){
            e.getMessage();
        }
    }
}
