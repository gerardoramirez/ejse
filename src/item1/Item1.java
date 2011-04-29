package item1;

/**
 * User: mpetzsch
 * Consider static factory methods over constructors
 */
public class Item1 {
    public static boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
