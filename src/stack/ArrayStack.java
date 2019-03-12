package stack;

public class ArrayStack implements Stack_INTERFACE {

    private Object[] data;      // The array container
    private int size;      // The number of items in the stack
    private int f = -1;

    public ArrayStack(int capacity) {
        data = new Object[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public void push(Object o) throws StackOverflowException {
        if (size == data.length) {
            throw new StackOverflowException();
        } else {

            f++;
            data[f] = o;
            size++;
        }
    }

    public Object pop() throws StackUnderflowException {
        Object temp;
        if (size == 0) {
            throw new StackUnderflowException();
        } else {
            temp = data[f];
            data[f] = null;
            size--;
            f--;
        }
        return temp;
    }

    public Object peek() throws StackUnderflowException {
        if (size == 0) {
            throw new StackUnderflowException();
        } else {
            return data[f];
        }
    }

    public String toString() {
        String str = " ";
        for (int c = size - 1; c >= 0; c--) {
            str = str + data[c];
        }
        return str;
    }

    public Object[] toArray() {
        Object[] s = new Object[size];
        int d = 0;
        for (int c = size - 1; c >= 0; c--) {
            s[d] = data[c];
            d++;
        }
        return s;
    }

    public int search(Object o) {
        for (int c = data.length - 1; c >= 0; c--) {
            if (data[c] == o) {
                return c;
            }
        }
        return -1;
    }

}
