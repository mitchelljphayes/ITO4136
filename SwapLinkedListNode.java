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
    *Static Method which takes a CustomSinglyLinkedList and rearanges the nodes such that each adjacent pair of nodes is swapped.
    *
    The function is completed in O(1/2 * n) time because it operates in a single pass and the itrator node moves forward two nodes at a time. 
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
            // Beasue the itrator moves forward two nodes at a time, 
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
        CustomSinglyLinkedList numList = new CustomSinglyLinkedList();
        int[] intList = ag.NumsUnder10(8);
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