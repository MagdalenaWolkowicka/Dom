package obiektowe.collections;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public abstract class ListTest {

    private List<Integer> elements;

    public ListTest(List<Integer> elements) {
        this.elements = elements;
    }
    @Test
    public void addShouldHandleFewElements() {

        //when
        elements.add(23);
        elements.add(11);
        //elements.add(13);

        //then
        assertEquals(2, elements.size());
        assertEquals(11, elements.get(1));
    }

    @Test void AddShouldHandleOneElement() {
        elements.add(10);

        assertEquals(1, elements.size());
        assertEquals(10, elements.get(0));

    }

    @Test
    public void addShouldHandleManyElements() {
        elements.add(23);
        elements.add(11);
        elements.add(13);
        elements.add(23);
        elements.add(11);
        elements.add(13);
        elements.add(23);
        elements.add(11);
        elements.add(13);
        elements.add(23);
        elements.add(11);
        elements.add(13); // 12

        //then
        assertEquals(12, elements.size());
        assertEquals(13, elements.get(11));
    }

    @Test
    public void itsImpossibleToAddNullValue() {
        //when
        elements.add(null);

        //then
        assertEquals(0, elements.size());
    }

    @Test
    public void shouldThrowExceptionWhenOutOfBound() {

        try {
            elements.get(100);
        } catch (Exception e) {
            assertEquals(IndexOutOfBoundsException.class, e.getClass());
            return;
        }
        fail();

    }

    @Test
    public void shouldMakeRoomForNewNumber() {
        elements.add(6);
        elements.add(3);
        elements.add(4);
        elements.add(8);

        elements.add(1, 9);

        assertEquals(5, elements.size());
        assertEquals(6, elements.get(0));
        assertEquals(9, elements.get(1));
    }

    @Test
    public void shouldFindMatchingElement() {
        elements.add(6);
        elements.add(3);
        elements.add(4);
        elements.add(8);

        boolean shouldFind = elements.contains(3);
        boolean shouldNotFind = elements.contains(10);

        assertTrue(shouldFind);
        assertFalse(shouldNotFind);
    }

    @Test
    public void shouldRemoveFirstElement() {
        List<Integer> list = new MyArrayList();
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(8);

        list.remove(0);

        boolean shouldNotFind = list.contains(6);

        assertEquals(3, list.get(0));
        assertEquals(4, list.get(1));
        assertEquals(8, list.get(2));
        assertFalse(shouldNotFind);
        assertEquals(3, list.size());
    }

    @Test
    public void shouldRemoveMiddleElement() {
        List<Integer> list = new MyArrayList();
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(8);

        list.remove(1);

        boolean shouldNotFind = list.contains(3);

        assertEquals(6, list.get(0));
        assertEquals(4, list.get(1));
        assertEquals(8, list.get(2));
        assertFalse(shouldNotFind);
        assertEquals(3, list.size());
    }

    @Test
    public void shouldRemoveLastElement() {
        List<Integer> list = new MyArrayList();
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(8);

        list.remove(3);

        boolean shouldNotFind = list.contains(8);

        assertEquals(6, list.get(0));
        assertEquals(3, list.get(1));
        assertEquals(4, list.get(2));
        assertFalse(shouldNotFind);
        assertEquals(3, list.size());
    }

    @Test
    public void shouldThrowExceptionWhenOutOfBoundRemove() {
        List<Integer> list = new MyArrayList();
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(8);

        list.remove(0);

        elements.remove(0);
        try {
            list.get(3);
        } catch (Exception e) {
            assertEquals(IndexOutOfBoundsException.class, e.getClass());
            System.out.println(e.getMessage());
            return;
        }
        fail();

    }
}
