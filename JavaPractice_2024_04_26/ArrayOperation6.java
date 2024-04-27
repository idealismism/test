package JavaPractice_2024_04_26;

public class ArrayOperation6 {
    public static void main(String[] args) {
        /*
        定义一个数组{1,3,4,2,6,2,6,2,8,2,6},要求输出结果是不重复的数
         */
        // 定义数组
        int[] numbers = {1, 3, 4, 2, 6, 2, 6, 2, 8, 2, 6};

        // 输出不重复的数字
        System.out.println("不重复的数有：");
        for (int i = 0; i < numbers.length; i++) {
            boolean isUnique = true;
            // 检查当前数字之前是否出现过
            for (int j = 0; j < i; j++) {
                if (numbers[j] == numbers[i]) {
                    isUnique = false;
                    break;
                }
            }
            // 如果当前数字之前没有出现过，则打印
            if (isUnique) {
                System.out.println(numbers[i]);
            }
        }
    }
}