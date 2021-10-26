package Lesson2;

import java.util.Random;

public class Main
{
    public static void main(String[] args) {
//        MyArrayLis myArrayLis = new MyArrayLis();
//        for (int i = 0; i <= 11; i++) {
//            myArrayLis.add((Integer) i);
//        }
//        System.out.println(myArrayLis);


//        System.out.println(myArrayLis.get(25));

//        for (int i = 0; i <= 11; i++) {
//            myArrayLis.add(i,(Integer) i);
//        }
//        System.out.println(myArrayLis);

//        myArrayLis.add(556,10);
//        System.out.println(myArrayLis);

//        myArrayLis.delete(12);
//        System.out.println(myArrayLis);
//        MyArrayLis myArrayLis = new MyArrayLis(200000);
//        for (int i = 0; i <200000 ; i++) {
//            myArrayLis.add(new Random().nextInt(100));
//        }
//
//        System.out.println(myArrayLis);

//        MyArrayLis<Integer> mal = new MyArrayLis<>();
//        mal.add(5);
//        mal.add(3);
//        mal.add(18);
//        System.out.println(mal);
//
//        mal.delete(0);
//        System.out.println(mal);
//        System.out.println(mal.indexOf(5));
//
//        mal.delete((Integer) 7);
//        System.out.println(mal);

//        MySortedArrayList<Integer> msal = new MySortedArrayList<>();
//        msal.add(52);
//        msal.add(45);
//        msal.add(1);
//        msal.add(22);
//        msal.add(15);
//        msal.add(4);
//        msal.add(65);
//        System.out.println(msal);
//
//        msal.add(6,7);
//        System.out.println(msal);
//
//        System.out.println(msal.bynaryFind(7 ));
        /*Сортировка выбором О(n2)*/
/*
        1. Создать массив большого размера (100000 элементов).
        2. Заполнить массив случайными числами.
        3. Написать методы, реализующие рассмотренные виды сортировок, и проверить скорость выполнения каждой.
        */
        Random random = new Random();
        int n = 100000;
        MyArrayListSortViborka<Integer> mal = new MyArrayListSortViborka<>(n);
        for (int i = 0; i < n; i++) {
            mal.add(random.nextInt(100));
        }
//        System.out.println(mal);
        long timeStartViborka = System.currentTimeMillis();
        mal.selectionSort();
//        System.out.println(mal);
        long timeEndViborka = System.currentTimeMillis();
        long milliseconds = timeEndViborka - timeStartViborka;
        System.out.println("Сортировка выборкой выполнена за "+milliseconds+" миллисекунд");
        /**/

        MyArrayListSortViborka<Integer> malVstavka = new MyArrayListSortViborka<>(n);
        for (int i = 0; i < n; i++) {
            malVstavka.add(random.nextInt(100));
        }
        long timeStartVstavka = System.currentTimeMillis();
        malVstavka.insertionSort();
//        System.out.println(malVstavka);
        long timeEndVstavka = System.currentTimeMillis();
        long millisecondsVstavka = timeEndVstavka - timeStartVstavka;
        System.out.println("Сортировка вставкой выполнена за "+millisecondsVstavka+" миллисекунд");

        MyArrayListSortViborka<Integer> malBubble = new MyArrayListSortViborka<>(n);
        for (int i = 0; i < n; i++) {
            malBubble.add(random.nextInt(100));
        }
        long timeStartBubble = System.currentTimeMillis();
        malBubble.bubbleSort();
//        System.out.println(malBubble);
        malBubble.bubbleSortOpt();
//        System.out.println(malBubble);
        long timeEndBubble = System.currentTimeMillis();
        long millisecondsBubble = timeEndBubble - timeStartBubble;
        System.out.println("Сортировка пузырьковая выполнена за "+millisecondsBubble+" миллисекунд");

    }




}
