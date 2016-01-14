package com.shixun.c18;

/**
 * Created by zn on 2016/1/14.
 */
public class User {
    private long id;
    private String name;
    private String email;

    static {
        System.out.println("static {}");
    }

    public User() {
        System.out.println("public User()");
    }

    public User(String name) {
        this.name = name;
        System.out.println("public User(String name) ");
    }
    public User(String name,long id) {
        this.name = name;
        this.id = id;
        System.out.println("public User(String name,long id) ");
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "User{id:" + id + ",name:" + name + ",email:" + email  + "}";
    }
    public String showInfo(){
        //System.out.println(toString());
        return toString();
    }
}
