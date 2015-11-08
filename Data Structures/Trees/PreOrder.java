void Preorder(Node root) {
    if(root==null)return;
    System.out.printf("%d ",root.data);
    Preorder(root.left);
    Preorder(root.right);
}
