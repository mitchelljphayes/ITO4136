public class CustomStack {
    
    private Node top;
    private int size;

    public CustomStack()
    {
        top = null;
        size = 0;
    }
    
    public void push(Node node)
    {
        if (top != null)
        {
            node.setNext(top);
        }
        top = node;
        size++;
    }

    public Node pop()
    {
        Node freeNode = top;
        if (size > 1)
        {
            top = freeNode.getNext();
        }
        freeNode.setNext(null);
        size--;
        return freeNode;
    }

    public Node peek()
    {
        return top; 
    }

    public int size()
    {
        return size;
    }

    public boolean empty()
    {
        boolean isEmpty = false;
        if (size == 0)
        {
            isEmpty = true;
        }
        return isEmpty;
    }

}
