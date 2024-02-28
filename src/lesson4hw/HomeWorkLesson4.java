
// homework number 4 grup cohort 42-1
// by Nazariy Yastremskiy
//  execution date 28.02.2024

package lesson4hw;

import java.util.Scanner;

public class HomeWorkLesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = scanner.next();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите вашу фамилию");
        String firstname = scanner.next();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите ваш город");
        String sity = scanner.next();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
       int years = scanner.nextInt();

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Введите ваш рост");
        float  growth  = scanner.nextFloat();

        String generaldata = ( "Меня зовут : " + name + " " + firstname +  ","  + "мой город " + sity  + "," +"мне " + years + "год" + "," + "мой рост " + growth + ".");
        System.out.println(generaldata);
    }
}
