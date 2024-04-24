package If_Loop_Practice_2024_04_24;

import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        /*
         输入三个整数，输出最大的
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("录入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("录入第二个整数");
        int num2 = sc.nextInt();
        System.out.println("录入第三个整数");
        int num3  = sc.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println("最大值为" + num1);
        } else if (num2 > num3 ) {
            System.out.println("最大值为"+ num2);
        }else{
            System.out.println("最大值为"+ num3);
        }

    }
}
