package ArrayPractice_2024_04_25;


public class ArrayPractice2 {
    public static void main(String[] args) {
        /*
        题目： 实现一个方法，接受一个整数数组作为参数，返回一个新数组，
        新数组中的元素是原数组中所有偶数元素的平方。
        示例： 输入：[1, 2, 3, 4, 5] 输出：[4, 16]

        要求：
        方法名为 squareEvenNumbers
        方法参数为一个整数数组
        返回一个新的整数数组，包含原数组中所有偶数元素的平方
         */
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] newArr = squareEvenNumbers(arr);
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] != -1) {
                System.out.print(newArr[i] + " ");
            }

        }
    }

    public static int[] squareEvenNumbers(int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = -1;
            if (arr[i] % 2 == 0) {
                newArr[i] = arr[i] * arr[i];

            }
        }
        return newArr;
    }
}
