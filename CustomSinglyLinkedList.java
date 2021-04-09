public class CustomSinglyLinkedList
{

    private ListNode head;
    private ListNode tail;
    private int size;

    public CustomSinglyLinkedList()
    {
         head = null;
         tail = head;
         size = 0;
    }

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

    public void display()
    {
        System.out.println("The list contains");
        if (head != null)
        {
            ListNode itrNode = head;
            do
            {
                System.out.println(itrNode.getData());
                itrNode = itrNode.getNext();
            } while(itrNode.getNext() != null);
        }
        else
        {
            System.out.println("List empty! Ignoring!");
        }
    }

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

    public ListNode getHead()
    {
        return head;
    }

    public ListNode getTail()
    {
        return tail;
    }

    public int getSize()
    {
        return size;
    }

    public void removeNode(int index)
    {
        ListNode nodeBefore = findIndexNode(index - 1);
        nodeBefore.setNext(nodeBefore.getNext().getNext());
        size--;
    }

    public void resize()
    {
        if (head != null)
        {
            int counter = 1;
            ListNode iteratorNode = head;
            do
            {    
                iteratorNode = iteratorNode.getNext();
                counter++;
            } while(iteratorNode.getNext() != null);
            size = counter;
            return;
        }
        else
        {
            size = 0;
        }
    }
}

