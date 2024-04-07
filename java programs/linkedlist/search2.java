package linkedlist;
public class search2 {
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
        if(head==null)
        {
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public boolean find(node head,int x)
    {
        node curr=head;
        if(curr==null)
            return false;
        if(curr.data==x)
            return true;

        return find(curr.next,x);
    }
    public static void main(String[] args)
    {
        search2 s=new search2();
        s.addFirst(1);
        s.addFirst(2);
        s.addFirst(3);
        s.addFirst(4);
        int x=30;
        if(s.find(s.head,x))
        {
            System.out.println("Search element found");
        }
        else{
            System.out.println("Search element not found");
        }
    }

}
