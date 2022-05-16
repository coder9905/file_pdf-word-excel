package com.company.Gson.Vazifa;

import com.company.Gson.jsonVazifa.classes.Comments.Comment;
import com.company.Gson.jsonVazifa.classes.Posts.Post;
import com.company.Gson.jsonVazifa.classes.Users.Address;
import com.company.Gson.jsonVazifa.classes.Users.Company;
import com.company.Gson.jsonVazifa.classes.Users.Geo;
import com.company.Gson.jsonVazifa.classes.Users.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Gson gson=new Gson();

        try {

            List<User> userList=gson.fromJson(new FileReader("D:\\Java\\Zako\\lesson21\\User.txt"), new TypeToken<List<User>>(){}.getType());

            int c1=-1;
            while (c1!=0) {
                System.out.println("1=> Users\t2=> add\t3=> rename\t4=> delete\t0=> Exit");
                c1=scanner.nextInt();
                switch (c1){
                    case 0:{
                    };break;
                    case 1:{
                        int c2=-1;
                        while (c2!=0) {
                            System.out.println("Qaysi biridagi postlarni ko'rishni hohlaysz !!!");
                            for (int i = 0; i < userList.size(); i++) {
                                System.out.println(userList.get(i).getId() + "=>" + userList.get(i).getName());
                            }
                            c2=0;
                        }
                    };break;
                    case 2:{
                        System.out.println("Id kiriting");
                        scanner=new Scanner(System.in);
                        Long id=scanner.nextLong();
                        scanner=new Scanner(System.in);
                        System.out.println("name kiriting");
                        String name=scanner.nextLine();
                        System.out.println("userName kiriting");
                        String userName=scanner.nextLine();
                        System.out.println("email kiriting");
                        String email=scanner.nextLine();
                        System.out.println("street kiriting");
                        String street=scanner.nextLine();
                        System.out.println("suite kiriting");
                        String suite=scanner.nextLine();
                        System.out.println("city kiriting");
                        String city=scanner.nextLine();
                        System.out.println("zipcode kiriting");
                        String zipcode=scanner.nextLine();
                        System.out.println("lat kiriting");
                        String lat=scanner.nextLine();
                        System.out.println("lng kiriting");
                        String lng=scanner.nextLine();
                        System.out.println("phone kiriting");
                        String phone=scanner.nextLine();
                        System.out.println("website kiriting");
                        String website=scanner.nextLine();
                        System.out.println("Name kiriting");
                        String Name=scanner.nextLine();
                        System.out.println("catchPharake kiriting");
                        String catchPharase=scanner.nextLine();
                        System.out.println("bs kiriting");
                        String bs=scanner.nextLine();
                        Geo geo=new Geo(lat,lng);
                        Address address=new Address(street,suite,city,zipcode,geo);
                        Company company=new Company(Name,catchPharase,bs);
                        User user=new User(id,name,userName,email,address,phone,website,company);
                        System.out.println(user);
                        BufferedWriter writer=new BufferedWriter(new FileWriter("D:\\Java\\Zako\\lesson21\\User.txt",true));
                        String data=gson.toJson(user);
                        writer.write(data);
                        writer.close();
                    };break;
                    case 3:{
                        int c3=-1;
                        while (c3!=0){
                            System.out.println("Qaysi birini name ni ozgartiqmoqchisz\t0=>Exit");
                            for (int i = 0; i < userList.size(); i++) {
                                System.out.println(userList.get(i).getId()+"=>"+userList.get(i).getName());
                            }
                            c3=scanner.nextInt();
                            if (c3==0){
                                break;
                            }else if (c3>0 && c3<=userList.size()){
                                System.out.println("Yangi name kiriting");
                                scanner=new Scanner(System.in);
                                String name=scanner.nextLine();
                                String data=gson.toJson(name);
                                userList.get(c3-1).setName(name);
                                c3=0;
                            }else {
                                break;
                            }
                        }
                    };break;
                    case 4:{
                    };break;
                    default:
                        System.out.println("Bizda bunday buyruq mavjud emas !!!");
                }
            }
            int a=scanner.nextInt(),k=0;

            List<Post> postList=gson.fromJson(new FileReader("D:\\Java\\Zako\\lesson21\\Post.txt"),new TypeToken<List<Post>>(){}.getType());
            System.out.println("Qaysi biridagi Commentni korishni hohlaysz!!!");
            for (int i = 0; i < postList.size(); i++) {
                if (a==(postList.get(i).getUserId())){
                    System.out.println(postList.get(i).getId()+"=>"+postList.get(i).getTitle());
                }
            }

            int b=scanner.nextInt();
            List<Comment> commentList=gson.fromJson(new FileReader("D:\\Java\\Zako\\lesson21\\Comment.txt"), new TypeToken<List<Comment>>(){}.getType());
            System.out.println("Qaysi Comment haqida ma'lumot oliwni xoxlaysz!!!");
            for (int i = 0; i < commentList.size(); i++) {
                if (b==commentList.get(i).getPostId()) {
                    System.out.println(commentList.get(i).getId() + "=>" + commentList.get(i).getName());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
