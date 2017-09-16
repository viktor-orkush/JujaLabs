package week9.laba41;

public class Test4 {
    public static void main(String[] args) {

        //first array list
        SimpleLinkedList<Integer> firstSimpleLinkedList = new SimpleLinkedList<>();

        //second array list
        SimpleLinkedList<Integer> secondSimpleLinkedList = new SimpleLinkedList<>();


        //check
        if (!firstSimpleLinkedList.equals(secondSimpleLinkedList))
            throw new AssertionError("Two empty simpleLinkedList with identical type should be equals");


        System.out.print("OK");
    }
}

class Test5 {
    public static void main(String[] args) {
        //first array list
        SimpleLinkedList<Integer> firstSimpleLinkedList = new SimpleLinkedList<>();

        //second array list
        SimpleLinkedList<Integer> secondSimpleLinkedList = new SimpleLinkedList<>();


        //check
        if (!(firstSimpleLinkedList.hashCode()==secondSimpleLinkedList.hashCode()))
            throw new AssertionError("Two empty simpleLinkedList with identical type should be equals");


        System.out.print("OK");
    }
}

class Test6 {
    public static void main(String[] args) {
        Integer[] testElement  = {1,2,3,4,5,6,7,8};
        //first array list
        SimpleLinkedList<Integer> firstSimpleLinkedList = new SimpleLinkedList<>();
        for (int i = 0; i <testElement.length ; i++) {
            firstSimpleLinkedList.add(testElement[i]);
        }

        //second array list
        SimpleLinkedList<Integer> secondSimpleLinkedList = new SimpleLinkedList<>();

        for (int i = 0; i <testElement.length ; i++) {
            secondSimpleLinkedList.add(testElement[i]);
        }

        int a = firstSimpleLinkedList.hashCode();
        int b = secondSimpleLinkedList.hashCode();

        //check
        if (!(firstSimpleLinkedList.hashCode()==secondSimpleLinkedList.hashCode()))
            throw new AssertionError("Two identical simpleLinkedList hasCode should be equals");


        System.out.print("OK");
    }
}

class Test7 {
    public static void main(String[] args) {
        Integer[] expectedElements = {1, 2, 3, 4, 5, 6, 7};
        String expectedPrintString = "[1, 2, 3, 4, 5, 6, 7]";

        SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();

        for (int i = 0; i < expectedElements.length; i++) {
            simpleLinkedList.add(expectedElements[i]);
        }

        //call

        String actualPrintString = simpleLinkedList.toString();

        //check
        if (!expectedPrintString.equals(actualPrintString))
            throw new AssertionError("Should be printed " + expectedPrintString + " but printed " + actualPrintString);

        System.out.print("OK");
    }

}
