public class LinkedList {
    private Node head;
    private Node tail;
    private int size=0;

    class Node{
        private int val;
        private Node next;
        Node(int val)
        {
            this.val=val;
        }
        Node(int val,Node next)
        {
            this.val=val;
            this.next=next;
        }
    }
    public  void addFirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }
        size++;
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
            tail.next=node;
            tail=node;
        }
        size++;
    }
    public void insert(int idx,int value)
    {
        Node curr=head;
        int s=0;
        while(curr!=null)
        {
            if(s==idx-1)
            {
                Node node=new Node(value);
                Node temp=curr.next;
                curr.next=node;
                node.next=temp;
            }
            curr=curr.next;
            s++;
        }
    }
    public int deleteFirst()
    {
        Node temp=head;
        head=head.next;
        if(head==null)
        {
            tail=null;
        }
        return temp.val;
    }
    public Node getNode(int idx)
    {
        Node node=head;
        for(int i=0;i<idx;i++)
        {
            node=node.next;
        }
        return node;
    }
    public int deleteLast()
    {
        Node temp=getNode(size-1);
        Node curr=temp.next;
        temp.next=null;
        return curr.val;
    }
    public int delete(int idx)
    {
        Node temp=getNode(idx-1);
        int curr=temp.next.val;
        temp.next=temp.next.next;
        return curr;
    }
    public Node find(int value)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.val==value)
            {
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" - > ");
            temp=temp.next;
        }
        System.out.println("End");
    }
    public static void main(String[] args)
    {
        LinkedList l=new LinkedList();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.insert(4,5);
        l.display();
        System.out.println(l.delete(2));
        l.display();
        System.out.println(l.find(4));
    }
}
