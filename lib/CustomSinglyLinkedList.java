package lib;
/**
 * Class which defines a custom implementation of a singly linked list.
 * 
 * @author Mitchell Hayes
 * @since 19 April 2021
 * @version 1.0
 */
public class CustomSinglyLinkedList
{

    private ListNode head;
    private ListNode tail;
    private int size;

    /**
     * Default Constructor Method, sets size and all nodes to null.
     */
    public CustomSinglyLinkedList()
    {
         head = null;
         tail = head;
         size = 0;
    }

    /**
     * method to add first node to linked list, takes a value and generates the node.
     * @param val value of node to be added to list.
     */
    public void addFirst(String val)
    {
        ListNode newNode = new ListNode();
        newNode.setData(val);
        newNode.setNext(head);
        head = newNode;
        if (tail == null)
        {
            tail = head;
        }
        size++;
    }

    /**
     * method to add last node to linked list, takes a value and generates the node.
     * @param val value of node to be added to list.
     */
    public void addLast(String val)
    {
        if (head != null)
        {        
            ListNode newNode = new ListNode();
            newNode.setData(val);
            newNode.setNext(null);
            tail.setNext(newNode);
            tail = newNode;
            size++;
        }
        else
        {
            addFirst(val);
        }
    }

    /**
     * method to add node to a specified index of linked list, takes a value and generates the node.
     * @param val value of node to be added to list.
     * @param index position to add node. 
     */
    public void addMiddle(String val, int index)
    {
        if (head != null)
        {
            ListNode newNode = new ListNode();
            newNode.setData(val);
            if (index <= size)
            {
                ListNode indexNode = findIndexNode(index);
                newNode.setNext(indexNode.getNext());
                indexNode.setNext(newNode);
                size++;
            }        
        }
        else
        {
            addFirst(val);
        }
    }

    /**
     * Method to return a string containing all values in the list. 
     * 
     * @return String containing all values in the list. 
     */
    public String display()
    {
        String displayString = "List Data:";
        if (head != null)
        {
            ListNode itrNode = head;
            while (true)
            {
                displayString += (" " + itrNode.getData());
                if (itrNode.getNext() != null)
                {
                    itrNode = itrNode.getNext();
                }
                else
                {
                    break;
                }
            }
        }
        else
        {
            displayString = "List empty!";
        }
        return displayString;
    }

    /**
     * Method to find a node at a specific index, does not remove said node. 
     * 
     * @param index index to find node.
     * @return Node at specified index. 
     */
    public ListNode findIndexNode(int index)
    {
        //should probably hande this by throwing an exception when head == null rather than using the if statement.
        if (head != null)
        {
            int counter = 0;
            ListNode iteratorNode = head;
            do
            {    
                if (counter + 1 == index)
                {
                    return iteratorNode;
                }
                if (iteratorNode.getNext() != null)
                {
                    iteratorNode = iteratorNode.getNext();
                    counter++;
                }
            } while(counter + 1 <= size);
        }
        return head;
    }

    /**
     * Returns the head of the list.
     * @return Node at head.
     */
    public ListNode getHead()
    {
        return head;
    }

    /**
     * Returns the tail of the list.
     * @return Node at tail.
     */
    public ListNode getTail()
    {
        return tail;
    }

    /**
     * Returns the size of the list.
     * @return Int representing the number of nodes in list.
     */
    public int getSize()
    {
        return size;
    }

    /**
     * removes a node from a specific index.
     * @param index index of node to be removed.
     */
    public void removeNode(int index)
    {
        ListNode nodeBefore = findIndexNode(index - 1);
        nodeBefore.setNext(nodeBefore.getNext().getNext());
        size--;
    }

    /**
     * Sets a specific node to be the head of the linked list. If used incorrectlty could lose the rest of the list.
     * @param node node to become the new head.
     */
    public void setHead(ListNode node)
    {
        head = node;
    }

    /**
     * Sets a specific node to be the tail of the linked list. Important to do if things have been rearranged extensively.
     * @param node node to become the new tail.
     */
    public void setTail(ListNode node)
    {
        tail = node;
    }

}

