package BASIC;
public class ListStack{
  Node1 head=new Node1(null,null,null);          // Reference to the top of the stack
  int  size;
  Node1 current=head;
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    if(head==null){
      return true;
    }
    return false;
  }
  public void push(Object o){
    Node1 mn=new Node1(o,null,null);
    current.next=mn;
    mn.pre=current;
    current=mn;
    size++;
  }
  public Object pop(){
    if(size<=0){
      System.out.println("nai kichu");
    }else{
      Object prev=current.element;
      current=current.pre;
      current.next=null;
      size--;
      return prev;
    }
    return 0;
  }
  public Object peek(){
    if(size<=0){
      System.out.println("nai kichu");
    }else{
      return current.element;
    }
    return 0;
  }
   public String toString(){
    String s="[ ";
    for(Node1 n=head;n!=null;n=n.next){
      s=s+n.element;
    }
    return s+"]";
   }
   public Object[] toArray(){
    Object[]a=new Object[size];
    Node1 n=head.next;
    int c=0;
    while(n!=null){
      a[c]=n.element;
      c++;
      n=n.next;
    }
    return a;
   }
   public int search(Object o){
     Node1 n=head.next;
     int c=0;
     while(n!=null){
       if(o==n.element){
         return c;
       }
       c++;
       n=n.next;
     }
     return -1;
   }
     
}