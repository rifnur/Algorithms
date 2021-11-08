package Lesson3;

import java.util.Arrays;

public class MyQueue <T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    // 0 1 2 3 4
    //b
    //      e
    //   4 5 7

    public MyQueue(int capacity){
        if(capacity <= 0){
            throw new IllegalArgumentException();
        }
        list = (T[]) new Object[capacity];
    }

    public MyQueue(){
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insert(T item){
        if (isFull()){
            throw new RuntimeException("Queue is full");
            //расширение массива
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public T peekFront(){
        if (isEmpty()){
            throw  new RuntimeException("Queue is empty");
        }
        return list[begin];
    }
    public T remove(){
        T temp = peekFront();
        list[begin] = null;
        begin = nextIndex(begin);
        size--;
        return  temp;
    }

    public int size() {
        return size;
    }
    public boolean  isEmpty(){
        return size ==0;
    }

    public boolean isFull(){
        return size == list.length;
    }

    private  int nextIndex(int index){
//        if (index +1 ==list.length){
//            return 0;
//        } else {
//            return index + 1;
//        }
        //не верно
        return (index + 1) % list.length;
    }

    @Override
    public String toString() {
        if (isEmpty()){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = begin, j=0;j<size; i= nextIndex(i),j++) {
            sb.append(list[i]).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
