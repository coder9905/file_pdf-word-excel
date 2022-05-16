//package uz.zako.json;
//
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
//import uz.zako.json.classes.Post;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Application {
//    public static void main(String[] args) {
//
//        Scanner scanner=new Scanner(System.in);
//        Gson gson=new Gson();
//
//        try {
//
//            int c1=-1;
//            while (c1!=0){
//
//                System.out.println("1=>Posts\t2=>add\t3=>delete\t4=>rename=>0Exit");
//                c1=scanner.nextInt();
//                switch (c1){
//                    case 0:{
//                    };break;
//                    case 1:{
//                        List<Post> courceList=gson.fromJson(new FileReader("D:\\Java\\Zako\\lesson23\\post.txt"), new TypeToken<List<Post>>(){}.getType());
//                        for (int i = 0; i < courceList.size(); i++) {
//                            System.out.println(courceList.get(i).getId()+" "+courceList.get(i).getTitle());
//                        }
//                    };break;
//                    case 2:{
//                        List<Post> courceList=gson.fromJson(new FileReader("D:\\Java\\Zako\\lesson23\\post.txt"), new TypeToken<List<Post>>(){}.getType());
////                        System.out.println("userId kiriting");
//                        scanner=new Scanner(System.in);
//                        Long a=(courceList.size()+1);
//                        scanner=new Scanner(System.in);
//                        System.out.println("id kiriting");
//                        Long b=scanner.nextLong();
//                        scanner=new Scanner(System.in);
//                        System.out.println("title kiriting");
//                        String c=scanner.nextLine();
//                        scanner=new Scanner(System.in);
//                        System.out.println("Body kiriting");
//                        String d=scanner.nextLine();
//                        Post post=new Post(b,a,c,d);
//                        List<Post> postList = new ArrayList<>();
//                        for (int i = 0; i < courceList.size(); i++) {
//                            postList.add(courceList.get(i));
//                        }
//                        postList.add(post);
//                        try {
//
//                            BufferedWriter writer=new BufferedWriter(new FileWriter("D:\\Java\\Zako\\lesson23\\post.txt",false));
//                            String data=gson.toJson(postList);
//                            writer.write(data);
//                            writer.close();
//
//
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    };break;
//                    case 3:{
//                        List<Post>  courceList= null;
//                        try {
//                            courceList = gson.fromJson(new FileReader("D:\\Java\\Zako\\lesson23\\post.txt"), new TypeToken<List<Post>>(){}.getType());
//                        } catch (FileNotFoundException e) {
//                            e.printStackTrace();
//                        }
//                        if (courceList.size()>0) {
//                            int c2=-1;
//                            while (c2!=0) {
//                                try {
//                                    courceList=gson.fromJson(new FileReader("D:\\Java\\Zako\\lesson23\\post.txt"), new TypeToken<List<Post>>(){}.getType());
//                                } catch (FileNotFoundException e) {
//                                    e.printStackTrace();
//                                }
//                                for (int i = 0; i < courceList.size(); i++) {
//                                    System.out.println(courceList.get(i).getId());
//                                }
//                                System.out.println("Qaysi id ni o'chirmoqchisz\t0=> Exit");
//                                c2=scanner.nextInt();
//                                if (c2==0){
//                                    break;
//                                }else if (c2>0 && c2<=courceList.size()){
//                                    List<Post> postList=new ArrayList<>();
//                                    for (int i = 0; i < courceList.size(); i++) {
//                                        if ((c2-1)!=(i)){
//                                            postList.add(courceList.get(i));
//                                        }
//                                    }
//                                    try {
//                                        BufferedWriter writer=new BufferedWriter(new FileWriter("D:\\Java\\Zako\\lesson23\\post.txt",false));
//                                        String data=gson.toJson(postList);
//                                        writer.write(data);
//
//                                        writer.close();
//                                        c2=0;
//                                    } catch (IOException e) {
//                                        e.printStackTrace();
//                                    }
//                                }else {
//                                    System.out.println("Bizda bunday id mavjud emas !!!");
//                                }
//                            }
//                        }else {
//                            System.out.println("Bizda ma'lumot yo'q !!!");
//                        }
//                    };break;
//                    case 4:{
//                        int c3=-1;
//                        while (c3!=0){
//                            List<Post>  postList1=gson.fromJson(new FileReader("D:\\Java\\Zako\\lesson23\\post.txt"), new TypeToken<List<Post>>(){}.getType());
//                            for (int i = 0; i < postList1.size(); i++) {
//                                System.out.println(postList1.get(i).getId());
//                            }
//                            System.out.println("Qaysi o'zgartirmoqchisz\t0=> Exit");
//                            c3=scanner.nextInt();
//                            if (c3==0){
//                                break;
//                            }else if (c3>0 && c3<=postList1.size()){
//                                List<Post> postList=new ArrayList<>();
//                                for (int i = 0; i < postList1.size(); i++) {
//                                    if ((c3-1)==i){
//                                        System.out.println("userId kiriting");
//                                        scanner=new Scanner(System.in);
//                                        Long a=scanner.nextLong();
//                                        scanner=new Scanner(System.in);
//                                        System.out.println("id kiriting");
//                                        Long b=scanner.nextLong();
//                                        scanner=new Scanner(System.in);
//                                        System.out.println("title kiriting");
//                                        String c=scanner.nextLine();
//                                        scanner=new Scanner(System.in);
//                                        System.out.println("Body kiriting");
//                                        String d=scanner.nextLine();
//                                        Post post=new Post(a,b,c,d);
//                                        postList.add(post);
//                                    }else{
//                                        postList.add(postList1.get(i));
//                                    }
//
//                                    try {
//                                        BufferedWriter writer=new BufferedWriter(new FileWriter("D:\\Java\\Zako\\lesson23\\post.txt",false));
//
//                                        String data=gson.toJson(postList);
//                                        writer.write(data);
//
//                                        writer.close();
//                                        c3=0;
//
//
//                                    } catch (IOException e) {
//                                        e.printStackTrace();
//                                    }
//
//                                }
//                            }else {
//                                System.out.println("Bizda bunday id mavjud emas");
//                            }
//
//
//                            List<Post> postList=new ArrayList<>();
//
//                        }
//                    };break;
//                    default:
//                        System.out.println("Bizda bunday buyruq mavjud emas !!!");
//                }
//
//
//            }
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}
