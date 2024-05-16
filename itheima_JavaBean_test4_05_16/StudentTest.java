package com.itheima_JavaBean_test4_05_16;

public class StudentTest {
    public static void main(String[] args) {
        //定义一个数组
        Student[] stu = new Student[3];
        //创建学生对象
        Student stu1 = new Student(231, "zhangsan", 19);
        Student stu2 = new Student(232, "lisi", 20);
        //Student stu3 = new Student(233, "john", 21);
        //将学生对象添加到数组当中
        stu[0] = stu1;
        stu[1] = stu2;
        //stu[2] = stu3;

        //要求1 :再次添加一个学生对象,并在添加的时候进行学号的唯一性判断
        //创建一个学生对象
        Student stu4 = new Student(234, "lisa", 23);
        //判断学生对象的学号是否存在(学号的唯一性)
        boolean flag = contains(stu, stu4.getNumber());
        if (flag) {
            //学号已经存在
            System.out.println("该学号已存在,请重新输入一个学号");
        } else {
            //学号不存在
            //将该学生存入数组中
            //判断数组元素是否已满
            int count = getCount(stu);
            //1.数组还有空位,直接存入
            //新元素的索引即为count,例如原数组为[num1,num2,null]
            //此时count为2,表示数组中已经有了2个元素,如果下一次要添加数据,就是添加到2索引的位置
            if (count != stu.length) {
                stu[count] = stu4;
                printArr(stu);
            } else {
                //2.数组已满,需要创建新的数组,新数组的长度为老数组的长度+1
                Student[] newArr = creatNewArr(stu);
                newArr[count] = stu4;
                //要求2:添加完毕之后,遍历数组所有元素信息
                printArr(newArr);
            }

        }

    }

    //定义一个方法用于打印数组
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            System.out.println(student.getNumber() + "," + student.getName() + "," + student.getAge());
        }
    }

    //定义一个方法用于创建新数组
    public static Student[] creatNewArr(Student[] stu) {
        Student[] newArr = new Student[stu.length + 1];
        //循环遍历老数组中的每一个元素,将老数组的元素添加到新数组中
        for (int i = 0; i < stu.length; i++) {
            newArr[i] = stu[i];
        }
        return newArr;
    }

    //定义一个方法判断数组的元素个数
    public static int getCount(Student[] stu) {
        //定义一个计数器用于记录数组中元素的个数
        int count = 0;
        for (int i = 0; i < stu.length; i++) {
            if (stu[i] != null) {
                count++;
            }
        }
        return count;
    }

    //定义一个方法用于判断学号的唯一性
    //1.我要干嘛  唯一性判断
    //2.我干这件事,需要什么才能完成 数组,number
    //3.调用处是否需要返回方法的结果  必须返回
    public static boolean contains(Student[] stu, int number) {
        for (int i = 0; i < stu.length; i++) {
            //依次获取数组中的每一个学生对象
            Student student = stu[i];
            //获取数组中学生对象的学号
            //如果数组中元素有null,则不能执行下述操作
            if (stu[i] != null) {
                int id = student.getNumber();
                //比较
                if (number == id) {
                    return true;
                }
            }
        }
        return false;
    }

}
