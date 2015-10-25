/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data){
    Node temp=head;
    //Constructing the Node
    Node dataNode=new Node();
    dataNode.data=data;
    dataNode.next=null;
    
    if(head==null){
        head=dataNode;
    }else{
        while(temp.next!=null)temp=temp.next;
        temp.next=dataNode;
    }
    return head;
}