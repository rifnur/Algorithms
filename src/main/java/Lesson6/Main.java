package Lesson6;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        int counts = 1000000;

        int balanced = 0;
        for (int i = 0; i < counts; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            writeMap(map);
            if (map.isBalanced()) {
                balanced++;
            }
        }
        System.out.println("Всего " + counts +" деревьев");
        System.out.println("Cбалансированы " + balanced +" деревьев");
        System.out.println("Несбалансированы " + (counts - balanced)+" деревьев" );
        System.out.println("Несбалансированы " + ((((float) (counts - balanced)) * 100) / (float) counts) + " %");
    }

    public static void writeMap(MyTreeMap<Integer, Integer> MyTreeMap) {
        while (MyTreeMap.height() < 6) {
            MyTreeMap.put(ThreadLocalRandom.current().nextInt(-100, 100), 0);
        }
    }

//        MyTreeMap<Integer, String > map = new MyTreeMap<>();
//
//        map.put(4,"four");
//        map.put(2,"two");
//        map.put(1,"one");
//        map.put(5,"five");
//        map.put(3,"three");
////        System.out.println(map.size());
//        System.out.println(map.get(2));
////        map.put(2, "two two");
////        System.out.println(map.get(2));
//
//        System.out.println(map);
//        map.delete(1);
//        System.out.println(map);

//    }
}
