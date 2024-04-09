package com.itheima.Test;

public class MethodTest1 {
    public static void main(String[] args) {
        //目标:要能区分出什么时候使用带有返回值的方法
        //需求:定义方法,比较两个长方形的面积

        //调用方法获取长方形的面积.在进行比较
        double area1= getArea(4.5,5.6);
        double area2 = getArea(5.2,4.6);
        if(area1 > area2){
            System.out.println("第一个长方形的面积大");
        }else{
            System.out.println("第二个长方形的面积大");
        }
    }
    //在实际开发中,我们一般把重复的代码或具有独立功能的代码抽取到方法当中
    //以后直接调用即可
    //定义一个方法求长方形面积
    //需要长,宽
    public static double getArea(double len,double width){
        double area = len * width;
        return area;
        //方法的调用处是否继续使用方法的结果
        //1.如果要用,那么方法必须有返回值
        //2.如果不用,方法可以写返回值,也可以不写
    }
}
