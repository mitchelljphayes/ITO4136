public class CustomQueue {
    
    private Node first;
    private Node last;

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
    
    public Node dequeue()
    {
        Node freeNode = first;
        first = freeNode.getPrevious();
        first.setNext(null);
        freeNode.setNext(null);
        freeNode.setPrevious(null);
        return freeNode;
    }

    public String display()
    {
        String display = "";
        Node itr = first;
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
        Node newNode = new Node();
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
    public void enqueue(Node node)
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

    public Node first()
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
        Node itr = new Node();
        itr = last;
        do
        {
            itr = itr.getNext();
            counter++;
        } while (itr.getNext() != null);

        return counter;
    }





}
