package com.itheima_JavaBean_test3_05_14;

public class PhoneTest {
    public static void main(String[] args) {
        //定义一个数组存储3部手机对象
        Phone[] arr = new Phone[3];
        //创建手机对象
        Phone phone1 = new Phone("苹果", 5999, "白色");
        Phone phone2 = new Phone("小米", 4399, "粉色");
        Phone phone3 = new Phone("华为", 5488, "黑色");
        //将对象放入数组
        arr[0] = phone1;
        arr[1] = phone2;
        arr[2] = phone3;
        //求数组价格的平均值
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            System.out.println(phone.getBrand() + "," + phone.getPrice() + "," + phone.getColor());
            sum = (int) (sum + phone.getPrice());
        }
        double average = sum * 1.0 / arr.length;
        System.out.println("三部手机的平均价格为"+average);

        //后面会讲到如何保留两位小数
    }

}
