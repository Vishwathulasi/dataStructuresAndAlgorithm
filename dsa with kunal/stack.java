import java.util.*;
import java.util.LinkedList;
public class stack {
    public static void main(String[] args)
    {
        Stack<Integer> st=new Stack<>();
        st.push(21);
        st.push(25);
        st.push(26);
        st.push(27);
        System.out.println(st.pop());

        Queue<Integer> qu=new LinkedList<>();
        st.add(21);
        st.add(23);
        st.add(25);
        st.add(217);
        System.out.println(st.pop());
    }
}
