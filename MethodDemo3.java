package com.itheima.MethodDemo;

public class MethodDemo3 {
    public static void main(String[] args) {
    //掌握带有返回值的方法和调用
        //直接调用
      getSum(11,22,33);

       //赋值调用
        int sum5 =getSum(11,22,33);

        //输出调用
        System.out.println(getSum(11,23,33));

        //第一季度的营业额
        int sum1 = getSum(11,22,33);
        //第二季度的营业额
        int sum2 = getSum(33,44,55);
        //第三季度的营业额
        int sum3 = getSum(30,40,50);
        //第四季度的营业额
        int sum4 = getSum(20,30,40);
        int sum = sum1 +sum2 +sum3 +sum4;
        System.out.println(sum);

    }
    public static int getSum(int num1 ,int num2,int num3){
        int result = num1 + num2 + num3;
        return  result;//返回方法的调用处
    }
}
