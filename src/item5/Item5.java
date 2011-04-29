package item5;

/**
 * User: mpetzsch
 * Date: 29/04/2011
 * Time: 22:53
 * <p/>
 * Avoid creating unnecessary objects
 */
public class Item5 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            // slow with object creation
            long before = System.nanoTime();
            objectCumulativeAdder(1000000);
            System.out.println("Objects:" + (System.nanoTime() - before) / 1000);
            // fast with primitives
            before = System.nanoTime();
            primitiveCumulativeAdder(1000000);
            System.out.println("Primiti:" + (System.nanoTime() - before) / 1000);
        }
        // loss in this case is both autoboxing speed and GC overhead of extra objects
    }

    private static long objectCumulativeAdder(int count) {
        Long result = 0l;

        for (int i = 0; i < count; i++) {
            result += i;
        }

        return result;
    }

    private static long primitiveCumulativeAdder(int count) {
        long result = 0l;

        for (int i = 0; i < count; i++) {
            result += i;
        }

        return result;
    }
}
