package lib;
/**
 * Class which defines a custom implementation of a double ended queue or dequeue.
 * 
 * @author Mitchell Hayes
 * @since 19 April 2021
 * @version 1.0
 */
public class CustomDequeue {
    
    private ListNode first;
    private ListNode last;
    private int size;

    
    /**
     * Constructor Method for custom Dequeue implementation.
     */
    public CustomDequeue()
    {
        first = null;
        last = null;
        size = 0;
        
    }
    
    /**
     * Method that Clears the dequeue by setting first and last to null.
     */
    public void clear()
    {
        first = null;
        last = null;
        size = 0;
    }
    
    /**
     * Method to pop the first element of the dequeue.
     * 
     * @return a Node that was the first Node.
     */
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
        size--;
        return freeNode;
    }

    /**
     * Method to pop the last element of the dequeue.
     * 
     * @return a Node that was the last Node.
     */
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
        size--;
        return freeNode;
    }

    /**
     * Method which iterates through the dequeue and returns a string containing the data in each node.
     * 
     * @returna string which displays all the values present in the dequeue.
     */
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

    /**
     * Method to push an element onto the back of the dequeue, takes a value and generates a node. 
     *
     * @param value takes a string value to be added to the back of the dequeue.
     */
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
        size++;
    }

    /**
     * Method to push an element onto the back of the dequeue, takes a node and adds it to the dequeue.
     * 
     * @param node node to be added to the back of the dequeue.
     */
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
        size++;
    }

    /**
     * Method to push an element onto the front of the dequeue, takes a value and generates a node. 
     *
     * @param value takes a string value to be added to the front of the dequeue.
     */
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
        size++;
    }

    /**
     * Method to push an element onto the front of the dequeue, takes a node and adds it to the dequeue.
     * 
     * @param node node to be added to the front of the dequeue.
     */
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
        size++;
    }

    /**
     * Method to get access to the first node, does not pop node. 
     * @return Node located at the front of dequeue.
     */
    public ListNode getFront()
    {
        return first;
    }
    /**
     * Method to get access to the last node, does not pop node. 
     * @return Node located at the back of dequeue.
     */
    public ListNode getBack()
    {
        return last;
    }

    /**
     * Method to determine if dequeue is empty.
     * @return true if dequeue is empty false otherwise.
     */
    public boolean isEmpty()
    {
        if (size == 0)
        {
            return true;
        }
        return false; 
    }

    /**
     * Method to access size of dequeue.
     * @return an int representing the number of nodes currently in the dequeue.
     */
    public int size()
    {
        return size;
    }





}
