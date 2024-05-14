package com.itheima_JavaBean_05_10.test3;

public class Friend {
    //定义数组存储4个朋友对象
    //朋友的属性:姓名,年龄,性别,爱好
    //要求1:计算出四个朋友的平均年龄
    //要求2:统计年龄比平均值低的朋友有几个?并把她们所有的信息都打印出来
    private String name;
    private int age;
    private char gender;
    private String hobby;

    public Friend() {
    }

    public Friend(String name, int age, char gender, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
