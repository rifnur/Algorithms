package Lesson4;

import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
//        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
//        myLinkedList.insertFirst( 4);
//        myLinkedList.insertFirst( 5);
//        myLinkedList.insertFirst( 6);
//        myLinkedList.insertFirst( 7);
//        myLinkedList.insertFirst( 8);

//        System.out.println(myLinkedList.getFirst());
//        System.out.println(myLinkedList.deleteFirst());
//        System.out.println(myLinkedList.deleteFirst());
//        System.out.println(myLinkedList.deleteFirst());
//        System.out.println(myLinkedList.deleteFirst());
//        System.out.println(myLinkedList.deleteFirst());
//        System.out.println(myLinkedList.deleteFirst());

//        System.out.println(myLinkedList.indexOf(4));
//        myLinkedList.insert(1,45);
//        System.out.println(myLinkedList);
//        myLinkedList.delete(7);
//        System.out.println(myLinkedList);

        MyLinkedList<Integer> mdll = new MyLinkedList<>();
        mdll.insertFirst( 4);
        mdll.insertFirst( 5);
        mdll.insertFirst( 6);
        mdll.insertLast( 7);
        mdll.insertLast( 8);
//        mdll.insert(2,45);
        System.out.println(mdll);
//        mdll.deleteFirst();
//        System.out.println(mdll);
//        mdll.deleteLast();
//        mdll.delete(8);
//        System.out.println(mdll);
//
//        for(Integer i: mdll){
//            System.out.print (i+" ");
//        }
        ListIterator<Integer> listIterator = mdll.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next());
        }
        System.out.println("");
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous());
        }




    }
}
