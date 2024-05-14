package com.itheima_JavaBean_test3_05_14;

import java.util.Scanner;

public class carTest {
    public static void main(String[] args) {
        //定义一个数组
        car[] arr = new car[3];
        //创建三个汽车对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车对象,要放在循环里面,
            // 每次循环都要创建一个新的对象,否则前面的对象会被后面的覆盖
            car c = new car();
            //录入数据
            System.out.println("请录入第"+(i+1)+"个汽车的品牌");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("请录入第"+(i+1)+"个汽车的价格");
            double price = sc.nextDouble();
            c.setPrice(price);
            System.out.println("请录入第"+(i+1)+"个汽车的颜色");
            String color = sc.next();
            c.setColor(color);
            //放入数组
            arr[i] = c;
        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            car car = arr[i];
            System.out.println(car.getBrand()+" "+car.getPrice()+" "+car.getColor());
        }


    }
}
