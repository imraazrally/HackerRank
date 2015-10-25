/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
   //Two References to keep track of the list
   Node traceA=headA;
   Node traceB=headB;
   //If both lists are pointing to null they are equal
   if(headA==null && headB==null)return 1;
    
   //Trace each list side by side and test if elements are equal while either list is not null;
   while(traceA!=null && traceB!=null){
       if(traceA.data!=traceB.data)return 0;
       traceA=traceA.next;
       traceB=traceB.next;
   }
   //Ensuring that both lists have reached the absolute end
   if(traceA==traceB)return 1;
   //In the event that one list has ended while the other hasn't
   return 0;
}