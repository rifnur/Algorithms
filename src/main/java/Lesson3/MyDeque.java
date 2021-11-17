package Lesson3;

import java.util.EmptyStackException;

public class MyDeque<Item extends Comparable> {
    private Item[] list;
    private final int DEFAULT_CAPACITY = 10;
    private int head;
    private int tail;

    public MyDeque() {
        list = (Item[]) new Comparable[DEFAULT_CAPACITY];
        head = 0;
        tail = 0;
    }

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("invalid capacity " + capacity);
        }
        list = (Item[]) new Comparable[capacity];
        head = 0;
        tail = 0;
    }

    public void insertRight(Item item) {
        if (isFull()) {
            reCapacity(list.length + DEFAULT_CAPACITY);
        }
        if (!isEmpty()) {
            tail = shiftEndOutward();
        }
        list[tail] = item;
    }

    public void insertLeft(Item item) {
        if (isFull()) {
            reCapacity(list.length + DEFAULT_CAPACITY);
        }
        if (!isEmpty()) {
            head = shiftBeginOutward();
        }
        list[head] = item;
    }

    public Item removeLeft() {
        Item value = peekLeft();
        list[head] = null;
        head = shiftBeginInward();
        isEmpty();
        return value;
    }

    public Item removeRight() {
        Item value = peekRight();
        list[tail] = null;
        tail = shiftEndInward();
        isEmpty();
        return value;
    }

    public Item peekLeft() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[head];
    }

    public Item peekRight() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[tail];
    }

    private int nextRightIndex(int index) {
        return (index + 1) % list.length;
    }


    private int nextLeftIndex(int index) {
        return index != 0 ? index - 1 : list.length - 1;
    }

    private int shiftBeginOutward() {
        return nextLeftIndex(head);
    }


    private int shiftEndOutward() {
        return nextRightIndex(tail);
    }


    private int shiftBeginInward() {
        return nextRightIndex(head);
    }


    private int shiftEndInward() {
        return nextLeftIndex(tail);
    }

    public int queueLength() {
        if (tail != head && list[head] != null && list[tail] != null) {
            return isOrder() ? tail - head + 1 : list.length - head + tail + 1;
        } else {
            if (list[head] != null && list[tail] != null) {
                return 1;
            } else {
                return 0;
            }
        }
    }


    public boolean isEmpty() {
        if (queueLength() == 0 && list.length > DEFAULT_CAPACITY) {
            resetCapacity();
            return true;
        }
        return queueLength() == 0;
    }


    public void resetCapacity() {
        Item[] tempArr = (Item[]) new Comparable[DEFAULT_CAPACITY];
        list = tempArr;
        head = 0;
        tail = 0;
    }

    public boolean isFull() {
        return queueLength() == list.length;
    }

    private boolean isOrder() {
        return tail >= head;
    }

    public void reCapacity(int newCapacity) {
        Item[] tempArr = (Item[]) new Comparable[newCapacity];
        int delta = newCapacity - list.length;
        if (isOrder()) {
            System.arraycopy(list, head, tempArr, head + delta / 2, queueLength());
            head += delta / 2;
            tail += delta / 2;
        } else {
            System.arraycopy(list, 0, tempArr, 0, tail + 1);
            System.arraycopy(list, head, tempArr, head + delta, list.length - head);
            head += delta;
        }
        list = tempArr;
    }


    public int size() {
        return list.length;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            sb.append(list[i] + " ");
        }
        return sb.toString();
    }

}