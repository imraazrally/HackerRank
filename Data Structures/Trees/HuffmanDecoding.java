void decode(String S ,Node root){
    Node current=root;
    
    for (char ch : S.toCharArray()){
        if(ch=='0')current=current.left;
        if(ch=='1')current=current.right;
        
        //If we reach a leaf node we print the data
        if(current.left==null && current.right==null){
            System.out.printf("%c",current.data);
            current=root;
        }
    } 
}

