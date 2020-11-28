package com.company.homeworks.HW14;

import com.company.infrostructure.data.FileUserDataMapper;
import com.company.infrostructure.data.User;
import com.company.infrostructure.data.UserDataMapper;
import com.company.infrostructure.data.UserNotFoundException;

public class UserApp {
    public static void main(String[] args) {

        UserDataMapper users = new FileUserDataMapper("User.txt");

        try {
            User user = users.findUserByEmail("email5@gmail.com");
            System.out.println(user);
        }catch(UserNotFoundException e){
            e.printStackTrace();
        }
        try {
            User userN = users.findUsedByName("username1");
            System.out.println(userN);
        }catch (UserNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
