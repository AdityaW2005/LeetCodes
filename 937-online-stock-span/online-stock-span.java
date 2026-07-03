class StockSpanner {
    class Pair {
        int price;
        int index;

        Pair(int price, int index) {
            this.price = price;
            this.index = index;
        }
    }

    Stack<Pair> st;
    int index;

    public StockSpanner() {
        st = new Stack<>();
        index = -1;
    }
    
    public int next(int price) {
        index++;
        while (!st.isEmpty() && st.peek().price <= price) {
            st.pop();
        }

        int span;
        if (st.isEmpty())
            span = index + 1;
        else
            span = index - st.peek().index;
        
        st.push(new Pair(price, index));
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */