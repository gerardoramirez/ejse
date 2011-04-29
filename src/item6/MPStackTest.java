package item6;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Martin
 * Date: 09/02/11
 * Time: 22:06
 * To change this template use File | Settings | File Templates.
 */
public class MPStackTest {

    private static String[] randomStrings;
    private static List<String> randomStringCollection;

    @BeforeClass
    public static void beforeClass() {
        randomStrings = new String[100000];
        for (int i = 0; i < 10000; i++) {
            Random r = new Random();
            String token = Long.toString(Math.abs(r.nextLong()), 36);
            randomStrings[i] = token;
        }
        randomStringCollection = new ArrayList<String>();
        randomStringCollection.addAll(Arrays.asList(randomStrings));
    }

    public static String randomString() {
        return Long.toString(Math.abs(new Random().nextLong()), 36);
    }

    @Test
    public void repeatTestMPStack() throws Exception {
        long before = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            testMPStack();
        }
        System.out.println("MPStack Duration:" + ((System.nanoTime() - before) / 1e6));
    }

    @Test
    public void repeatJMPStack() throws Exception {
        long before = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            testJavaStack();
        }
        System.out.println("JVStack Duration:" + ((System.nanoTime() - before) / 1e6));
    }

    public void testMPStack() throws Exception {
        MPStack<String> stringStack = new MPStack<String>();

        // add 10000 strings
        for (int i = 0; i < randomStrings.length; i++) {
            stringStack.push(randomStrings[i]);
        }
        Assert.assertEquals(randomStrings.length, stringStack.size());

        // test equal and ordered
        for (int i = randomStrings.length - 1; i >= 0; i--) {
            Assert.assertEquals(randomStrings[i], stringStack.pop());
        }
    }

    public void testJavaStack() throws Exception {
        Stack<String> stringStack = new Stack<String>();

        // add 10000 strings
        for (int i = 0; i < randomStrings.length; i++) {
            stringStack.push(randomStrings[i]);
        }
        Assert.assertEquals(randomStrings.length, stringStack.size());

        // test equal and ordered
        for (int i = randomStrings.length - 1; i >= 0; i--) {
            Assert.assertEquals(randomStrings[i], stringStack.pop());
        }
    }
}
