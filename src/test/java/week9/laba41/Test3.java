package week9.laba41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class Test3{
    public static void main(String[] args) {
        Integer[] expectedElements = {1, 2, 3, 4, 5, 6, 7};

        SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();

        for (int i = 0; i < expectedElements.length; i++) {
            simpleLinkedList.add(expectedElements[i]);
        }

        //call and check
        Iterator<Integer> iterator = null;
        try {
            iterator = simpleLinkedList.iterator();
        } catch (UnsupportedOperationException u) {
            throw new AssertionError("Iterator not implemented");
        }

        if (iterator == null)
            throw new AssertionError("Iterator must be no equals null");

        boolean isException = false;
        try {
            iterator.remove();
        } catch (IllegalStateException e) {
            isException = true;
        }

        if (!isException)
            throw new AssertionError("Expected throw IllegalStateException form iterator.remove()");

        System.out.print("OK");

    }
}
