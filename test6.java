package com.itheima.Test;

public class test6 {
    public static void main(String[] args) {


    /*数字加密
    需求:某系统的数字密码(大于0),比如1983,采用加密方式进行传输
    规则如下:
    先得到每位数,然后每位数都加上5,再对10取余,最后将所有数字反转,得到一串新数
    1 9 8 3
    6 14 13 8
    6 4 3 8
    8 3 4 6
    加密后得到的结果就是:8346
     */
        //1.把整数里面的每一位放到数组当中
        //得到整数的位数
        int num = 1983;
        int temp1 = num;
        int count = 0;
        while (num != 0) {
            num = num / 10;//去除个位
            count++;//去除一位,位数加1
        }
        System.out.println(count);
        //将每一位放入数组中
        int[] arr = new int[count];
        int index = arr.length - 1;
        while (temp1 != 0) {
            int ge = temp1 % 10;
            temp1 =temp1 /10;
            arr[index] = ge;
            index--;
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        //2.加密
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        //反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //3.拼接,变成加密之后的结果
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }

        System.out.print(number);
    }
}