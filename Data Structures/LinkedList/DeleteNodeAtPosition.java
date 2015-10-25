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

Node Delete(Node head, int position) {
    Node prev=head;
    Node current=head;
    
    if(head==null) return head;
    if(position==0 && head.next!=null){
        head=head.next;
    }else{
        for(int i=0; i<position; i++){
            current=current.next;
            if(i>=1)prev=prev.next;
        }
        prev.next=current.next;

    }
    return head;
    
}

