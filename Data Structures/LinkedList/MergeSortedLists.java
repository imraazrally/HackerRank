/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node MergeLists(Node headA, Node headB) {
    if(headA==headB)return headA;
    if(headA==null) return headB;
    if(headB==null) return headA;
      
    //Initiating the new Merged List 
    Node headMergedList=new Node();
    
    Node traceA=headA;
    Node traceB=headB;
    Node traceMergedList=headMergedList;

    while(traceA!=null && traceB!=null){
        if(traceA.data<traceB.data){
            traceMergedList.next=traceA;
            traceMergedList=traceMergedList.next;
            traceA=traceA.next;
            traceMergedList.next=null;
        }else{
            traceMergedList.next=traceB;
            traceMergedList=traceMergedList.next;
            traceB=traceB.next;
            traceMergedList.next=null;
        }
    }
    
    if(traceA==null)traceMergedList.next=traceB;
    if(traceB==null)traceMergedList.next=traceA;
        
    return headMergedList.next;
    
    
}
