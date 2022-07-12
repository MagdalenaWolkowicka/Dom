package obiektowe.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List<E> {

    private MyNode<E> firstNode = null;
    private int actualSize = 0;

    @Override
    public boolean add(E e) {
        MyNode<E> newNode = new MyNode<>(e); // tworzę "wagonik", ktory bedzie przechowywal nowy element
        actualSize++;

        if (firstNode == null) {
            firstNode = newNode;
            return true;  // skończylismy prace - koniec metody
        }
        // aktualny node = first node

        MyNode<E> actualNode = firstNode;

        while (actualNode.nextNode != null) {  // czy masz nastepneo? jak tak to ustawmy go na aktualny
            actualNode = actualNode.nextNode;
        }
        // tu actualNode to ostatni node
        actualNode.nextNode = newNode;
        return true;
    }

    @Override
    public void add(int index, E element) {
        actualSize++;
        MyNode<E> newNode = new MyNode<>(element);  // nowy node

        MyNode<E> actual = firstNode;  // reprezentuje node po nowym nodzie
        MyNode<E> beforeActual = null;  // reprezentuje node przed nowym nodem
        for (int i = 1; i <= index; i++) {  // znajsuje odpowiednie nody
            beforeActual = actual;
            actual = actual.nextNode;
        }

        newNode.nextNode = actual;  // nowy node wskazuje tego co był na jego miejscu jako jego kolejny

        if (beforeActual == null) {
            firstNode = newNode;  // dalej nie ma poprzedniego a więc - zmienił się pierwszy node
        } else {
            beforeActual.nextNode = newNode;  // jeśli był poprzedni to ma wskazywać na ten nowy
        }
    }

    @Override
    public int size() {
        return actualSize;
    }

    @Override
    public boolean isEmpty() {
        return actualSize == 0;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
//        switch ((index)) {
//            case 0:
//                return firstNode.data;
//            case 1:
//                return firstNode.nextNode.data;
//        }

        if (index < 0 || index >= actualSize) {
            throw new IndexOutOfBoundsException();
        }

        MyNode<E> actualNode = firstNode;  // aktualny node

        for (int i = 1; i <= index; i++) {  // przestawiamy na ten o podanym indexie
            actualNode = actualNode.nextNode;
        }
        return actualNode.data;
    }

    class MyNode<E> {   // klasa wewnętrzna

        private E data;
        private MyNode<E> nextNode = null;


        public MyNode(E e) {
            this.data = e;
        }
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
    public boolean remove(Object o) {
        return false;
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
