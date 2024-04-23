package OperationsPractice;

import java.util.Scanner;

public class OperatorsPractice_Test5_2024_04_22 {
    public static void main(String[] args) {
        /*
        这个综合性的练习题结合了三元运算符、位运算符、递增和递减运算符等不同类型的运算符。
        程序要求用户输入一个整数，
        然后对该整数进行奇偶判断、位运算右移、递增和递减操作，
        并输出相应的结果
         */
        //1.输入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个整数");
        int num = sc.nextInt();
        //2.对该整数进行奇偶判断
        String evenOdd = (num % 2 == 0 ? num + "是偶数" : num + "是奇数");
        //位运算右移
        int shiftedNum = num >> 2;
        //递增和递减操作
        int incremented = shiftedNum++;
        int decremented = --shiftedNum;
        // 输出结果
        System.out.println("输入的整数是：" + num);
        System.out.println("输入的整数是" + evenOdd);
        System.out.println("右移两位后的值是：" + shiftedNum);
        System.out.println("递增后的值是：" + incremented);
        System.out.println("递减后的值是：" + decremented);
        /*
        位运算是一种对二进制数字进行操作的运算方式，它直接操作二进制位（0和1）。
        在Java中，位运算符用于执行位级操作，例如移位、按位与、按位或、按位异或等。
        以下是一些常用的位运算符及其功能：
        按位与（&）：对两个操作数的每个对应位执行逻辑与操作，
        只有在两个位都为1时结果才为1，否则为0。
        例如：1010 & 1100 = 1000
        按位或（|）：对两个操作数的每个对应位执行逻辑或操作，
        只要两个位中有一个为1，结果就为1。
        例如：1010 | 1100 = 1110
        按位异或（^）：对两个操作数的每个对应位执行异或操作，
        当两个位不相同时结果为1，相同时为0。
        例如：1010 ^ 1100 = 0110
        按位取反（~）：对操作数的每个位执行取反操作，即0变为1，1变为0。
        例如：~1010 = 0101
        左移（<<）：将操作数的所有位向左移动指定的位数，右侧空出的位用0填充。
        例如：1010 << 2 = 101000
        右移（>>）：将操作数的所有位向右移动指定的位数，左侧空出的位用符号位（正数为0，负数为1）填充。
        例如：1010 >> 2 = 10
        数字12的二进制表示为：1100
        1100表示十进制数12。
        将数字12向右移动两位：
        在这种情况下，我们将1100向右移动两位，右侧空出的位用0填充
        移动后的结果为：0011
        这里的0011表示十进制数3
         */


    }
}
