package stack;

public class NodeStack implements Stack_INTERFACE {

    private Node head;
    private Node current;
    int size;

    private class Node {

        public Object elem;
        public Node next;
        public Node prev;

        public Node(Object e, Node n, Node p) {
            elem = e;
            next = n;
            prev = p;
        }

        public Node(Object e) {
            this(e, null, null);
        }
    }

    public NodeStack() {
        head = new Node(null, null, null);
        current = head;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (head.next == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Object o) {

        Node n = new Node(o);

        current.next = n;
        n.prev = current;
        n.next = null;
        current = n;
        size++;

    }

    public Object pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException();
        } else {
            Object tmp = current.elem;
            current = current.prev;
            current.next = null;
            size--;
            return tmp;
        }
    }

    public Object peek() throws StackUnderflowException {
        if (size == 0) {
            throw new StackUnderflowException();
        } else {
            Object tmp = current.elem;
            return tmp;
        }
    }

    public String toString() {
        String str = null;
        Node tail = head;

        while (tail.next != null) {
            str = str + tail.elem;
            tail = tail.next;
        }
        return str;
    }

    public Object[] toArray() {
        Object[] arr = new Object[size];
        Node n = head.next;
        int c = 0;
        while (n != null) {
            arr[c] = n.elem;
            c++;
            n = n.next;
        }
        return arr;

    }

    public int search(Object o) {
        Node n = head.next;
        int c = 0;
        while (n != null) {
            if (o == n.elem) {
                return c;
            }
            c++;
            n = n.next;
        }
        return -1;
    }

}
