package lib;

public class TreeNode {
     
    private String data; 
    private TreeNode left;
    private TreeNode right;
    private TreeNode parent;
    
    public TreeNode()
    {
        data = ""; 
        left = null;
        right = null;
        parent = null;
    }

    public TreeNode(String d) 
    { 
        data = d; 
        left = null; 
    }

    public String getData()
    {
        return data;
    }

    public TreeNode getLeft()
    {
        return left;
    }

    public TreeNode getRight()
    {
        return right;
    }

    public TreeNode getParent()
    {
        return parent;
    }

    public void setData(String d)
    {
        data = d;
    }

    public void setLeft(TreeNode n)
    {
        left = n;
    }

    public void setRight(TreeNode n)
    {
        right = n;
    }

    public void setParent(TreeNode n)
    {
        parent = n;
    }
}
