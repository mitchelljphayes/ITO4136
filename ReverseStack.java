import utils.*;
import lib.*;

public class ReverseStack {
    public static void reverseStack(CustomStack stack)
    {
        if (stack.isEmpty())
        {
            return;
        }
        ListNode temp = stack.pop();
        reverseStack(stack);
        invertStack(stack,temp);
    }

    public static void invertStack(CustomStack stack, ListNode node)
    {
        if (stack.isEmpty())
        {
            stack.push(node);
        }
        else
        {
            ListNode temp = stack.pop();
            invertStack(stack, node);
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
        reverseStack(stack);
        System.out.print("Sorted Stack: ");
        stack.print();
        System.out.println();
    }
}
