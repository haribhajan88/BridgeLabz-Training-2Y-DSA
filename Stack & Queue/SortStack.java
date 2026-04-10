import java.util.*;

class SortStack {
    static void sortedInsert(Stack<Integer> st, int x) {
        if (st.isEmpty() || x > st.peek()) {
            st.push(x);
            return;
        }
        int temp = st.pop();
        sortedInsert(st, x);
        st.push(temp);
    }

    static void sortStack(Stack<Integer> st) {
        if (!st.isEmpty()) {
            int x = st.pop();
            sortStack(st);
            sortedInsert(st, x);
        }
    }
}
