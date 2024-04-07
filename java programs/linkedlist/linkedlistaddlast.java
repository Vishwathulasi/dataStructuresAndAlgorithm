package linkedlist;
class linkedlistaddlast
{
    linkedlistaddlast.node head;
    linkedlistaddlast.node temp;
    class node{
        int data;
        node next;
        node(int data)
        {
            this.data=data;
        }
    }
    public void addLast(int data)
    {
        node newnode=new node(data);
        if(head==null)
        {
            head=newnode;
            temp=newnode;
            return;
        }
        temp.next=newnode;
        temp=newnode;
    }
    public void printall()
    {
        if(head==null)
        {
            System.out.print("List is empty");
        }
        node currentnode=head;
        while(currentnode!=null)
        {
            System.out.print(currentnode.data+"->");
            currentnode=currentnode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args)
    {
        linkedlistaddlast pp=new linkedlistaddlast();
        pp.addLast(1);
        pp.addLast(2);
        pp.addLast(3);
        pp.printall();
    }
}