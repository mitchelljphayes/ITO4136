public class ListNode {
     
    private String data; 
    private ListNode previous;
    private ListNode next;
    
    public ListNode()
    {
        data = ""; 
        previous = null;
        next = null;
    }

    public ListNode(String d) 
    { 
        data = d; 
        next = null; 
    }

    public String getData()
    {
        return data;
    }

    public ListNode getNext()
    {
        return next;
    }

    public ListNode getPrevious()
    {
        return previous;
    }

    }

    public void setData(String d)
    {
        data = d;
    }

    public void setNext(ListNode n)
    {
        next = n;
    }

    public void setPrevious(ListNode n)
    {
        previous = n;
    }

}
