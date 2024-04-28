package JavaPracitice_2024_04_28;

public class Practice2 {
    public static void main(String[] args) {
        /*
        4. 有一堆硬币，每次只能拿一个或者两个，求最少多少次可以拿完硬币
       桌上有n堆力扣币，每堆的数量保存在数组coins中。我们每次可以选择任意一堆，
       拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。
	   {10, 8, 5, 3, 27, 99}
         */
        int[] coins = {10,8,5,3,27,99};
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            if(coins[i] % 2 == 0){
                count += coins[i] / 2;
            } else{
                count += coins[i] / 2 + 1;
            }
        }
        System.out.println("拿完所有力扣币的最少次数为"+count+"次");
    }
}
