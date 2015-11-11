
static Node lca(Node root,int v1,int v2){ 
   return findLca(root, Math.min(v1,v2), Math.max(v1,v2));
}

static Node findLca(Node root, int v1, int v2){
   if (root==null) return root;
    
   /*
        *If we are at a pivot point, then it must mean that the current node is the lowest common ancestor 
        *Further, If I am V1, then I am the LCA of V2
        *Further, if I am V2, then I am the LCA of V1
   */
    
   if(v1<root.data && v2>root.data || v1==root.data || v2==root.data)return root; 
   //If both values are less than the current node, we move to the LEFT sub-tree
   if(v1<root.data && v2<root.data) return findLca(root.left, v1,v2);
  //If both values are greater than the current node, we move to the RIGHT sub-tree
   if(v1>root.data && v2>root.data) return findLca(root.right, v1,v2);

   /*
      The assumption given was that V1 and V2 are definitely present in the tree. If we reach past this line, the assumption is wrong.
   */
   return null;
}

