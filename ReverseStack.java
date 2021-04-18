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
        pushNodeBottom(stack,temp);
    }

    public static void pushNodeBottom(CustomStack stack, ListNode node)
    {
        if (stack.isEmpty())
        {
            stack.push(node);
        }
        else
        {
            ListNode temp = stack.pop();
            pushNodeBottom(stack, node);
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
        System.out.print("Oiginal Stack: ");
        stack.print();
        System.out.println();

        reverseStack(stack);
        
        System.out.print("Reverse Stack: ");
        stack.print();
        System.out.println();
    }
}
