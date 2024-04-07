package linkedlist;

class linkedlistaddfirst
{
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
    public void addfirst(int data)
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
    public void printall()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        node currnode=head;
        while(currnode!=null)
        {
            System.out.print(currnode.data+"->");
            currnode=currnode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args)
    {
        linkedlistaddfirst list=new linkedlistaddfirst();
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);
        list.printall();
    }
}