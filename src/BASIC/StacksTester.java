package BASIC;

public class StacksTester {

    public static void main(String[] args) {
        //System.out.println("======= PRINTING LIST ARRAY=======");
        //ArrayStacks abir = new ArrayStacks();
        
        System.out.println("======= PRINTING LIST NODE=======");
        ListStack abir = new ListStack();

        // The number of items on the stack
        System.out.println("======= PRINTING LIST SIZE=======");
        System.out.println(abir.size());
        
        // Returns true if the stack is empty
        System.out.println("======= PRINTING LIST EMPTY=======");
        System.out.println(abir.isEmpty());
        
        // Pushes the new item on the stack, throwing the 
        // StackOverflowException if the stack is at maximum capacity. It
        // does not throw an exception for an "unbounded" stack, which 
        // dynamically adjusts capacity as needed.
        //void push(Object o) throws StackOverflowException;
        System.out.println("======= PRINTING LIST AFTER PUSH=======");
        abir.push("A");
        abir.push("B");
        abir.push("I");
        abir.push("R");
        System.out.println("======= PRINTING LIST SIZE=======");
        System.out.println(abir.size());
        System.out.println("======= PRINTING LIST EMPTY=======");
        System.out.println(abir.isEmpty());
        System.out.println("======= PRINTING LIST AFTER PUSH AGIAN=======");
        abir.push("2");
        abir.push("9");
        System.out.println("======= PRINTING LIST SIZE=======");
        System.out.println(abir.size());
        
        // Pops the item on the top of the stack, throwing the 
        // StackUnderflowException if the stack is empty.
        //Object pop() throws StackUnderflowException;
        //System.out.println(abir.size());
        //System.out.println(abir.isEmpty());
        System.out.println("=======LIST POP=======");
        System.out.println(abir.pop());
        System.out.println("======= PRINTING LIST SIZE AFTER POP=======");
        System.out.println(abir.size());
        
        // Peeks at the item on the top of the stack, throwing 
        // StackUnderflowException if the stack is empty.
        //Object peek() throws StackUnderflowException;
        //System.out.println(abir.size());
        //System.out.println(abir.isEmpty());
        //System.out.println(abir.peek());
        System.out.println("======= PRINTING LIST PEEK=======");
        System.out.println(abir.peek());
        
        //// Returns a textual representation of items on the stack, in the
        // format "[ x y z ]", where x and z are items on top and bottom 
        // of the stack respectively.
        //String toString();
        System.out.println("======= PRINTING LIST TO STRING=======");
        System.out.println(abir.toString());
        
        
        // Returns an array with items on the stack, with the item on top
        // of the stack in the first slot, and bottom in the last slot.
        //Object[] toArray();
        System.out.println("======= PRINTING FROM TO ARRAY=======");
        Object[] a = abir.toArray();
        for (int c = 0; c < a.length; c++) {
            System.out.println(a[c]);
        }
        
        
        // Searches for the given item on the stack, returning the
        // offset from top of the stack if item is found, or -1 otherwise.
        //int search(Obejct o);
        System.out.println("======= PRINTING SEARCH B=======");
        System.out.println(abir.search("B"));
    }
}
