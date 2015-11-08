void Inorder(Node root) {
    if(root==null)return;
    Inorder(root.left);
    System.out.printf("%d ",root.data);
    Inorder(root.right);
}