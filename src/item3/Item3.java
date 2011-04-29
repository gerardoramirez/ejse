package item3;

/**
 * User: mpetzsch
 * Enums for singletons
 */
public class Item3 {
    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        System.out.println("I have got " + elvis);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elvis elvis1 = Elvis.INSTANCE;
        System.out.println("I have got another " + elvis);
    }
}
