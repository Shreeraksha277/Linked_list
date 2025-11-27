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
 public Node removeNthFromEnd(Node head,int n){

  
  if(head.next==null){
    return null;
  }
int size=0;
Node curr=head;
while(curr!=null){
  curr=curr.next;
  size++;
}
if(n==size){
  return head.next;
}
int index = size-n;
Node prev=head;
int i=0;
while(i<index-1)
{
  prev = prev.next;
  i++;
}
prev.next=prev.next.next;
return head;
  }
  public Node getMiddle(Node head) {
   Node fast = head;
   Node slow = head;
   while (fast.next != null && fast.next.next != null) {
       fast = fast.next.next;
       slow = slow.next;
   }
   return slow;
}


public Node reverse(Node head) {
   Node prev = null;
   Node curr = head;
  
   while (curr != null) {
       Node next = curr.next;
       curr.next = prev;
       prev = curr;
       curr = next;
   }
   return prev;
}




public boolean isPalindrome(Node head) {
   if(head == null || head.next == null) {
       return true;
   }
  
   Node firstHalfEnd = getMiddle(head);
   Node secondHalfStart = reverse(firstHalfEnd.next);
   Node firstHalfStart = head;
  
   while(secondHalfStart != null) {
       if(!secondHalfStart.data.equals(firstHalfStart.data)) {
           return false;
       }
       secondHalfStart = secondHalfStart.next;
       firstHalfStart = firstHalfStart.next;
   }
  
   return true;
}
public boolean hasCycle(Node head) {
   Node slow = head;
   Node fast = head;
  
   while(fast != null && fast.next != null) {
       slow = slow.next;
       fast = fast.next.next;
      
       if(fast == slow) {
           return true;
       }
   }
  
   return false;
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
 list.removeNthFromEnd(list.head,3);
list.Display();
System.out.println(" " + list.isPalindrome(list.head));
System.out.println(" " + list.hasCycle(list.head));

 }
} 

