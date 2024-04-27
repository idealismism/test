package JavaPractice_2024_04_26;

public class ArrayOperation3 {
    public static void main(String[] args) {
        /*实现一个方法 containsDuplicate，
        接受一个整型数组作为参数，返回一个布尔值表示数组中是否存在重复元素。
         */
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 6, 8, 9};
        boolean flag = containsDuplicate(arr);
        System.out.println(flag);
        if (flag){
            System.out.println("数组中存在重复元素");
        } else {
            System.out.println("数组中不存在重复元素");
        }
    }

    public static boolean containsDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }

        return false;

    }
}
