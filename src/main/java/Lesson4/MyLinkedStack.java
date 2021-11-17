package Lesson4;
/*1. Реализовать MyLinkedStack используя класс MyLinkedList*/
public class MyLinkedStack<T> {
    private MyLinkedList<T> stack = new MyLinkedList<>();

    public T pop(){
        return stack.deleteFirst();
    }

    public T peek(){
        return stack.getFirst();
    }

    public void push(T item){
        stack.insertFirst(item);
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
