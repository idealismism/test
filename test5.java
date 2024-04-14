package com.itheima.Test;

import java.util.Random;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        /*在唱歌比赛中,有6名评委给选手打分,分数范围是[0~100]之间的整数
        选手的最后得分为:丢掉最高分 、最低分后的四个评委的平均分,
        请完成上述过程并计算出选手的得分
         */
        //1.定义一个数组,用来存储6名评委的打分
        int[] scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
        //2.求出数组中的最大值
        int max = getMax(scoreArr);
        //3.求出数组中的最小值
        int min = getMin(scoreArr);
        //4.求出数组中6个分数的总和
        int sum = getSum(scoreArr);
        //5.(总和-最大值-最小值)/4
        int avg = (sum - max - min) / (scoreArr.length - 2);
        System.out.println("选手的最终得分为"+avg);
    }

    //定义方法
    public static int[] getScores() {
        int[] scores = new int[6];
        //使用键盘录入输入6名评委的分数
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入评委的打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;//符合范围才会存入数组当中,索引才会加1
            }

        }
        return scores;
    }

    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] < min) {
                min = scoreArr[i];
            }
        }
        return min;
    }

    public static int getSum(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        return sum;
    }
}