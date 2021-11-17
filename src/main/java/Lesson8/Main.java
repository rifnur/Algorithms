package Lesson8;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(5, 9999999);
//        System.out.println(map.get(5));
//        map.put(5, 77777);
//        System.out.println(map.get(5));


//        ChainingHashMap<Integer, String> map = new ChainingHashMap<>(7);
//        for (int i = 0; i < 7 ; i++) {
//            map.put(random.nextInt(100), "a");
//        }
//        System.out.println(map);


//        LinearProbingHashMap<Integer, String> lphm = new LinearProbingHashMap<>(97);
//        lphm.put(5, "qwe");
//        lphm.put(15, "qweerwer");
//        System.out.println(lphm.get(15));

        ChainingHashMap<Integer, String> map = new ChainingHashMap<>(7);
        map.put(1, "яблоко");
        map.put(2, "груша");
        map.put(3, "апельсин");
        map.put(4, "персик");
        map.put(5, "киви");
        System.out.println(map);
        map.delete(4);
        System.out.println(map);
    }
}