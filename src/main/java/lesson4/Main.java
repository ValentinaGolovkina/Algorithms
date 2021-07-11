package lesson4;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> mll = new MyLinkedList<>();
        mll.insertFirst(5);
        mll.insertFirst(6);
        mll.insertFirst(2);
        mll.insertFirst(8);
        Iterator<Integer> iterator = mll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
