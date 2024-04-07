public class customStack {
    protected int[] data;
    private static final size=10;
    int ptr=-1;
    public customStack(int size)
    {
        data=new int[10];
    }
    public boolean push(int val)
    {
        if(isFull())
        {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr]=val;
        return true;
    }
    public int pop()  throws StackException
    {
        if(isEmpty())
        {
            throw new StackException("cannot pop element from stack");
        }
        return data[r--];
    }
    public int peek() throws StackException
    {
        if(isEmpty())
        {
            throw new StackException("cannot pop element from stack");
        }
        return data[ptr];
    }
    public boolean isFull()
    {
        return ptr==data.length-1;
    }
    public int isEmpty()
    {
        return ptr=-1;
    }
}
