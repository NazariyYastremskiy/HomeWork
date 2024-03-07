package lesson7hw;

import java.util.Scanner;
/**
 * AIT-TR , cohort 42.1, Java Basic, HomeWork , Lesson#7
 * version 07-Mar-24
 * author Nazariy Yastremskiy
 */
public class HomeWorkLesson7 {
    public static void main(String[] args) {
        //task#2
        Scanner scanner = new Scanner(System.in);
    int targetDistance = generateTargetDistance();

    System.out.println("Target range: " + targetDistance + " meters");

    System.out.print("Enter the angle (in degrees):");
    double angle = scanner.nextDouble();

    System.out.print("Enter the initial velocity (in m/s):");
    double velocity = scanner.nextDouble();

    double projectileDistance = calculateProjectileDistance(angle, velocity);

    final int radiusOfDestruction = 10; 
    if (projectileDistance < targetDistance - radiusOfDestruction) {
        System.out.println("Failure to reach. The shell fell too soon.");
    } else if (projectileDistance > targetDistance + radiusOfDestruction) {
        System.out.println("Flight. The shell flew past the target.");
    } else {
        System.out.println("Target has been hit!");
    }

    scanner.close();
}

    public static int generateTargetDistance() {
        return (int) (Math.random() * 500) + 100; // Дальность от 100 до 600 метров
    }

    public static double calculateProjectileDistance(double angle, double velocity) {
        double g = 9.81;
        double radians = Math.toRadians(angle);

        return Math.pow(velocity, 2) * Math.sin(2 * radians) / g;
    }
}

