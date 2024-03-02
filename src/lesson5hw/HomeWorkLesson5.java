package lesson5hw;

import java.util.Random;
import java.util.Scanner;

/**
 * AIT-TR , cohort 42.1, Java Basic, HomeWork , Lesson#5
 * version 02-Mar-24
 * author Nazariy Yastremskiy
 */
public class HomeWorkLesson5 {
    public static void main(String[] args) {

        //Task#1
        Scanner scanner = new Scanner(System.in);
        System.out.println("lead one number ");
        int num = scanner.nextInt();
        boolean res = num % 2 == 0;
        boolean res2 = num % 3 == 0;
        System.out.println("Number" + ":" + " " + num +   " " + "Even:" + " "+  res + " " + "Multiple of 3" + res2 + "; Even and multiple of 3: " + (res && res2 ));

        //Task#2
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("lead one number 1 , 2 , or 3");
        int num2 = scanner1.nextInt();

        if (num2 == 1) {
            System.out.println("one");
        } else if (num2 == 2) {
            System.out.println("two");

         }else if (num2 == 3 ) {
            System.out.println("three");

        }else {
            System.out.println("Error");

            //Task#3
            Random random = new Random();
            int num11 = random.nextInt(101);
            int num12 = random.nextInt(101);
            int num13 = random.nextInt(101);
            int num14 = random.nextInt(101);

            System.out.println("Число 1: " + num11);
            System.out.println("Число 2: " + num12);
            System.out.println("Число 3: " + num13);
            System.out.println("Число 4: " + num14);

            int max = num11 ;
            if (num2 > max);{
                max = num12;
            }
            if (num13 > max) {
                max = num13;
            }
            if (num14 > max) {
                max = num14;
            }

            System.out.println("Maximum number: " + max);

            //Task#4
            

        }
        }
            }




