int height(Node root){
        //base
        if(root==null) return 0;
        //Getting the maximum length from the left sub-tree.
        return Math.max(height(root.left)+1, height(root.right)+1);
}