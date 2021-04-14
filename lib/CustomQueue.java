package lib;

public class CustomQueue {
    
    private ListNode first;
    private ListNode last;
    private int size;

    public CustomQueue()
    {
        first = null;
        last = null;
        size = 0;
    }
    
    public void clear()
    {
        first = null;
        last = null;
        size = 0;
    }
    
    public ListNode dequeue()
    {
        ListNode freeNode = first;
        if (size >= 2)
        {
            first = freeNode.getPrevious();
        }
        else
        {
            first.setPrevious(null);
        }
        first.setNext(null);
        freeNode.setNext(null);
        freeNode.setPrevious(null);
        size--;
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

    public void enqueue(String value)
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
        size++;
    }
    public void enqueue(ListNode node)
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
        size++;
    }

    public ListNode first()
    {
        return first;
    }

    public boolean isEmpty()
    {
        if (size == 0)
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
        return size;
    }





}
