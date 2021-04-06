public class Node {
     
    private String data; 
    private Node next;
    private Node previous;
    
    public Node()
    {
        data = ""; 
        next = null;
        previous = null;
    }

    public Node(String d) 
    { 
        data = d; 
        next = null; 
    }

    public String getData()
    {
        return data;
    }

    public Node getNext()
    {
        return next;
    }

    public Node getPrevious()
    {
        return previous;
    }

    public void setData(String d)
    {
        data = d;
    }

    public void setNext(Node n)
    {
        next = n;
    }

    public void setPrevious(Node n)
    {
        previous = n;
    }

    
}
