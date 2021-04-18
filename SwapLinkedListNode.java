import utils.*;
import lib.*;

public class SwapLinkedListNode {
    
    public static void swapAdjNodes(CustomSinglyLinkedList list)
    {
        ListNode itr = list.getHead();
        while ((itr != null) && (itr.getNext() != null))
        {  
            ListNode next = itr.getNext();
            ListNode nextNext = next.getNext();
            if (itr == list.getHead())
            {
                list.setHead(next);
            }
            next.setNext(itr);
            // Beasue the itrator moves forward two nodes at a time, nextNext may be null if the arraylength is even. 
            if ((nextNext == null) || (nextNext.getNext() == null))
            {
                itr.setNext(nextNext);
                break;
            }
            itr.setNext(nextNext.getNext());
            itr = nextNext;
        } 
    }

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