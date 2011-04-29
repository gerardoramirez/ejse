package item6;

import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;

/**
 * Created by IntelliJ IDEA.
 * User: Martin
 * Date: 09/02/11
 * Time: 21:57
 * To change this template use File | Settings | File Templates.
 */
public class MPStack<E> {
    private static final int DEFAULT_INITIAL_CAPACITY = 32;
    private static final int GROW_FACTOR = 2;
    private E[] stack;
    private int size;

    public MPStack() {
        stack = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
        size = 0;
    }

    public void push(E element) {
        ensureCapacity();
        stack[size++] = element;
    }

    public void pushAll(Collection<E> elements) {
        for (E e : elements) {
            push(e);
        }
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        E e = stack[--size];
        stack[size] = null;

        if (size < (stack.length / 5) && (stack.length / 5) > DEFAULT_INITIAL_CAPACITY) {
            stack = Arrays.copyOfRange(stack, 0, (stack.length / 2));
        }

        return e;
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == stack.length) {
            stack = Arrays.copyOf(stack, size * GROW_FACTOR);
        }
    }
}
