public class circularLinkedlist {
    private Node head;
    private Node tail;
    class Node{
        private int val;
        private Node next;
        Node(int val)
        {
            this.val=val;
        }
    }
    public void addFirst(int val)
    {
        Node node=new Node(val);
        if(head==null)
        {
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            node.next=head;
            tail=node;
        }
    }
    public void delete(int value)
    {
        if(head.val==value)
        {
            tail.next=head.next;
            head=head.next;
        }
        else{
            Node temp=head;
            do{
                Node n=temp.next;
                if(n.val==value)
                {
                    temp.next=n.next;
                }
                temp=temp.next;
            }while(temp!=head);
        }
    }
    public void display()
    {
        Node temp=head;
        do
        {
            System.out.print(temp.val+" - > ");
            if(temp.next!=null)
                temp=temp.next;
        }while(temp!=head);
    }
    public static void main(String[] args)
    {
        circularLinkedlist l=new circularLinkedlist();
        l.addFirst(1);
        l.addFirst(2);
        l.addFirst(3);
        l.addFirst(4);
        l.addFirst(5);
        l.display();
         l.delete(4);
         System.out.println();
        l.display();
    }
}
