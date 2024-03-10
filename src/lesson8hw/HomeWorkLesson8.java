package lesson8hw;
import java.util.Random;

public class HomeWorkLesson8 {
    /**
     * AIT-TR , cohort 42.1, Java Basic, HomeWork , Lesson#8
     * version 10-Mar-24
     * author Nazariy Yastremskiy
     */
    public static void main(String[] args) {
//        //Task#1
//        for (int i = 1; i < 11; i++) {
//            System.out.println(i + "Task");
//        }
//        //Task2
//        int[] numbers1 = {5, 10, 15, 25, 35, 48, 51, 54, 43, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
//        System.out.println("Numbers from the array that divide by 5 without remainder:");
//        for (int number : numbers1) {
//            if (number % 5 == 0) {
//                System.out.println(number + " ");
//            }
//        }
//
//        //Task3
//        String[] strings = {"One", "Two", "Twenty"};
//        String longestString = findLongestString(strings);
//
//        for (char ch : longestString.toCharArray()) {
//            System.out.println(ch);
//        }
//    }
//    public static String findLongestString(String[] strings) {
//        String longest = strings[0];
//        for (String str : strings) {
//            if (str.length() > longest.length()) {
//                longest = str;
//            }
//        }
//        return longest;
        //Task4
        int[] numbers;
        numbers = generateRandomArray(10, 1, 100);
        int min = findMin(numbers);
        int max = findMax(numbers);
        double average = findAverage(numbers);

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Arithmetic mean: " + average);
    }
    public static int[] generateRandomArray(int length, int min, int max) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }
    public static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static double findAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}