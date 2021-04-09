public class SortStack {
    
    public static void sortStack(CustomStack stack)
    {
        if (!stack.isEmpty())
        {
            Node temp = stack.pop();
            sortStack(stack);
            sortedInsert(stack, temp);
        }
    }

    public static void sortedInsert(CustomStack stack, Node node)
    {
        if (stack.isEmpty() || ((Integer.parseInt(node.getData()) > Integer.parseInt(stack.peek().getData()))))
        {
            stack.push(node);
        }
        else
        {
            Node temp = stack.pop();
            sortedInsert(stack, node);
            stack.push(temp);
        }
    }

    public static void main(String[] args)
    {
        CustomStack stack = new CustomStack();
        ArrayGenerator ag = new ArrayGenerator();
        int[] listOfNums = ag.NumsUnder10(10);
        for (int i = 0; i < listOfNums.length; i++)
        {
            stack.push(("" + listOfNums[i]));
        }
        System.out.print("Unsorted Stack: ");
        stack.print();
        System.out.println();
        sortStack(stack);
        System.out.print("Sorted Stack: ");
        stack.print();
        System.out.println();
    }
}
