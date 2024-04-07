package binaryTree;
import java.util.Scanner;

public class Node extends binaryTree{
    int data;
    Node left;
    Node right;
    Node()
    {
        
    }
    Node(int data)
    {
        this.data=data;
    }

    private Node root;

    public void populate(Scanner vis)
    {
        System.out.println("Enter the root node");
        int value=vis.nextInt();
        root=new Node(value);
        populate(vis,root);
    }
    public void populate(Scanner vis,Node node)
    {
        System.out.println("Do you want to enter left of the node");
        boolean left=vis.nextBoolean();
        if(left)
        {
            System.out.println("Enter the left value");
            int value=vis.nextInt();
            node.left=new Node(value);
            populate(vis, node.left);
        }
        System.out.println("Do you want to enter right of the node");
        boolean right=vis.nextBoolean();
        
        if(right){
            System.out.println("Enter the right value");
            int val=vis.nextInt();
            node.right=new Node(val);
            populate(vis, node.right);
        }
    }
    public void display()
    {
        display(root);
    }
    public void display(Node root)
    {
        if(root==null)
            return;

        System.out.println(root.data);
        display(root.left);
        display(root.right);
    }
}
