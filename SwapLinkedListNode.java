import utils.*;
import lib.*;
/**
 * Class which satisfies the coding challenge requirement of swaping adjacent nodes in a singly linked list. 
 * 
 * @author Mitchell Hayes
 * @since 19 April 2021
 * @version 1.0
 */
public class SwapLinkedListNode {
    
    /**
    * Static Method which takes a CustomSinglyLinkedList and rearanges the nodes such that each adjacent pair of nodes is swapped.
    * The function is completed in O(1/2 * n) time because it operates in a single pass and the itrator node moves forward two nodes at a time. 
    *
    *@param list a CustomSinglyLinkedList which is to be modified. 
    */
    public static void swapAdjNodes(CustomSinglyLinkedList list)
    {
        ListNode itr = list.getHead();
        ListNode next, nextNext;
        while ((itr != null) && (itr.getNext() != null))
        {  
            next = itr.getNext();
            nextNext = next.getNext();
            if (itr == list.getHead())
            {
                list.setHead(next);
            }
            next.setNext(itr);
            // Because the itrator moves forward two nodes at a time, 
            // nextNext may be null if the arraylength is even. 
            if ((nextNext == null) || (nextNext.getNext() == null))
            {
                itr.setNext(nextNext);
                break;
            }
            itr.setNext(nextNext.getNext());
            itr = nextNext; 
        } 
    }
    /**
     * Main method, acts as driver code for the "algorithm" above. 
     *  
     * @param args takes a list of command line args, not used in this program, just convention.
     */
    public static void main(String[] args)
    {
        ArrayGenerator ag = new ArrayGenerator();
        Input in = new Input();
        while (true)
        {
            CustomSinglyLinkedList numList = new CustomSinglyLinkedList();
            int[] intList = {};
            int choice = in.acceptIntegerInput( "Enter 1 to input a list of integers separated by spaces."
                                            + "\nEnter 2 to generate a random list of integers."
                                            + "\nEnter 3 to quit." );
    
            switch (choice)
            {
                case 3:
                    System.exit(0);
                    break;
                    
                case 2:
                    int numOfNums = in.acceptIntegerInput("Please enter size of list");
                    intList = ag.NumsUnder10(numOfNums);
                    break;
                    
                case 1:
                    String nums = in.acceptStringInput("Please enter a list of integers separated by spaces.");
                    String[] stringList = nums.split(" ");
                    intList = new int[stringList.length];
                    for (int i = 0; i < stringList.length; i++)
                    {
                        intList[i] = Integer.parseInt("" + stringList[i]);
                    } 
                    break;
    
                default:
                    System.out.println("Invalid input, please enter a number between 1 and 3");
                    continue;
            }
            
            for (int i = 0; i < intList.length; i++)
            {
                String s = ("" + intList[i]);
                numList.addLast(s);
            }
            System.out.println("Starting " + numList.display());
            swapAdjNodes(numList);
            System.out.println("Finished " + numList.display());
        }
    }
}