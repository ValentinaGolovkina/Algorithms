package lesson5;

public class Bag {

    private Thing[] things;

    public Bag(Thing[] things) {
        this.things = things;
    }

    int find(int i, int weight) {
        if (i < 0) {
            return 0;
        }
        if (things[i].weight > weight) {
            return find(i-1, weight);
        } else {
            return Math.max(find(i-1, weight), find(i-1, weight - things[i].weight) + things[i].price);
        }
    }

}
