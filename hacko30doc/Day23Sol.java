import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Day23Sol{
static void levelOrder(Node root){
    Queue<Node> myTree = new LinkedList();
    myTree.add(root); 
    while(!myTree.isEmpty()){
        Node current = myTree.remove();
        System.out.print(current.data+" ");
        if (current.left!=null) myTree.add(current.left);
        if (current.right!=null) myTree.add(current.right);
    }
}
public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}

/*
Learnings: 
Level Order traversal of a binary search tree.
This thing can be implemented using the queue data structure.

To call a function directly from a main function, the function should be static, 
otherwise, the following error will be generated :-
non-static method levelOrder(Node) cannot be referenced from a static context
*/