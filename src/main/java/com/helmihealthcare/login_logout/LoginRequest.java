package com.helmihealthcare.login_logout;

public class LoginRequest {

    private String username;
    private String password;

    public String geUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
