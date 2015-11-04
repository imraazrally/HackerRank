/*
  Detect cycle in the list
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int HasCycle(Node head) {
    //Implementing the tortise and hare algorithm. 
    if(head==null) return 0;
    Node tortoise=head;
    Node hare=head;
    
    while(hare.next.next!=null){
        tortoise=tortoise.next;
        hare=hare.next.next;
        if(tortoise==hare)return 1;
    }
    
    return 0;
    
}
