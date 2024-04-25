package ArrayPractice_2024_04_25;

public class ArrayPractice3 {
    public static void main(String[] args) {
        /*
        题目： 实现一个方法，接受一个字符串数组作为参数，返回一个新数组，
        新数组中的元素是原数组中所有长度大于等于5的字符串的首字母大写形式。
         示例： 输入：["apple", "banana", "orange", "grape", "kiwi"]
         输出：["Apple", "Banana", "Orange"]

        要求：
        方法名为 capitalizeLongStrings
        法参数为一个字符串数组
        返回一个新的字符串数组，包含原数组中所有长度大于等于5的字符串的首字母大写形式
         */

        /*练习:如何将一个字符串的首字母进行大写
        我们首先使用 substring(0, 1) 获取字符串的首字母，
        然后使用 toUpperCase() 方法将其转换为大写，
        最后再与原字符串的剩余部分拼接起来，即可得到首字母大写的字符串。
        String str = "hello";
        String capitalizedStr = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.println(capitalizedStr); // 输出 "Hello"

         */

        String[] arr = {"apple", "banana", "orange", "grape", "kiwi", "red"};
        String[] newArr = capitalizeLongStrings(arr);
        for (String s : newArr) {
            if (s != null) {
                System.out.print(s + " ");
            }

        }


    }

    /**
     * 将原来数组中字符串长度大于等于5的首字母进行大写
     *
     * @param arr 输入原来的数组
     * @return 新的数组
     */
    public static String[] capitalizeLongStrings(String[] arr) {

        //先判断一下新数组的长度
        int count = 0;
        for (String s : arr) {
            if (s.length() >= 5) {
                count++;
            }
        }
        String[] newArr = new String[count];
        int index = 0;
        for (String s : arr) {
            if (s.length() >= 5) {
                newArr[index] = s.substring(0, 1).toUpperCase() + s.substring(1);
                index++;
            }
        }
        return newArr;
    }
}
