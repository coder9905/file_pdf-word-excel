package uz.Baxtiyor.Amaliyot_uchun;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import uz.Baxtiyor.Amaliyot_uchun.json.Respose;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Scanner;

public class Dict {
        public static final String api_key = "dict.1.1.20211126T164739Z.ac2bc568d1d8734f.c823d0ccc702e02eca868713db0d81da0a2dc9bf";
        public static final String url_get_langs = "https://dictionary.yandex.net/api/v1/dicservice.json/getLangs?key="+api_key;
        public static final String url_look_up = "https://dictionary.yandex.net/api/v1/dicservice.json/lookup?key="+api_key+"&lang=";
        private static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            URL url = null;
            try {
                url = new URL(url_get_langs);
                URLConnection connection = url.openConnection();
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                Gson gson = new Gson();
                List<String> langList = gson.fromJson(reader,new TypeToken<List<String>>(){}.getType());

                int c = -1;
                while (c!=0){
                    System.out.println("Select: ");
                    for (int i = 0; i < langList.size(); i++) {
                        System.out.println((i+1)+"=> "+langList.get(i));
                    }
                    c = scanner.nextInt();
                    if (c!=0&&c<=langList.size()){
                        System.out.println("So'z kiriting: ");
                        scanner = new Scanner(System.in);
                        String word = scanner.nextLine();
                        getDictionaries(langList.get(c-1),word);
                    } else break;
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        public static void getDictionaries(String lang, String word){
            URL url = null;
            try {
                url = new URL(url_look_up+lang+"&text="+word);
                URLConnection connection = url.openConnection();
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                Gson gson = new Gson();
                Respose langList = gson.fromJson(reader,Respose.class);
                for (int i = 0; i < langList.getDef().size(); i++) {
                    System.out.println(langList.getDef().get(i).getText()+" "+ langList.getDef().get(i).getPos());
                    for (int j = 0; j < langList.getDef().get(i).getTr().size(); j++) {
                        System.out.println(langList.getDef().get(i).getTr().get(j).getText());
                    }
                    System.out.println("______");
                    System.out.println();
                }

            } catch (Exception e){
                e.printStackTrace();
            }
    }
}
