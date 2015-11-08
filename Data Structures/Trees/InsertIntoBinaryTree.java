static Node Insert(Node root,int value)
{
    Node newNode=new Node();
    Node trace=root;
    newNode.data=value;
    
    //Empty Tree
    if(root==null)return newNode;
    
    while(true){
        if(value<=trace.data){
           if(insertLeft(trace,newNode))break;
           trace=trace.left;
        }else{
           if(insertRight(trace,newNode))break;
           trace=trace.right;
        }
    }
    
    return root;
}

static boolean insertLeft(Node root, Node newNode){
    //We can only insert an element if it's null. If not, we return false;
    if(root.left!=null) return false;
    root.left=newNode;
    return true;
}

static boolean insertRight(Node root, Node newNode){
    //We can only insert an element if it's null. If not, we return false;
    if(root.right!=null) return false; 
    root.right=newNode;
    return true;
}