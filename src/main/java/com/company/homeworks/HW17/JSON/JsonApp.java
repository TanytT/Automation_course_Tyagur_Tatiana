package com.company.homeworks.HW17.JSON;

import com.company.homeworks.HW17.JSON.models.JsonObj;
import com.google.gson.Gson;

import java.io.*;

public class JsonApp {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Tatiana_Tgr\\IdeaProjects\\Automation_course_Tyagur_Tatiana\\src\\main\\java\\com\\company\\homeworks\\HW17\\JSON\\resources\\Example.json");
        BufferedReader br = new BufferedReader( new FileReader(file));
        String jsonEx="";
        String st = "";
        while ((st = br.readLine())!= null){
            jsonEx += st;
        }
        System.out.println(jsonEx);
        Gson gson = new Gson();
        JsonObj jOb = gson.fromJson(jsonEx, JsonObj.class);
        jOb.getWidget().setDebug("+++++++OFF++++");
        jOb.getWidget().getText().setName("++++New name++++++");
        System.out.println(gson.toJson(jOb));

    }
}
