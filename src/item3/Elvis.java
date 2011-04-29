package item3;

/**
 * Created by IntelliJ IDEA.
 * User: Martin
 * Date: 21-Jul-2010
 * Time: 22:20:49
 * To change this template use File | Settings | File Templates.
 */
public enum Elvis {
    INSTANCE;

    private final long startTime;

    Elvis() {
        startTime = System.currentTimeMillis();
        System.out.println("Elvis has been constructed");
    }

    public void leaveTheBuilding() {
        System.out.println(this + " has left the building");
    }

    @Override
    public String toString() {
        return super.toString() + " Elvis{" +
                "startTime=" + startTime +
                '}';
    }
}
