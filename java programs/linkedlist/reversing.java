package linkedlist;
public class reversing {
    node head;
    node temp;
    class node{
        int data;
        node prev;
        node next;
        node(int data)
        {
            this.data=data;
        }
    }
    public void addFirst(int data)
    {
        node newnode=new node(data);
        if(head==null)
        {
            head=newnode;
            temp=newnode;
            newnode.prev=null;
        }
        temp.next=newnode;
        newnode.prev=temp;
        temp=newnode;
    }
    public void printall()
    {
        node curr=temp;
        while(curr!=null)
        {
            System.out.print(curr.data+"->");
            curr=curr.prev;
        }
        System.out.print("NULL");
    }
    public static void main(String[] args)
    {
        reversing r=new reversing();
        r.addFirst(1);
        r.addFirst(2);
        r.addFirst(3);
        r.printall();
    }
    
}
