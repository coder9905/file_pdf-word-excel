package com.company.Gson.jsonDars;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import javafx.geometry.Pos;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class Application {
        public static void main(String[] args) {
            try {
                Gson gson = new Gson();
//                BufferedReader reader = new BufferedReader(new FileReader("D:\\Java\\Zako\\lesson21\\Post.txt"));
//                String line = null;
//            while ((line = reader.readLine()) != null){
//                System.out.println(line);
//
//            }
//            List<Post> posts = gson.fromJson(new FileReader("D:\\Java\\Zako\\lesson21\\Post.txt"),new TypeToken<List<Post>>(){}.getType());
//            posts.forEach(post -> {
//                System.out.println(post.getUserId());
//                System.out.println(post.getId());
//                System.out.println(post.getBody());
//                System.out.println(post.getTitle());
//            });
//                System.out.println(posts.get(0).getId().toString());
//            Post post = gson.fromJson(new FileReader("D:\\Java\\Zako\\lesson21\\post.json"),new TypeToken<Post>(){}.getType());
//            System.out.println(post.toString());


//            Post post1 = new Post(15L,10L,"bu javadan yozildi","....");
//            String data = gson.toJson(post1);
//            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\zako\\test.txt"));
//            writer.write(data);

//            Post post1 = new Post(15L,10L,"bu javadan yozildi","....");
//            Post post2 = new Post(10L,1L,"bu javadan yozildi)2","2....");
//            List<Post> postList = new ArrayList<>(Arrays.asList(post1,post2));
//            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\zako\\salom.txt"));
//            String data = gson.toJson(postList);
//            writer.write(data);
////
//            reader.close();

                List<Post> posts = gson.fromJson(new FileReader("D:\\Java\\Zako\\lesson21\\User.txt"),new TypeToken<List<Post>>(){}.getType());
                posts.forEach(post -> {
                    System.out.println(post.getUserId());
                    System.out.println(post.getId());
                    System.out.println(post.getBody());
                    System.out.println(post.getTitle());
                });

//            writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
}
