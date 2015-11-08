void LevelOrder(Node root)
{
    Queue <Node> elements=new LinkedList <Node>();
    if(root==null) return;
    
    elements.add(root);
    while(!elements.isEmpty()){
        Node current=elements.remove();
        if(current.left!=null) elements.add(current.left);
        if(current.right!=null) elements.add(current.right);
        System.out.printf("%d ",current.data);
    }
}

