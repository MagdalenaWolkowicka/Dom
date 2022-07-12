package obiektowe.collections;

import java.util.*;

public class MyArrayList<E> implements List<E> {

    private E[] elements = (E[]) new Object[10];
    private int actualSize = 0;


    @Override
    public boolean add(E e) {  // tooo
        if (e == null) {
            return false;
        }
        elements[actualSize++] = e;
        if (actualSize == elements.length) {  // jesli koniec miejsca - powieksz zbiór
            grow();
        }
        return true;
    }

    private void grow() {   // dodaj 2x tyle miejsca
        //      E[] newArray = (E[]) new Object[elements.length * 2];
//        for (int i = 0; i < elements.length; i++) {  przerzucam do nowej wiekszej tablicy
//            newArray[i] = elements[i];
        // elements = newArray;
//        }
        elements = Arrays.copyOf(elements, elements.length * 2);
    }


//    @Override
//    public boolean add(E e) {  // tooo    // stara wersja!!!!!
//        if (e == null) {
//            return false;
//        }
//
//
//        for (int i = 0; i < elements.length; i++) { // przegladam
//            if (elements[i] == null) { // to z nullem oznacza wolne miejsce
//                elements[i] = e; // wstawiam
//                break;
//            }
//        }
//        actualSize++;
//        return true;
//    }

    @Override
    public void add(int index, E element) {
        for (int i = actualSize - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        actualSize++;

    }

    @Override
    public int size() {  // to
        return actualSize;
    }

//    @Override    // to jest stara wersja!!!!
//    public int size() {  // to
//        for (int i = 0; i < elements.length; i++) {
//            if (elements[i] == null) { // jestem przy ostatnim elemencie wiec i = size
//                return i;
//            }
//        }
//        return 0;
//    }

    @Override
    public boolean isEmpty() { // to
        return actualSize == 0;
    }

    @Override
    public boolean remove(Object o) {  // to
        return false;
    }

    @Override
    public boolean contains(Object o) {  // to
        for (E element : elements) {
            if (element == null) {
                break;
            }
            if (element.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public E get(int index) {  // too
        if (index < 0 || index >= actualSize) {
            throw new IndexOutOfBoundsException("Poza indexem!");
        }
        return elements[index];
    }

    @Override
    public E remove(int index) {

        for (int i = index; i < actualSize; i++) {
            if (i == actualSize) {
                throw new IndexOutOfBoundsException();
            }
            elements[i] = elements[i + 1];

        }
        for (int i = 0; i <= actualSize; i++) {
            if (i == actualSize) {
                elements[i] = null;
            }

        }
        actualSize = actualSize - 1;
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }


    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }


    @Override
    public E set(int index, E element) {
        return null;
    }


    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
