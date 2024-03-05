package lesson6hw;

import java.util.Scanner;

/**
 * AIT-TR , cohort 42.1, Java Basic, HomeWork , Lesson#5
 * version 02-Mar-24
 * author Nazariy Yastremskiy
 */
public class HomeWorkLesson6 {
    public static void main(String[] args) {
        //Task#1
        System.out.println("Pick a number 1, 2 or 3.");
        Scanner scanner = new Scanner(System.in);
        int num = 1; // scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("error 404");
        }
        //task#2
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter one number from 1 to 7");
        int a = scanner1.nextInt();
        switch (a) {
            case 1:
                System.out.println("Monday ");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("day off");
                break;
            case 7:
                System.out.println("day off");
                break;
            default:
                System.out.println("error");
        }
        //task#3
        int  i = 0;
        while (i <= 9) {
            i++;
            System.out.println("task" + i);
        }
        //task#4
        int j = 1;
        do {
            if (j % 5 == 0) {
                System.out.println(j);
            }
            j++;
        } while (j <= 100);

        //task#5
        Scanner scanner2 = new Scanner(System.in);
        String correctWord = "hello";
        String userInput;
        int attempts = 0;

        do {
            System.out.print("Type in the word \"hello\": ");
            userInput = scanner.nextLine();
            attempts++;

            if (userInput.equals(correctWord)) {
                System.out.println("Thanks for typing the right word!");
            } else {
                System.out.println("Wrong word. Try it again.");
            }
        } while (!userInput.equals(correctWord));

        System.out.println("Number of attempts: " + attempts);
        scanner.close();

        //task#6
        String expression = "34 + 8";
        System.out.println(calculate(expression));
    }

    public static int calculate(String expression) {

        expression = expression.replaceAll("\\s+", "");

        int operand1 = 0;
        int operand2 = 0;
        char operation = ' ';
        int index = 0;


        while (Character.isDigit(expression.charAt(index))) {
            operand1 = operand1 * 10 + Character.getNumericValue(expression.charAt(index));
            index++;
        }


        while (!Character.isDigit(expression.charAt(index))) {
            operation = expression.charAt(index);
            index++;
        }

        while (index < expression.length()) {
            operand2 = operand2 * 10 + Character.getNumericValue(expression.charAt(index));
            index++;
        }

        switch (operation) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 != 0) {
                    return operand1 / operand2;
                } else {
                    throw new ArithmeticException("Division by zero");
                }
            default:
                throw new IllegalArgumentException("Unsupported operation");
        }
    }
}

