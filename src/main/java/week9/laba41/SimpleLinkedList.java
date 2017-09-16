package week9.laba41;

import java.util.Iterator;
        import java.util.NoSuchElementException;

public class SimpleLinkedList <E> implements SimpleList<E> {
    private Node<E> first = null; // head
    private Node<E> last = null; // tail
    private int size = 0;

    private static class Node<T> {
        private Node <T> prev;
        private T item;
        private Node <T> next;

        private Node(Node<T> prev, T item, Node<T> next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<E> {
        private Node<E> lastReturned = null;
        private Node<E> next = first;
        private int nextIndex = 0;

        @Override
        public boolean hasNext() {
            return nextIndex < size();
        }

        @Override
        public E next() throws NoSuchElementException {
            if(!hasNext()) throw new NoSuchElementException();

            lastReturned = next;
            next = next.next;
            nextIndex++;

            return  lastReturned.item;
        }

        @Override
        public void remove() throws IllegalStateException{
            if(lastReturned == null) throw new IllegalStateException();

            Node<E> lastNext = lastReturned.next;
            unlink(lastReturned);

            if (next == lastReturned)
                next = lastNext;
            else
                nextIndex--;

            lastReturned = null;
        }
    }



    private void checkIndex(int index) {
        if (index < 0 || size < index) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    private Node<E> node(int index) {
        if (index < size / 2) {
            Node<E> tmp = first;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            return x;
        }
    }

    private E unlink(Node<E> x) { //todo:
        // assert x != null;
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        return element;
    }
    @Override
    public boolean add(E newElement) {
        final Node<E> tmp = last;
        final Node<E> newNode = new Node<>(tmp, newElement, null);
        last = newNode;
        if (tmp == null) {
            first = newNode;
        } else {
            tmp.next = newNode;
        }
        size++;
        return true;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return node(index).item;
    }


    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        return unlink(node(index));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleLinkedList<?> that = (SimpleLinkedList<?>) o;
        if (size != that.size) return false;

       // while(iterator().hasNext()){
//            if(!iterator().next().equals(that.iterator().next())) return false;
       // }
        return true;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.item.hashCode() : 0;
        result = 31 * result + (last != null ? last.item.hashCode() : 0);
        result = 31 * result + size;
        return result;
    }

    @Override
    public String toString() {
        String result = "[";
        Node<E> actual = first;
        for (int index = 0; index < size(); index++) {
            result +=  actual.item + ", ";
            actual = actual.next;
        }
        if(size() != 0) result = result.substring(0, result.length()-2);
        result += "]";
        return result;
    }
}

interface SimpleList<T> {
    public boolean add(T newElement);
    public T get(int index);
    public Iterator<T> iterator();
    public int size();
    public boolean isEmpty();
    public T remove(int index);
}