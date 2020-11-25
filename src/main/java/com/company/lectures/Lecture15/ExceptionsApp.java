package com.company.lectures.Lecture15;

import com.company.infrostructure.wdm.DefaultWebDriverManager;
import com.company.infrostructure.wdm.interfaces.WebDriverFactory;
import com.company.infrostructure.wdm.interfaces.WebDriverManager;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class ExceptionsApp {
    public static void main(String[] args) {

        FileWriter fw=null;
        try{
            fw = new FileWriter("someFile.txt", true);
            for (int i = 0; i < 10; i++) {
                fw.write(System.currentTimeMillis()+"\n");
                Thread.sleep(1_000);
            }

        } catch (IOException e){
            System.out.println("Smth with file");

        } catch (InterruptedException e) {
            System.out.println("Smth with sleep");
        }
            finally{
            closeFile(fw);
        }


//        URL url=null;
//        try {
//            url = new URL("http://localhost:8080/users");
//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e){
//            e.printStackTrace();
//        }catch (Exception e){
//            e.printStackTrace();
//        } finally {
//            if (url!=null){
//                System.out.println("Close");
//            }
//        }

//        String browser=null;
//
//        try{
//            WebDriverManager wdm = new DefaultWebDriverManager();
//            browser=wdm.getBrowser();
//
//        }catch (ArithmeticException ex){
//            System.out.println("Ooops smth went wrong!");
//            System.out.println(ex);
//            System.exit(1);
//        } catch (IllegalArgumentException ex){
//            System.out.println(ex.getMessage());
//        }
//        System.out.println(browser);
//        System.out.println("End");
    }

    private static void closeFile(FileWriter fw) {
        try {
            if(fw != null)
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
