package com.itheima_JavaBean_test4_05_16;

public class StudentTest3 {
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

        //要求5:查询数组number为232的学生,如果存在则将他的年龄加1;
        //要看number所在元素是否存在
        int index = getIndex(stu, 232);
        if (index >= 0) {
            //number存在,则将他的年龄+1
            //得到它的年龄
            Student student = stu[index];
            //加1得到新的年龄
            int newAge = student.getAge()+1;
            //把新的年龄放进数组中
            student.setAge(newAge);
            //遍历数组
            printArr(stu);

        } else {
            //不存在
            System.out.println("学号不存在");
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
    //定义一个方法看number是否存在于数组中,如果存在返回它的索引
    public static int getIndex(Student[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            if (student != null) {
                int id = student.getNumber();
                if (id == number) {
                    return i;
                }
            }
        }
        return -1;
    }
}
