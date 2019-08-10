package com.xcy.pojo;

public class Admin {
    private int id;
    private String username;
    private String password;
    private String email;
    private String role;

    public String getRole() {
        if (role == "1" || role.equals("1")){
            return "超级管理员";
        }else if (role == "2" || role.equals("2")){
            return "普通管理员";
        }else {
            return "你猜";
        }
    }
    public void setRole(String role) {
        this.role = role;
    }
    public Admin() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
