package lesson5;

public class Main {
    public static void main(String[] args) {
        System.out.println("2^5 = " + pow(2L,5));

        Thing[] things = {new Thing(2, 1), new Thing(4, 3), new Thing(1, 2)};
        Bag bag = new Bag(things);
        System.out.println(bag.find(2, 4));
    }

    public static Long pow(Long a, int p) {
        if (p == 0) {
            return 1L;
        }
        return a * pow(a, p-1);
    }
}
