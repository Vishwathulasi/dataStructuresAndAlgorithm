package linkedlist;
public class reverse {
    node head;
    class node{
        int data;
        node next;
        node(int data)
        {
            this.data=data;
        }
    }
    public void addFirst(int data)
    {
        node newnode=new node(data);
        newnode.next=head;
        head=newnode;
    }
    public void printall(node head)
    {
        node curr=head;
        if(curr==null)
        {
            System.out.print("NULL");
            return;
        }
        System.out.print(curr.data+"->");
        printall(curr.next);
    }
    public static void main(String[] args)
    {
        reverse list1=new reverse();
        list1.addFirst(1);
        list1.addFirst(2);
        list1.addFirst(3);
        list1.printall(list1.head);
    }
}
