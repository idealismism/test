package com.itheima.test2;

public class user {
    //设计用户的注册页面,标准的Javabean类
    private String name;
    private String password;
    private String email;
    private String gender;
    private int age;

    public user() {
    }

    public user(String name, String password, String email, String gender, int age) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    

    //空参
    //带全部参数构造
    //set和get方法
    //法一:手动生成
    //法二:快捷键生成
    //alt+insert
    //alt+Fn+insert
    //constructor
    //getter and setter


    //法三:插件生成
    //插件PTG 1秒生成标准javabean类
    //file-settings=plugins-marketplace-ptg-install-ok
    //右键单击空白处 ptg to javabean




}
