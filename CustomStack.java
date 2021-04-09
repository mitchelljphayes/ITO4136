public class CustomStack {
    
    private ListNode top;
    private int size;

    public CustomStack()
    {
        top = null;
        size = 0;
    }
    
    public void print()
    {
        ListNode top = this.pop();
        if (!this.isEmpty())
        {
            System.out.print(top.getData() + ", ");
            this.print();
        }
        this.push(top);
    }

    public void push(ListNode node)
    {
        if (top != null)
        {
            node.setNext(top);
        }
        top = node;
        size++;
    }

    public void push(String value)
    {
        ListNode node = new ListNode();
        node.setData(value);
        if (top != null)
        {
            node.setNext(top);
        }
        top = node;
        size++;
    }

    public void push(char value)
    {
        ListNode node = new ListNode();
        node.setData("" + value);
        if (top != null)
        {
            node.setNext(top);
        }
        top = node;
        size++;
    }

    public ListNode pop()
    {
        ListNode freeNode = top;
        if (size > 1)
        {
            top = freeNode.getNext();
        }
        freeNode.setNext(null);
        size--;
        return freeNode;
    }

    public ListNode peek()
    {
        return top; 
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        boolean isEmpty = false;
        if (size == 0)
        {
            isEmpty = true;
        }
        return isEmpty;
    }

}
