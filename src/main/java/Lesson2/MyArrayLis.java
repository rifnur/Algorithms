package Lesson2;

import java.util.Arrays;

public class MyArrayLis<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int pointer = 0;

    public MyArrayLis(int capacity){
        if (capacity <= 0){
            throw new IllegalArgumentException("capacity < 0 :" + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyArrayLis() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void add(T item){

        //проверить на переполнение, при заполнении пересоздать внутренний массив
        // размер capacity *1.5+1
        if (size==list.length){
            createArray();
        }
        list[size] = item;
        size++;
    }
    public void add(int index,  T item){

        //проверить на переполнение, при заполнении пересоздать внутренний массив
        // размер capacity *1.5+1
        //проверить index
        if (size==list.length){
            createArray();
        }
        if (index> list.length){
            add(item);}else {
            for (int i = size; i > index; i--) {
                list[i] = list[i - 1];
            }

            list[index] = item;
            size++;
        }
    }

    public final T delete (int index) {
        //проверь индекс
        if ((index< size) && (index >=0)) {
            T temp = list[index];
            for (int i = index; i < size; i++) {
                list[i] = list[i + 1];
            }
            size--;
            return temp;
        } else throw new ArrayIndexOutOfBoundsException();
    }

    public boolean delete(T item){
        int pos = index(item);
        if (pos < 0){
        return false;}
        delete(pos);
        return true;
    }

    public T get (int index){
        //проверить индекс
        if ((index< size) && (index >=0)) {
            return (T) list[index];
        }
        return null;
    }

    public void set (int index, T item){
        list[index] = item;
    }



    public int indexOf(T item){
        return index(item);
    }

    private  int index(T item){
        if (item ==null){
            return -1;
        }
        for (int i = 0; i<size; i++){
            if (list[i].equals(item) ){
                return i;
            }
        }
        return -1;
    }


    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return size ==0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(list,size));
    }

    private void createArray(){
        int pointer =size;
        pointer = (int) (pointer*1.5+1);
        T[] listNew = (T[]) new Object[pointer];
        System.arraycopy(list,0,listNew,0,size);
        list = listNew;
    }
}
