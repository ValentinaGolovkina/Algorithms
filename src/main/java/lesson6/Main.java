package lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> map = new MyTreeMap<>();
        map.put(5, "five");
        map.put(3, "three");
        map.put(9, "nine");
        map.put(4, "four");
        map.put(7, "seven");
        map.put(6, "six");
        map.put(10, "10");
        map.put(11, "11");
        map.put(12, "12");
        System.out.println(map);

//        map.delete(4);
//        System.out.println(map);

//        map.deleteMin();
//        System.out.println(map.minKey());
//        System.out.println(map.get(4));
        System.out.println(map.contains(9));

        System.out.println("Высота: " + map.height());
        System.out.println("Дерево сбалансировано: " + map.isBalanced());

        Random random = new Random();

        int sum =0;
        for(int i=0;i<1000000;i++){
            MyTreeMap<Integer, String> mapTree = new MyTreeMap<>();
            while (mapTree.height()<6){
                mapTree.put(random.nextInt(200) -100, "qwe");
            }
            //System.out.println(i+ " высота: " + mapTree.height());
            //System.out.println(i+ " дерево сбалансировано: " + mapTree.isBalanced());
            if (mapTree.isBalanced()) {
                sum++;
            }
        }
        Double d = sum/1000000D*100;
        System.out.println("Количество сбалансированных " + sum);
        System.out.println("Процент сбалансированных: " + d + " %");
    }
}
