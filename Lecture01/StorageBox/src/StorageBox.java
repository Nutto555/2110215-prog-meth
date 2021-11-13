public class StorageBox {
    private Object[] box;
    private int top_idx;

    // Constructor
    public StorageBox() {
        box = new Object[1];
        top_idx = -1;
    }

    public StorageBox(Object[] box, int top_idx) {
        this.box = box;
        this.top_idx = top_idx;
    }

    // Methods
    public boolean isEmpty() {
        return box.length == 0 || top_idx == -1;
    }

    public boolean isFull() {
        return box.length - 1 == top_idx;
    }

    public void push(Object x) {
        if (isFull()) {
            Object[] tmp = new Object[box.length * 2];
            System.arraycopy(box, 0, tmp, 0, box.length);
            box = tmp;
        }
        box[++top_idx] = x;
    }

    Object pop() {
        if (isEmpty()) {
            return null;
        }
        return box[top_idx--];
    }

    Object top() {
        if (isEmpty()) {
            return null;
        }
        return box[top_idx];
    }

    //getter
    public int getTop_idx() {
        return top_idx;
    }
}
