import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

public class Stackk {
    public static void main(String[] args) {
        Deque<Integer> st=new ArrayDeque<>();
        st.push(1);
        st.push(100);
        st.push(112);

//        int[] arr={12,34,567,209};
        System.out.println(st);

        ArrayList<Integer>arr=new ArrayList<Integer>();
        arr.add(12);
        arr.add(122);
        arr.add(1222);
        arr.add(12223);
        st.pop();
        System.out.println(st);

        st.size();
        System.out.println(st.add(1203));
//        System.out.println(st.search(100));
        System.out.println(st);
        System.out.println(st.size());
        st.addAll(arr);
        System.out.println(st);
        ArrayDeque<Integer> newSt;
        // ------------------
//        See this typecasting
        newSt = ((ArrayDeque<Integer>) st).clone();
        // ------------------
        System.out.println(newSt.contains(122));
        System.out.println(newSt);

    }


}
