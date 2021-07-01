package lesson2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> array = new MyArrayList<>(100000);
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            array.add(random.nextInt(100));
        }
        MyArrayList<Integer> array2 = array.copy();
        MyArrayList<Integer> array3 = array.copy();
        long m1 = System.currentTimeMillis();
        array.selectionSort();
        long m2 = System.currentTimeMillis();
        array2.insertionSort();
        long m3 = System.currentTimeMillis();
        array3.bubbleSort();
        long m4 = System.currentTimeMillis();
        System.out.println("selectionSort: " + (m2-m1));
        System.out.println("insertionSort: " + (m3-m2));
        System.out.println("bubbleSort: " + (m4-m3));


    }
}
