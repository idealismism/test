package com.itheima_JavaBean_test3_05_14;

public class FriendTest {
    public static void main(String[] args) {
        //1.定义数组存储4个朋友对象
        Friend[] arr = new Friend[4];
        //2.创建4个对象
        Friend friend1 = new Friend("zxy", 22, '女', "看书");
        Friend friend2 = new Friend("ryx", 24, '女', "听歌");
        Friend friend3 = new Friend("秀儿", 26, '女', "游戏");
        Friend friend4 = new Friend("xb", 23, '男', "旅游");
        //3.将对象添加到数组中
        arr[0] = friend1;
        arr[1] = friend2;
        arr[2] = friend3;
        arr[3] = friend4;
        //4.计算平均年龄
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Friend friend = arr[i];
            sum = sum + friend.getAge();
        }
        int average = sum / arr.length;
        System.out.println("平均年龄为" + average);
        //5.判断低于平均值的
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            Friend friend = arr[i];
            if (friend.getAge() < average) {
                count++;
                System.out.println(friend.getName() + "," + friend.getAge() + "," + friend.getGender() + "," + friend.getHobby());
            }
        }
        System.out.println("年龄比平均值低的朋友有" + count + "个");

    }
}
