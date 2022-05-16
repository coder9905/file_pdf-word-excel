package uz.Baxtiyor.Vazifa.Dictionary;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import uz.Baxtiyor.Vazifa.Dictionary.Classes.json.Respose;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static final String api_key = "dict.1.1.20211128T055417Z.beb0a2b65ccbb82b.85bce6250f3838eb435672a992c57259124b0546";
    public static final String url_get_langs = "https://dictionary.yandex.net/api/v1/dicservice.json/getLangs?key="+api_key;
    public static final String url_look_up = "https://dictionary.yandex.net/api/v1/dicservice.json/lookup?key="+api_key+"&lang=";
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        URL url=null;

        try {
            url=new URL(url_get_langs);
            URLConnection urlConnection=url.openConnection();
            BufferedReader reader=new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            Gson gson=new Gson();
            List<String> list=gson.fromJson(reader,new TypeToken<List<String>>(){}.getType());

            int c=-1;
            while (c!=0){

                System.out.println("Yangi so'z kiriting");
                for (int i = 0; i < list.size(); i++) {
                    System.out.print((i+1)+"=>"+list.get(i)+"\t");
                    if (i%10==0){
                        System.out.println();
                    }
                }
                System.out.println("0=>Exit");
                System.out.println("Dictionary uchun birini tanlang");
                int lang=scanner.nextInt();
                if (lang==0){
                    break;
                }else if (lang>0 && lang<=list.size()){
                    System.out.println("So'z kiriting");
                    scanner=new Scanner(System.in);
                    String word=scanner.nextLine();
                    url=new URL(url_look_up+list.get(lang-1)+"&text="+word);
                    URLConnection urlConnection1=url.openConnection();
                    BufferedReader reader1=new BufferedReader(new InputStreamReader(urlConnection1.getInputStream()));
                    Gson gson1=new Gson();
                    Respose resposes=gson.fromJson(reader1,Respose.class);

                    for (int i = 0; i < resposes.getDef().size(); i++) {
                        System.out.println(resposes.getDef().get(i).getText()+" "+resposes.getDef().get(i).getPos());
                        for (int j = 0; j < resposes.getDef().get(i).getTr().size(); j++) {
                            System.out.println(resposes.getDef().get(i).getTr().get(j).getText());
                        }
                        System.out.println("**************");
                        System.out.println();
                    }



                }
            }



        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.getMessage();
        }


    }
}
