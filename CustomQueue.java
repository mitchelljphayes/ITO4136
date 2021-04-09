public class CustomQueue {
    
    private ListNode first;
    private ListNode last;

    public CustomQueue()
    {
        first = null;
        last = null;
    }
    
    public void clear()
    {
        first = null;
        last = null;
    }
    
    public ListNode dequeue()
    {
        ListNode freeNode = first;
        first = freeNode.getPrevious();
        first.setNext(null);
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

    }

    public ListNode first()
    {
        return first;
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
        int counter = 0;
        ListNode itr = new ListNode();
        itr = last;
        do
        {
            itr = itr.getNext();
            counter++;
        } while (itr.getNext() != null);

        return counter;
    }





}
