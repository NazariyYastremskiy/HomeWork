package lesson9hw;
import java.util.Arrays;

/**
 * AIT-TR , cohort 42.1, Java Basic, HomeWork , Lesson#9
 * version 22-Mar-24
 * author Nazariy Yastremskiy
 */
public class HomeWorkLesson9 {
    public static void main(String[] args) {
        task1(3);
    }

    static void task1(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("task" + i);
        }
    }

    static void task2(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }
//    public static void printArray(int[] arr, boolean reverse) {
//        if (reverse) {
//            printReversedArray(arr);
//        } else {
//            System.out.println(Arrays.toString(arr));
//        }
//    }
public static double[] getMinMaxAverage(int[] arr) {
    double min = arr[0];
    double max = arr[0];
    double sum = arr[0];

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
        if (arr[i] > max) {
            max = arr[i];
        }
        sum += arr[i];
    }

    double average = sum / arr.length;
    return new double[]{min, max, average};
}
}


