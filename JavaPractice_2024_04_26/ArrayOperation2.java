package JavaPractice_2024_04_26;

public class ArrayOperation2 {
    public static void main(String[] args) {
        /*
        题目：实现一个方法 countOccurrences，
        接受一个整型数组和一个整数作为参数，返回该整数在数组中出现的次数。
         */
        int[] arr = {1, 2, 5, 3, 4, 5, 6, 5};
        int num = 5;
        int count = countOccurrences(arr, 5);
        System.out.println(num+"在数组中出现的次数为"+count);
    }

    public static int countOccurrences(int[] arr, int num) {
        int count = 0;
        for (int j : arr) {
            if (j == num) {
                count++;
            }
        }
        return count;
    }
}
