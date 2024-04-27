package JavaPractice_2024_04_26;

public class ArrayOperation4 {

    public static void main(String[] args) {
        /*
        题目描述：给定一个整型数组 nums，
        将数组中的所有偶数移动到数组的末尾，保持顺序不变,不使用额外的数组。
         */
        int[] nums = {1, 2, 3, 4, 6, 7, 8};
        moveEvenToEnd(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    /**
     * 定义两个指针,left表示左面第一个数,right表示右面最后一个数
     * 如果从左面起,是奇数则left+1
     * 如果从右面向左,是偶数则right-1
     * 如果左面偶数右面奇数,则呼唤位置,同时left+1,right-1
     */
    public static void moveEvenToEnd(int[] nums) {
        for (int left = 0, right = nums.length - 1; left < right; ) {
            if (nums[left] % 2 != 0) {
                left++;
            } else if (nums[right] %2 == 0) {
                right--;
            } else if (nums[left] % 2 == 0 && nums[right] % 2 != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
    }
}
