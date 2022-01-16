package com.company;

public class Doctor implements Login{
    public int id;
    public int password;
    public Doctor(int id,int password) {
        this.id = id;
        this.password = password;
    }
    public void info() {
        System.out.println("Age: " + id);
        System.out.println("password : " + password);
    }
}
