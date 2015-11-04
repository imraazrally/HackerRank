/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     //Since we will only recieve a valid position and not null list,  no need for null check and error handling.
     Node traceHead=head;
     //a temp pointer that always point to n'th previous node
     Node tracePrevNthNode=head;
     // Current Position;
     int position=0;
    
     while(traceHead.next!=null){
         if(position>=n)tracePrevNthNode=tracePrevNthNode.next;
         traceHead=traceHead.next;
         position++;
     }
    
     //When the traceHead has reached the end of the list, tracePrevNthNode will be pointing to the nth node prior to the current node, hence we return the data.
     return tracePrevNthNode.data;
    
}
