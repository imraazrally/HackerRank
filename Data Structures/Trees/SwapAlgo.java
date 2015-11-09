import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        int totalNodesInTree=stdIn.nextInt();
        Queue <Node> nodesInCurrentLevel=new LinkedList<Node>();
        
        //Initially we have Node(1) in the tree;
        Node root=new Node(1);
        nodesInCurrentLevel.add(root);
        Node current;

        /*
         * Building the Tree by adding nodes to the tree in level order from input via stdIn
        */
        int i=0;
        while(i<totalNodesInTree && !nodesInCurrentLevel.isEmpty()){
                //Reading data for left child
                int leftVal=stdIn.nextInt();
                //Reading data for right child
                int rightVal=stdIn.nextInt(); 
                current=nodesInCurrentLevel.remove();
                /*
                    Upon pointing current.left={leftChild} and current.right={rightChild}
                    We push the {leftChild} and {rightChild} into the queue if not null
                */
                insertLeft(current,leftVal,nodesInCurrentLevel);    
                insertRight(current,rightVal,nodesInCurrentLevel);
                i++;
        }    
       
        //Performing swaps
        int numberOfSwaps=0;
        if(totalNodesInTree>0)numberOfSwaps=stdIn.nextInt();
        for (i=0; i<numberOfSwaps; i++){
            swapLeftRightAtLevelKN(root,stdIn.nextInt(),1,1);
            printTree(root);
            System.out.println("");
        }
        
               
    }
    
    public static void swapLeftRightAtLevelKN(Node root, int levelK, int n, int currentLevel){
        if(root==null) return;
        if(currentLevel==levelK*n){
            Node temp=root.left;
            root.left=root.right;
            root.right=temp;
            n++;
        }
        swapLeftRightAtLevelKN(root.left, levelK, n,  currentLevel+1);
        swapLeftRightAtLevelKN(root.right, levelK, n, currentLevel+1);
    }
    
    public static void insertLeft(Node root, int val, Queue <Node> nodesInCurrentLevel){
        if(val==-1){
            root.left=null;
        }else{
            root.left=new Node(val);
            nodesInCurrentLevel.add(root.left);
        }
    }
    
     
    public static void insertRight(Node root, int val, Queue <Node> nodesInCurrentLevel){
        if(val==-1){
            root.right=null;
        }else{
            root.right=new Node(val);
            nodesInCurrentLevel.add(root.right);
        }
    }
    
    
    public static void printTree(Node root){
        if(root==null) return;
        printTree(root.left);
        System.out.printf("%d ",root.data);
        printTree(root.right);
    }
}

class Node{
    int data;
    Node left=null;
    Node right=null;
    public Node(int data){
        this.data=data;
    }
}

