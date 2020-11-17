package com.company.lectures.lecture13;

import java.util.UUID;

public class WebClient {

    public String[] getUserRoles(){

        //http call
        String uuid = UUID.randomUUID().toString();
        User u=new User(uuid,"name");
        System.out.println("call to server with body: " +u.toJSON());

        //'{"id":"","roles"=[" ", "","",""]}
        //map JSON response on class UserRoles
        String [] roles = {"admin","approver","financial"};
        UserRoles userRoles = new UserRoles(uuid,roles);
        return userRoles.getRoles();
    }

    public boolean hasRoles(String role){
        for(String r: getUserRoles()){
            if(r.equals(role)){
                return true;
            }
        }
        return false;
    }


    private class User {
        String id;
        String username;

        public User(String id, String username){
            this.id=id;
            this.username=username;

        }

        public String toJSON() {
            return "{" +
                    "\"id=\":\"" + id + '\"' +
                    ", \"username\" :\"" + username + '\"' +
                    '}';
        }
    }

    private class UserRoles{
        String id;
        String[] roles;

        public UserRoles(String id, String[] roles) {
            this.id = id;
            this.roles = roles;
        }

        public String getId() {
            return id;
        }

        public String[] getRoles() {
            return roles;
        }
    }

}
