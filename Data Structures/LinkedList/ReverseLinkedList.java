/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node reverse(Node head) {
    Node temp=head;
    Node current=head;
    if (head==null)return head;
    while(current.next!=null){
        temp=current.next;
        current.next=temp.next;
        temp.next=head;
        head=temp;
    }
    return head;
}
