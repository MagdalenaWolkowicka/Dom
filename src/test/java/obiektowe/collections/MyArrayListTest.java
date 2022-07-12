package obiektowe.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest extends ListTest {

    public MyArrayListTest() {
        super(new MyArrayList<>());
    }

}