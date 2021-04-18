import java.util.*;

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

    public static void reverseQueue(CustomQueue queue)
    {
        if (queue.isEmpty())
        {
            return;
        }
        ListNode node = queue.dequeue();
        reverseQueue(queue);    
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
        reverseQueue(queue);
        System.out.println(queue.display());
        // sc.close();
    }

}
