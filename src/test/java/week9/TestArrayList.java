package week9;

import org.junit.Test;
import week9.list.ArrayList;
import week9.list.MyList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TestArrayList {

    @Test
    public void testRemoveByIndex(){
        //given
        ArrayList list = new ArrayList();
        //when
        list.add("1");
        list.add("2");
        list.add("3"); //2
        list.add("4");
        list.add("5");

        list.remove(2);
        //then
        assertEquals("[1, 2, 4, 5]", list.toString());
    }

    @Test
    public void testRemoveByIndex_WhenIllegalArgument(){
        //given
        ArrayList list = new ArrayList();
        //when
        list.add("1");
        list.add("2");
        list.add("3"); //2
        list.add("4");
        list.add("5");
        try{
            list.remove(10);
            list.remove(-1);
        }catch(IllegalArgumentException e){
                assertEquals("Unexpected index mast be midel0 - 5", e.getMessage());
        }
        //then
        assertEquals("[1, 2, 3, 4, 5]", list.toString());
    }

    @Test
    public void testRemoveByObject(){
        //given
        ArrayList list = new ArrayList();
        //when
        list.add("1");
        list.add("2");
        list.add("3"); //2
        list.add("4");
        list.add("5");

        list.remove("3");
        //then
        assertEquals("[1, 2, 4, 5]", list.toString());
    }

    @Test
    public void testSizeAndClear(){
        //given
        ArrayList list = new ArrayList();
        //when
        list.add("1");
        list.add("2");
        list.add("3"); //2
        list.add("4");
        list.add("5");

        //then
        int arrSize = list.size();
        assertEquals(5, arrSize);

        list.clear();
        assertEquals("[]", list.toString());
    }

    @Test
    public void testIndexOf(){
        //given
        ArrayList list = new ArrayList();
        //when
        list.add("1");
        list.add("4");
        list.add("3"); //2
        list.add("4");
        list.add("5");

        //then
        assertEquals(1, list.indexOf("4"));

        assertEquals(3, list.lastIndexOf("4"));

        assertEquals(-1, list.lastIndexOf("6"));
    }

    @Test
    public void testAddByIndexAndContains(){
        //given
        ArrayList list = new ArrayList();
        //when
        list.add("1");
        list.add("4");
        list.add("3"); //2
        list.add("4");
        list.add("5");

        list.add(1, "2");
        //then
        assertEquals("[1, 2, 4, 3, 4, 5]", list.toString());
        assertFalse(list.contains("7"));
        assertTrue(list.contains("2"));
    }

    @Test
    public void testGetIsEmpty(){
        //given
        ArrayList list = new ArrayList();
        //when
        list.add("1");
        list.add("4");
        list.add("3"); //2
        list.add("4");
        list.add("5");

        //then
        assertEquals("4", list.get(1));
        assertFalse(list.isEmpty());
        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testSet(){
        //given
        ArrayList list = new ArrayList();
        //when
        list.add("1");
        list.add("4");
        list.add("3"); //2
        list.add("4");
        list.add("5");

        //then
        assertEquals("4", list.set(1, "2"));
    }

    @Test
    public void testSubList(){
        //given
        MyList list = new ArrayList();
        //when
        list.add("1");
        list.add("4");
        list.add("3"); //2
        list.add("4");
        list.add("5");

        try{
            MyList newArr1 = list.subList(-1, 13);
            MyList newArr2 = list.subList(3, 2);
        }catch(IllegalArgumentException e){
            assertEquals("not expected paramentr", e.getMessage());
        }

        MyList newArr3 = list.subList(1, 2);
        //then
        assertEquals("[4, 3]", newArr3.toString());
    }
}
