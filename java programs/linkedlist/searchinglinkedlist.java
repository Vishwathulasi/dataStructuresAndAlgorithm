package linkedlist;
class searchinglinkedlist
{
    node head;
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
    public boolean search(node head,int x)
    {
        node curr=head;
        while(curr!=null)
        {
           if(curr.data==x)
                return true;
            curr=curr.next;
        }
        return false;
    }
    public static void main(String[] args)
    {
        searchinglinkedlist ll=new searchinglinkedlist();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        int x=3;
        if(ll.search(ll.head,x))
        {
            System.out.println("Search element found");
        }
        else{
            System.out.println("Search element not found");
        }
    }
}
class node{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
    }
}