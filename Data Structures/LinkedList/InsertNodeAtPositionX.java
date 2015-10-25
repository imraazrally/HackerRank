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

Node InsertNth(Node head, int data, int position){
    // Initializing a Current Ref and a Pref Ref to Nodes
    Node current=head;
    Node prev=head;
    // Building the Node to be inserted
    Node newNode=new Node();
    newNode.data=data;
   
    if(position==0){
       //the newNode is the onlyNode in the list
       newNode.next=head;
       return newNode;
    }else{
          //Continue moving down the chain (while maintaining a reference to the previous node),
          for(int i=0; i<position; i++){
              current=current.next;
              if(i>=1)prev=prev.next;
          }
          //Inserting the newNode in between the previous node and the next node.
          prev.next=newNode;
          newNode.next=current;
          return head;
    }
}
