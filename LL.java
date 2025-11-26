 class LL{    
    Node head;
    private int size;
    LL(){
    this.size=0;
    }
    class Node{
         String data;
          Node next;
              Node(String data) 
               {
                this.data= data ;
                this.next=null;
                size++;
                }
              }
    //addFirst - last
    public void addFirst(String data)
    {
        Node newNode = new Node(data);
         if(head==null)
         {
            head = newNode;
             return;
         }
        newNode.next=head;
        head=newNode;
    }
 public void addLast(String data)
 {
    Node newNode = new Node(data);
    if(head==null)
      {
        head=newNode;
        return;
       }
    Node curNode=head;
    while(curNode.next!=null)
      {
        curNode=curNode.next;
      }
    curNode.next = newNode;
 
 }
 //delete first-last
public void removeFirst()
{
    if(head==null)
      {
        System.out.println("List is empty:");
        return;
      }
      size--; 
    head = head.next;

}

public void removeLast()
{
    if(head==null)
      {
        System.out.println("List is empty:");
        return;
      }
      size--;
    if(head.next==null)
      {
        head=null;
        return;
      }
Node secondLast = head;
Node lastNode = head.next;
while(lastNode.next!=null)
    {
        lastNode=lastNode.next;
        secondLast=secondLast.next;
    }
    secondLast.next=null;
}
  
public int getSize(){
    return size;
}
 public  void Display()
 {
    if(head==null)
    {
        System.out.println("List is empty!");
        return;
    }
    Node curNode=head;
    while(curNode!=null)
    {
        System.out.print(curNode.data + "--> ");
        curNode=curNode.next;
    }
    System.out.println("Null");
 }
 public void reverse(){
    Node prevNode = head;
    Node CurNode = head.next;
    while(CurNode!=null)
    {
Node nextNode=CurNode.next;
CurNode.next=prevNode;
prevNode = CurNode;
CurNode = nextNode;


    }
    head.next=null;
    head=prevNode;
    
 } 
 public static void main(String args[])
 {
 LL list = new LL();
list.addFirst("a");
list.addFirst("is");
list.Display();
list.addLast("list");
list.addFirst("this");
list.Display();
list.removeFirst();
list.Display();
list.removeLast();
list.Display();
System.out.println("Size of linked list: " + list.getSize());
list.addLast("Linked");
list.addLast("list");
list.addFirst("This");
list.Display();
list.reverse();
list.Display();

 }
} 
