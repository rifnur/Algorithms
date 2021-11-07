package Lesson5;

//1. Написать программу по возведению числа в степень с помощью рекурсии.
//2. Написать программу «Задача о рюкзаке» с помощью рекурсии.
public class Main {
    public static void main(String[] args) {
        Item[] arrOfItems = {new Item(9, 3),
                new Item(4, 4),
                new Item(5, 5),
                new Item(8, 6),
                new Item(7, 7)};

        BagPack backpack = new BagPack(arrOfItems);
        int capacity = 10;
        System.out.println("Написать программу «Задача о рюкзаке» с помощью рекурсии.");
        System.out.println(backpack.recursiveBestSum(arrOfItems.length - 1, capacity));
        System.out.println("Написать программу по возведению числа в степень с помощью рекурсии.");
        System.out.println(exponentiation(5, 3));
    }


    //Задание 1
    public static double exponentiation(double value, double power) {
        if (value == 0 && power <= 0) {
            throw new ArithmeticException("Значения должны быть больше 0");
        }
        if (power == 0) {
            return 1;
        } else if (power < 0) {
            return 1 / value * exponentiation(value, ++power);
        } else {
            return value * exponentiation(value, --power);
        }
    }
}