public class doubleLinkedList {
    private Node head;
    private Node tail;
    private int size;
    class Node{
        private int val;
        private Node prev;
        private Node next;
        Node(int val)
        {
            this.val=val;
        }
    }
    public void addLast(int val)
    {
        Node node=new Node(val);
        if(head==null)
        {
            head=node;
            tail=node;
        }
        else{
            node.next=head;
            head.prev=node;
            head=node;
        }
    }
    public void addFirst(int val)
    {
        Node node=new Node(val);
        if(tail==null)
        {
            head=node;
            tail=node;
        }
        else{
            node.prev=tail;
            tail.next=node;
            tail=node;
        }
    }
    public void display()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.val+" -> ");
            curr=curr.next;
        }
        System.out.println("END");
    }
    public void insertlast(int num)
    {
        Node node=new Node(num);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
    }
    public static void main(String[] args)
    {
        doubleLinkedList l=new doubleLinkedList();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.addLast(5);
         l.display();
        l.insertlast(90);
        l.display();
    }
}
