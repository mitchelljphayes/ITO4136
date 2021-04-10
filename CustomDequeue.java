public class CustomDequeue {
    
    private ListNode first;
    private ListNode last;

    public CustomDequeue()
    {
        first = null;
        last = null;
    }
    
    public void clear()
    {
        first = null;
        last = null;
    }
    
    public ListNode dequeueFront()
    {
        ListNode freeNode = first;
        if (last.getNext() != null)
        {
            first = freeNode.getPrevious();
        }
        first.setNext(null);
        freeNode.setNext(null);
        freeNode.setPrevious(null);
        return freeNode;
    }

    public ListNode dequeueBack()
    {
        ListNode freeNode = last;
        if (last.getNext() != null)
        {
            last = freeNode.getNext();
        }
        last.setPrevious(null);
        freeNode.setNext(null);
        freeNode.setPrevious(null);
        return freeNode;
    }

    public String display()
    {
        String display = "";
        ListNode itr = first;
        while (itr != last)
        {
            String word = itr.getData();
            display += (word + " ");
            itr = itr.getPrevious();
        } ;
        display += last.getData();
        return display;
    } 

    public void enqueueBack(String value)
    {
        ListNode newNode = new ListNode();
        newNode.setData(value);

        if (last != null)
        {
            newNode.setNext(last);
            last.setPrevious(newNode);
        }
        last = newNode;
        if (first == null)
        {
            first = newNode;
        }
    }

    public void enqueueBack(ListNode node)
    {
        if (last != null)
        {
            node.setNext(last);
            last.setPrevious(node);
        }
        last = node;
        if (first == null)
        {
            first = node;
        }
    }

    public void enqueueFront(String value)
    {
        ListNode newNode = new ListNode();
        newNode.setData(value);

        if (first != null)
        {
            newNode.setPrevious(first);
            first.setNext(newNode);
        }
        first = newNode;
        if (last == null)
        {
            last = newNode;
        }
    }

    public void enqueueFront(ListNode node)
    {
        if (first != null)
        {
            node.setPrevious(first);
            first.setNext(node);
        }
        first = node;
        if (last == null)
        {
            last = node;
        }
    }

    public ListNode getFront()
    {
        return first;
    }

    public ListNode getBack()
    {
        return last;
    }

    public boolean isEmpty()
    {
        if (first == null)
        {
            return true;
        }
        else
        {
            return false; 
        }

    }

    public int size()
    {
        int counter = 1;
        ListNode itr = new ListNode();
        itr = last;
        while (itr.getNext() != null)
        {
            if (itr.getNext() != null)
            {
                itr = itr.getNext();
                counter++;
            }
        }
        return counter;
    }





}
