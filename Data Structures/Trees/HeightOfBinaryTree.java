int height(Node root){
        //base
        if(root==null) return 0;
        //Getting the maximum length of the left sub-tree vs right sub-tree.
        return Math.max(height(root.left)+1, height(root.right)+1);
}
