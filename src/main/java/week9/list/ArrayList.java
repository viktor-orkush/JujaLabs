package week9.list;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Viktor on 27.08.2017.
 */
public class ArrayList implements MyList{

    private Object[] array;

    public ArrayList (){
        clear();
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public boolean add(Object e) {
        Object[] newArray = new Object[size()+1];
        int index = 0;
        for (; index < size(); index++) {
            newArray[index] = array[index];
        }
        newArray[size()] = e;
        array = newArray;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int indexRemove = indexOf(o);
        if(indexRemove == -1){
            return false;
        }
        remove(indexRemove);
        return true;
    }

    @Override
    public boolean containsAll(MyList c) {
        return false;
    }

    @Override
    public boolean addAll(MyList c) {
        return false;
    }

    @Override
    public boolean removeAll(MyList c) {
        return false;
    }

    @Override
    public boolean retainAll(MyList c) {
        return false;
    }

    @Override
    public void clear() {
        array = new Object[0];
    }

    @Override
    public boolean addAll(int index, MyList c) {
        return false;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public Object set(int index, Object element) {
        Object oldObject = array[index];
        array[index] = element;
        return oldObject;
    }

    @Override
    public void add(int indexInsert, Object element) {
        Object[] newArray = new Object[size()+1];
        int index = 0;
        for (; index < indexInsert; index++) {
            newArray[index] = array[index];
        }
        newArray[index] = element;
        for (; index < size(); index++) {
            newArray[index+1] = array[index];
        }
        array = newArray;
    }

    @Override
    public Object remove(int indexRemove) {
        if(indexRemove < 0 || indexRemove >= size()){
            throw new IllegalArgumentException("Unexpected index mast be midel" + 0 +" - " + size());
        }
        Object[] newArray = new Object[size()-1];
        Object removeObject = array[indexRemove];
        int index = 0;
        for (; index < indexRemove; index++) {
            newArray[index] = array[index];
        }
        for (; index < size() - 1; index++) {
            newArray[index] = array[index + 1];
        }
        array = newArray;
        return removeObject;
    }

    @Override
    public int indexOf(Object o) {
        for (int index = 0; index < size(); index++) {
            Object object = array[index];
            if((object == null && o == null) || object.equals(o)){
                return index;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int index = size()-1; index >=0; index--) {
            if(array[index].equals(o)){
                return index;
            }
        }
        return -1;
    }

    @Override
    public MyList subList(int fromIndex, int toIndex) {
        MyList newArray = new ArrayList();
        if(fromIndex > toIndex || fromIndex < 0 || fromIndex >= size() || toIndex <0 || toIndex >=size()){
            throw new IllegalArgumentException("not expected paramentr");
        }
        if(fromIndex == toIndex){
            return newArray;
        }
        for (; fromIndex <= toIndex; fromIndex++) {
            newArray.add(array[fromIndex]);
        }
        return newArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}