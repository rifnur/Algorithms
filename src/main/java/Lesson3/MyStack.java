package Lesson3;

import java.util.EmptyStackException;

public class MyStack<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;

    public MyStack(int capacity){
        if(capacity <= 0){
            throw new IllegalArgumentException();
        }
        list = (T[]) new Object[capacity];
    }

    public MyStack(){
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }
//3*. Реализовать автоматическое увеличение размера массива в стеке
    public void push(T item){
        if(isFull()){
//            throw new StackOverflowError();
            //расширение массива
            T[] newArr = (T[]) new Object[list.length*2];
            System.arraycopy(list,0,newArr,0,size);
            list = newArr;
        }
        list[size] = item;
        size++;
        //reCapacity
    }

    public T pop(){
        T temp = peek();
        size--;
        list[size] = null;
        return temp;
    }

    public T peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return  list[size - 1];
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
    private void reCapacity(int newCapacity){
         T[] tempArr = (T[]) new Object[newCapacity];
         System.arraycopy(list,0,tempArr,0,size);
         list = tempArr;
    }

    public void revers(String myText){
        MyStack<Character> stack = new MyStack<>();
        char[] chars = myText.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i]);
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(stack.pop());

        }
    }

}
