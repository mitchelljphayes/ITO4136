import java.util.*;

//import utils.*;
import lib.*;
import utils.StringGenerator;

public class ReverseQueue {

    public static void populate(CustomQueue queue, String[] words)
    {
        for (int i = 0; i < words.length; i++)
        {    
            queue.enqueue(words[i]);
        };
    }

    public static void reverseQueueLooping(CustomQueue queue)
    {
        int queSize = queue.size();
        for (int i = (queSize - 1); i > 0; i--)
        {
            ListNode selection = queue.dequeue();
            for (int j = 0; j <= (queSize - 1); j++)
            {
                
                ListNode requeueListNode = queue.dequeue();
                if (j == i)
                {
                    queue.enqueue(selection);
                    // j--;
                }
                queue.enqueue(requeueListNode);
                if ((i == 1) && j == (queSize - 2))
                {
                    break;
                }
            }
        }
    }

    public static void reverseQueueRecursive(CustomQueue queue)
    {
        if (queue.isEmpty())
        {
            return;
        }
        ListNode node = queue.dequeue();
        reverseQueueRecursive(queue);    
        queue.enqueue(node);
    }
    
    public static void main (String Args[])
    {
        CustomQueue queue = new CustomQueue();

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter the list of words to be reversed seperated by spaces");
        // String input = sc.nextLine();
        // String[] words = input.split(" ");
        StringGenerator sg = new StringGenerator();
        String[] words = sg.wordList(6);
        populate(queue, words);
        System.out.println(queue.display());
        reverseQueueRecursive(queue);
        System.out.println(queue.display());
        // sc.close();
    }

}
