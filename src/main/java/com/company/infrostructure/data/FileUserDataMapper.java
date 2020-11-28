package com.company.infrostructure.data;

import java.io.*;

public class FileUserDataMapper implements UserDataMapper{

    private User[] user = new User[6];

    public FileUserDataMapper(String userFile) {

        try(FileReader fr = new FileReader(new File(userFile));
            BufferedReader br = new BufferedReader(fr)) {

            String line;

            while((line=br.readLine())!=null){
                String[] parts = line.split(",");

                for (int i = 0; i < user.length; i++) {
                    if(user[i]==null){
                        user[i]=new User(parts[0],parts[1],parts[2],parts[3] );
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
         }
    }

    @Override
    public User findUserByEmail(String email) {
        for (User u: user) {
            if(u.getEmail().trim().equals(email)){
                return u;
            }
        }

       throw new UserNotFoundException("User with email= ["+email+"] was not found.");
    }

    @Override
    public User findUsedByName(String name) {
        for(User u: user) {
            if(u.getName().trim().equals(name)){
                return u;
            }
        }
        throw new UserNotFoundException("User with email= ["+name+"] was not found.");
    }
}
