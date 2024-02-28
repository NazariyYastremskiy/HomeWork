
    // homework number 3 grup cohort 42-1
    // by Nazariy Yastremskiy
    //  execution date 27.02.2024
    package lesson3hw;
    public class Lesson3HomeWork {

    public static void main(String[] args) {

                // task number 1

                // Объявление переменных типа int и присвоение им значений от 0 до 9
                int var0 = 0;
                int var1 = 1;
                int var2 = 2;
                int var3 = 3;
                int var4 = 4;
                int var5 = 5;
                int var6 = 6;
                int var7 = 7;
                int var8 = 8;
                int var9 = 9;

                // Объявление переменной для хранения суммы значений переменных, деленной на 10
                int sum = (var0 + var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9) / 10;

                // task number 2

                // Цена товара A и товара B
                double priceA = 1000.0;
                double priceB = 500.0;

                // Вычисляем сумму товаров до применения скидки
                double totalBeforeDiscount = priceA + priceB;

                // Применяем скидку 10%
                double discount = totalBeforeDiscount * 0.1;

                // Вычисляем стоимость суммы A+B со скидкой
                double totalAfterDiscount = totalBeforeDiscount - discount;

                // Выводим стоимость суммы A+B со скидкой
                System.out.println("Стоимость суммы A+B со скидкой: " + totalAfterDiscount + " Euro");

                // Выводим сумму скидки
                System.out.println("Сумма скидки: " + discount + " Euro");

                // task number 3

                int monday = 10;
                int tuesday = 12;
                int wednesday = 13;
                int thursday = 14;
                int friday = 5;
                int saturday = 16;
                int sunday = 9;
                double result = (monday + tuesday + wednesday + thursday + friday + saturday + sunday);
                double summa = result / 7;
                System.out.println(summa);

                // task number 4

                int number = 10;

                // Остаток от деления на 2
                int remainderDivBy2 = number % 2;
                System.out.println("Остаток от деления числа " + number + " на 2: " + remainderDivBy2);

                // Остаток от деления на 3
                int remainderDivBy3 = number % 3;
                System.out.println("Остаток от деления числа " + number + " на 3: " + remainderDivBy3);

                // task number 5

                int x = 3;
                x += x++;
                System.out.println("Значение x: " + x);
            }
        }

