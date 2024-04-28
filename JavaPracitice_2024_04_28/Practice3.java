package JavaPracitice_2024_04_28;

import javax.sound.midi.Soundbank;

public class Practice3 {
    public static void main(String[] args) {
        /*
        5. 将数组中的重复数据去重
        笨方法 双层循环
         */
        int[] arr = {5, 4, 9, 5, 2, 5, 8, 4};
        int[] newArr = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean unique = true;//每次外层循环开始后,重新设置成true;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                   unique = false;
                    break;
                }
            }
            if(unique){
                newArr[count] = arr[i];
                count++;
            }

        }
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
