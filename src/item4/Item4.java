package item4;

/**
 * User: mpetzsch
 * Date: 29/04/2011
 * Time: 22:37
 * <p/>
 * Enforce noninstantiability with private constructors
 */
public class Item4 {

    private Item4() {
        throw new AssertionError("You cannot instantiate me");
    }

    public static void main(String[] args) {
        Item4 item4 = new Item4();
        // assertion error
    }
}
