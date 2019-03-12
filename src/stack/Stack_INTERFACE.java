package stack;
public interface Stack_INTERFACE{
    // The number of items on the stack
    int size();
    // Returns true if the stack is empty
    boolean isEmpty();
    // Pushes the new item on the stack, throwing the 
    // StackOverflowException if the stack is at maximum capacity. It
    // does not throw an exception for an "unbounded" stack, which 
    // dynamically adjusts capacity as needed.
    void push(Object o) throws StackOverflowException;
    // Pops the item on the top of the stack, throwing the 
    // StackUnderflowException if the stack is empty.
    Object pop() throws StackUnderflowException;
    // Peeks at the item on the top of the stack, throwing 
    // StackUnderflowException if the stack is empty.
    Object peek() throws StackUnderflowException;
    // Returns a textual representation of items on the stack, in the
    // format "[ x y z ]", where x and z are items on top and bottom 
    // of the stack respectively.
    String toString();
    // Returns an array with items on the stack, with the item on top
    // of the stack in the first slot, and bottom in the last slot.
    Object[] toArray();
    // Searches for the given item on the stack, returning the
    // offset from top of the stack if item is found, or -1 otherwise.
    int search(Object o);
}