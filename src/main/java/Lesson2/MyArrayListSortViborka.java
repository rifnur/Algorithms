package Lesson2;

import java.util.Arrays;
/*Сортировка выбором О(n2)*/

public class MyArrayListSortViborka<T extends Comparable> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;

    public MyArrayListSortViborka(int capacity){
        if (capacity <= 0){
            throw new IllegalArgumentException("capacity < 0 :" + capacity);
        }
        list = (T[]) new Comparable[capacity];
    }

    public MyArrayListSortViborka() {
        list = (T[]) new Comparable[DEFAULT_CAPACITY];
    }

    public void add(T item){

        //проверить на переполнение, при заполнении пересоздать внутренний массив
        // размер capacity *1.5+1


        list[size] = item;
        size++;

    }


    public void add(int index,  T item){

        //проверить на переполнение, при заполнении пересоздать внутренний массив
        // размер capacity *1.5+1
        //проверить index
        for (int i= size; i > index; i--){
            list[i] = list[i-1];
        }

        list[index] = item;
        size++;

    }

    public final T delete (int index) {
        //проверь индекс
        T temp = list[index];
        for (int i = index; i < size; i++){
            list[i] = list[i+1];
        }
        size--;
        return temp;
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
        return list[index];
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

    private boolean less(T item1, T item2){
        return item1.compareTo(item2)<0;
    }

    private void swap(int index1, int index2){
        T temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

    public void selectionSort(){
        for (int i = 0; i < size-1; i++) {
            int iMin = i;
            for (int j = i; j < size; j++) {
                if (less(list[j],list[iMin])){
                    iMin = j;
                }
            }
            swap(i,iMin);
        }
    }
    /*Сортировка вставками*/
    public void insertionSort(){
        T key;
        for (int i = 1; i < size ; i++) {
            int j = i;
            key = list[i];
            while (j > 0 && less(key, list[j - 1])){
                list[j] = list[j - 1];
                j--;
            }
            list[j] = key;
        }
    }
    /*Пузырьковая сортировка*/
    public  void bubbleSort(){
        for (int i = size-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (less(list[j+1],list[j])){
                    swap(j+1,j);
                }

            }

        }
    }
    /*Пузырьковая сортировка*/
    public  void bubbleSortOpt(){
        boolean isSwap;
        for (int i = size-1; i > 0 ; i--) {
            isSwap = false;
            for (int j = 0; j < i; j++) {
                if (less(list[j+1],list[j])){
                    swap(j+1,j);
                    isSwap = true;
                }
            }
            if (!isSwap){
                break;
            }

        }
    }
}
