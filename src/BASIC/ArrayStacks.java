package BASIC;
public class ArrayStacks{
  Object[]data=new Object[10]; 
  public int size=0;
  int f=-1;
  // The number of items on the stack
  //int size();
  public int size(){
    return size;
  }
  // Returns true if the stack is empty
  //boolean isEmpty();
  public boolean isEmpty(){
    if(size==0){
      return true;
    }
    return false;
  }
  // Pushes the new item on the stack, throwing the 
    // StackOverflowException if the stack is at maximum capacity. It
    // does not throw an exception for an "unbounded" stack, which 
    // dynamically adjusts capacity as needed.
    //void push(Object o) throws StackOverflowException;
  public void push(Object o){
    if(size==data.length){
      System.out.println("resize pls");
    }else{
      f++;
      data[f]=o;
      size++;
    }
  }
  // Pops the item on the top of the stack, throwing the 
  // StackUnderflowException if the stack is empty.
  //Object pop() throws StackUnderflowException;
  public Object pop(){
    if(size<=0){
      System.out.println("nai kichu");
    }else{
      Object temp=data[f];
      data[f]=null;
      size--;
      f--;
      return temp;
    }
    return 0;
  }
  // Peeks at the item on the top of the stack, throwing 
  // StackUnderflowException if the stack is empty.
  //Object peek() throws StackUnderflowException;
  public Object peek(){
    if(size<=0){
      System.out.println("nai kichu");
    }else{
      return data[f];
    }
    return 0;
  }
  // Returns a textual representation of items on the stack, in the
  // format "[ x y z ]", where x and z are items on top and bottom 
  // of the stack respectively.
  //  String toString();
  public String toString(){
    String s="[ ";
    for(int c=size-1;c>=0;c--){
      s=s+data[c];
    }
    return s+"]";
  }
  // Returns an array with items on the stack, with the item on top
  // of the stack in the first slot, and bottom in the last slot.
  //Object[] toArray();
  public Object[] toArray(){
    Object[]a=new Object[size];
    for(int c=size-1;c>=0;c--){
      a[c]=data[c];
    }
    return a;
  }
  // Searches for the given item on the stack, returning the
  // offset from top of the stack if item is found, or -1 otherwise.
  //int search(Obejct o);
  public int search(Object o){
    for(int c=size;c>=0;c--){
        if(data[c]==o){
          return c;
        }
      }
      return -1;
    }
    
}