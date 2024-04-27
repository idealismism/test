package JavaPractice_2024_04_26;

public class ArrayOperation1 {
    public static void main(String[] args) {
        /*
       实现一个方法 reverseArray，接受一个整型数组作为参数，
       返回一个新数组，新数组中的元素是原数组中元素的逆序排列。
         */
        int[] arr = {1,2,3,4,5,6};
        int[] newArr = reverseArray(arr);
        for (int j : newArr) {
            System.out.print(j+" ");
        }
    }

    /**
     * 通过使用两个指针分别从数组的两端向中间移动，
     * 并交换对应位置的元素，实现数组的逆序操作。
     * @param arr 输入原来的数组
     * @return 逆序数组
     */
    public static int[] reverseArray(int[] arr){
        for (int i = 0,j = arr.length-1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
