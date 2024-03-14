import java.util.Arrays;

// Задача билета 4. Напишите код, с помощью которого можно перевернуть массив. Данное задание решите в простом блокноте или в Google-доке
class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : reverseArr(arr)) {
            System.out.println(i);
        }
        String[] strArr = {"one", "two", "three", "four", "five"};
        reverseStrArr(strArr);
        System.out.println(Arrays.toString(strArr));
    }

    // Метод лучше
    private static void reverseStrArr(String[] strArr) {
        String s;
        for (int i = 0; i < strArr.length / 2; i++) {
            s = strArr[i];
            strArr[i] = strArr[strArr.length - 1 - i];
            strArr[strArr.length - 1 - i] = s;
        }
    }

    // Простой перебор
    private static int[] reverseArr(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }
}