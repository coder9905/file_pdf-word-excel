package com.company.Gson.jsonVazifa;

import com.company.Gson.jsonVazifa.classes.Comments.Comment;
import com.company.Gson.jsonVazifa.classes.Posts.Post;
import com.company.Gson.jsonVazifa.classes.Users.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        Gson gson=new Gson();

        try {
                List<User> userList = gson.fromJson(new FileReader("D:\\Java\\Zako\\lesson21\\User.txt"), new TypeToken<List<User>>() {
                }.getType());
//            System.out.println(userList.size());
                System.out.println("Userlar bilan taniwing!!!");
                for (int i = 0; i < userList.size(); i++) {
                    System.out.println(userList.get(i).getId() + "=>" + userList.get(i).getName());
                }
                System.out.println("Qaysi biridagi postlarni korishni hohlaysz!!!");
                int a = scanner.nextInt(), k = 0;
                if (a > 0 && a < userList.size()) {
                    List<Post> postList = gson.fromJson(new FileReader("D:\\Java\\Zako\\lesson21\\Post.txt"), new TypeToken<List<Post>>() {
                    }.getType());
                    for (int i = 0; i < postList.size(); i++) {
                        if (a == (postList.get(i).getUserId())) {
                            System.out.println(postList.get(i).getId() + "=>" + postList.get(i).getTitle());
                        }
                    }
                    System.out.println("Qaysi biridagi Commentni korishni hohlaysz!!!");
                    int b = scanner.nextInt();
                    if (b > 0 && b < postList.size()) {
                        List<Comment> commentList = gson.fromJson(new FileReader("D:\\Java\\Zako\\lesson21\\Comment.txt"), new TypeToken<List<Comment>>() {
                        }.getType());
                        for (int i = 0; i < commentList.size(); i++) {
                            if (b == commentList.get(i).getPostId()) {
                                System.out.println(commentList.get(i).getId() + "=>" + commentList.get(i).getName());
                            }
                        }
                        System.out.println("Qaysi Comment haqida ma'lumot oliwni xoxlaysz!!!");
                        int c = scanner.nextInt();
                        if (c > 0 && c <= commentList.size()) {
                            for (int i = 0; i < commentList.size(); i++) {
                                if (c == commentList.get(i).getId()) {
                                    System.out.println("Id=>" + commentList.get(i).getId() + "\nname=>" + commentList.get(i).getName() + "\nPostId=>" + commentList.get(i).getPostId() + "\nBody=>" + commentList.get(i).getBody() + "\nEmail=>" + commentList.get(i).getEmail());
                                }
                            }
                        }
                    } else {
                        System.out.println("Siz mavjud bolmagan Comment raqam kiritdingz");
                    }

                } else {
                    System.out.println("Siz mavjud bo'lmagan post raqamini kiritdingz !!!");
                }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
