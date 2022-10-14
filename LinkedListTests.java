import java.util.NoSuchElementException;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LinkedListTests {
    @Test(expected = NoSuchElementException.class)
    public void shouldThrowNoSuchElementExceptionOnFirstWhenItsEmpty() {
        LinkedList list = new LinkedList();
        list.first();
    }

    @Test(timeout=1500)
    public void shouldAbleToDoPrepend() {
        LinkedList list = new LinkedList();
        list.prepend(1);
        list.prepend(2);
        list.prepend(3);
        assertEquals("3 2 1 ", list.toString());
    }

    @Test(timeout=1500)
    public void shouldAbleToDoAppend() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals("1 2 3 ", list.toString());
    }
}