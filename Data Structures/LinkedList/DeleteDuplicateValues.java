/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
    if(head==null) return head;
    
    Node current=head;
    Node temp=head;
    
    while(current.next!=null){
        temp=current.next;
        if (current.data==temp.data){
            current.next=temp.next;
            temp.next=null;
        }else{
            current=current.next;
        }
    }
    
    return head;
}