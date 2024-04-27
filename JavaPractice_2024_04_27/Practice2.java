package JavaPractice_2024_04_27;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        /*
        2. 给定一个数组，判断某个元素是否在该数组中
         */
        int[] arr ={11,22,33,45,67,78,77,90,100};
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入您要查找的元素");
        int targetNum = sc.nextInt();
        boolean flag = isContain(arr,targetNum);
        if(flag){
            System.out.println("该元素在数组中");
        }else{
            System.out.println("该元素不在数组中");
        }
    }
    //写一个方法来判断元素是否在数组中
    public static boolean isContain(int[] arr,int targetNum){
        for (int i = 0; i < arr.length; i++) {
            if(targetNum == arr[i]){
                return true;
            }
        }
        return false;
    }
}
