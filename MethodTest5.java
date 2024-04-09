package com.itheima.Test;

public class MethodTest5 {
    public static void main(String[] args) {
        /*
        定义一个方法判断数组中的某一个数是否存在,将结果返回给调用处
         */
        int[] arr ={11,3,34,5,66,78};
        boolean flag = getContain(arr,66);
        System.out.println(flag);
    }

    public static boolean getContain(int[] arr,int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return true;
            }
        }
        return false;//当数组里面的数据全部比较完之后,才能断定
    }

}
//return break关键字的区别
//return:其实和循环没有什么关系,跟方法有关的,表示1结束方法,2返回结果
//如果方法执行到了return,那么整个方法全部结束,里面的循环也会随之结束了

//break关键字
//和方法没有什么关系,结束循环或者switch的