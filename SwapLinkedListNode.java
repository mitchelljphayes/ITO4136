public class SwapLinkedListNode {
    

    public static void main(String[] args)
    {
        ArrayGenerator ag = new ArrayGenerator();
        CustomSinglyLinkedList sLL = new CustomSinglyLinkedList();
        int[] numList = ag.NumsUnder10(13);
        for (int i = 0; i < numList.length; i++)
        {
            String s = ("" + numList[i]);
            sLL.addLast(s);
        }
        System.out.println("Starting " + sLL.display());
        ListNode itr = sLL.getHead();
        do
        {  
                try
                {
                    ListNode next = itr.getNext();
                    ListNode nextNext = next.getNext();
                    if (itr == sLL.getHead())
                    {
                        sLL.setHead(next);
                    }
                    next.setNext(itr);
                    if (nextNext.getNext() != null)
                    {
                        itr.setNext(nextNext.getNext());
                    }
                    else
                    {
                        itr.setNext(nextNext);
                    }
                    itr = nextNext;
                }
                catch (NullPointerException np)
                {
                    break;
                }
        } while (itr != sLL.getTail());
        System.out.println("Finished " + sLL.display());
    }
}
