import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class StorageBoxTest {

    @Test
    void testIsEmpty() {
        StorageBox a = new StorageBox();
        assertTrue(a.isEmpty());

        a.push(new Object());
        assertFalse(a.isEmpty());

        a.push(new Object());
        assertFalse(a.isEmpty());

        a.pop();
        assertFalse(a.isEmpty());

        a.pop();
        assertTrue(a.isEmpty());

        a.pop();
        assertTrue(a.isEmpty());

    }

    @Test
    void testIsFull() {
        // Case 1:
        StorageBox tmp = new StorageBox();
        for (int i = 0; i < 4; i++) {
            tmp.push(i);
        }
        assertTrue(tmp.isFull());

        for (int i = 4; i < 15; i++) {
            tmp.push(i);
        }
        assertFalse(tmp.isFull());
    }

    @Test
    void testPush() {
        StorageBox a = new StorageBox();
        Object[] xs = new Object[7];
        for (int i = 0; i < xs.length; i++) {
            xs[i] = i;
        }

        for (int i = 0; i < xs.length; i++) {
            a.push(xs[i]);
            assertEquals(xs[i], a.top());
        }

    }

    @Test
    void testPopAndTop() {
        StorageBox tmp = new StorageBox();
        for (int i = 0; i < 4; i++) {
            tmp.push(i);
        }
        assertEquals(3, tmp.top());
        assertEquals(3, tmp.pop());
        assertEquals(2, tmp.top());
        assertEquals(2, tmp.getTop_idx());
    }

}
