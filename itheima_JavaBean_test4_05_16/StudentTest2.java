package com.itheima_JavaBean_test4_05_16;

public class StudentTest2 {
    public static void main(String[] args) {
        //定义一个数组
        Student[] stu = new Student[3];
        //创建学生对象
        Student stu1 = new Student(231, "zhangsan", 19);
        Student stu2 = new Student(232, "lisi", 20);
        Student stu3 = new Student(233, "john", 21);
        //将学生对象添加到数组当中
        stu[0] = stu1;
        stu[1] = stu2;
        stu[2] = stu3;

        //要求3:通过number删除学生信息
        //要找到number在数组中对应的索引
        //如果学号存在,则删除该学生;如果不存在,则提示删除失败
        int index =getIndex(stu,234);
        if(index >= 0){
            //如果学号存在,则删除该学生
            //[num1,num2,num3]
            //[num1,null,num3]
            stu[index] = null;
            //要求4:遍历现在的新数组
            printArr(stu);
        }else {
            //如果不存在,则提示删除失败
            System.out.println("该学号不存在,删除失败");
        }

    }
    //定义一个方法打印数组
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            if(student != null){
                System.out.println(student.getNumber() + "," + student.getName() + "," + student.getAge());
            }
        }
    }
    //定义一个方法找到number在数组中对应的索引
    //我要干什么: 找number对应的索引
    //需要什么:数组,number
    //需要返回吗?需要
    public static int getIndex(Student[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            Student student =arr[i];
            if(student != null){
                int id =student.getNumber();
                if(id == number){
                    return i;
                }
            }
        }
       //因为不存在索引为-1
        return -1;
    }
}