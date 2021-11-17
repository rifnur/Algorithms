package Lesson3;

public class Main {
    public static void main(String[] args) {
//        MyStack<Integer> stack = new MyStack<>();
//        stack.push(42);
//        stack.push(23);
//        stack.push(15);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//
//        Expression expression = new Expression("(5+7]-[]+({t+4})");
//        System.out.println(expression.checkBracket());

//        MyQueue<Integer> queue = new MyQueue<>();
//        queue.insert(5);
//        queue.insert(15);
//        queue.insert(25);
//        queue.insert(35);
//        queue.insert(45);
//
//        System.out.println(queue);
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//
//        System.out.println(queue);

//        MyPriorityQueue<Integer> mpg = new MyPriorityQueue<>();
//        mpg.insert(16);
//        mpg.insert(6);
//        mpg.insert(36);
//        mpg.insert(65);
//        mpg.insert(15);
//        mpg.insert(2);
//        System.out.println(mpg);
//        System.out.println(mpg.peek());
//        System.out.println(mpg.remove());
//        System.out.println(mpg.remove());
//        System.out.println(mpg.remove());
//        System.out.println(mpg);

//        1. Создать программу, которая переворачивает вводимые строки (читает справа налево).
//        MyStack<String> stack = new MyStack<>();
//        stack.revers("Рифнур");


//        MyStack<Integer> stack = new MyStack<>();
//        stack.push(42);
//        stack.push(23);
//        stack.push(151);
//        stack.push(215);
//        stack.push(815);
//        stack.push(155);
//        stack.push(25);
//        stack.push(75);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);

        //2. Создать класс для реализации дека.

        MyDeque<Integer> deque = new MyDeque<>();
        for (int i = 0; i < 12; i++) {
            deque.insertRight(i);
        }

        System.out.println(deque.toString());
        System.out.println(deque.size());
        deque.insertLeft(26);
        deque.insertRight(45);
        deque.insertLeft(85);
        deque.insertRight(10);
        System.out.println(deque.toString());
        deque.removeLeft();
        deque.removeRight();
        System.out.println(deque.toString());
        System.out.println(deque.peekLeft());
        System.out.println(deque.peekRight());
        System.out.println(deque.size());


    }
}
