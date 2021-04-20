package lib;
/**
 * Class which defines a custom implementation of a node to be used in a list derived datastructure.
 * 
 * @author Mitchell Hayes
 * @since 19 April 2021
 * @version 1.0
 */
public class ListNode {
     
    private String data; 
    private ListNode previous;
    private ListNode next;
    
    /**
     * Default constructor method, sets all references to null and uses an empty string for data.
     */
    public ListNode()
    {
        data = ""; 
        previous = null;
        next = null;
    }
    
    /**
     * Constructor method, takes an argument to be used as data parameter.
     * @param d String Data
     */
    public ListNode(String d) 
    { 
        data = d; 
        previous = null;
        next = null; 
    }
    
    /**
     * Method to return the data in the node.
     * @return String containing data.
     */
    public String getData()
    {
        return data;
    }

    /**
     * Method to get access to the next node. 
     * @return the next node. 
     */
    public ListNode getNext()
    {
        return next;
    }

    /**
     * Method to access the previous node. 
     * @return the previous node. 
     */
    public ListNode getPrevious()
    {
        return previous;
    }

    /**
     * Method to set the data in a node. 
     * @param d String to be assigned to the data variable on the node. 
     */
    public void setData(String d)
    {
        data = d;
    }

    /**
     * Method to set the next node. 
     * @param n node to be set at next. 
     */
    public void setNext(ListNode n)
    {
        next = n;
    }

    /**
     * Method to set the previous node. 
     * @param n node to be set as previous. 
     */
    public void setPrevious(ListNode n)
    {
        previous = n;
    }

}
