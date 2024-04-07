package linkedlist;
public class deleting {
    node head;
    class node
    {
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
    public void deletenode()
    {
        node curr=head;
        node temp1=head;
        while(curr.next!=null)
        {
            temp1=curr;
            curr=curr.next;
        }
        temp1.next=null;
    }
    public void printall()
    {
        node now=head;
        while(now!=null)
        {
            System.out.print(now.data+"->");
            now=now.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args)
    {
        deleting d=new deleting();
        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        d.addFirst(4);
        d.deletenode();
       d.printall();
    }
}
