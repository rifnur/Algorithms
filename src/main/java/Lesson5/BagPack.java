package Lesson5;

public class BagPack {

    private final Item[] items;

    public BagPack(Item[] items) {
        this.items = items;
    }

    int recursiveBestSum(int i, int weight) {
        if (i < 0) {
            return 0;
        }
        if (items[i].getWeight() > weight) {
            return recursiveBestSum(i - 1, weight);
        } else {
            return Math.max(
                    recursiveBestSum(i - 1, weight),
                    recursiveBestSum(i - 1, weight - items[i].getWeight()) + items[i].getPrice());
        }
    }
}