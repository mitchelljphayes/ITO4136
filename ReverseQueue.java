import java.util.*;

public class ReverseQueue {

    public static void populate(CustomQueue queue, String[] words)
    {
        for (int i = 0; i < words.length; i++)
        {    
            queue.enqueue(words[i]);
        };
    }
    
    public static void main (String Args[])
    {
        CustomQueue queue = new CustomQueue();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the list of words to be reversed seperated by spaces");
        String input = sc.nextLine();
        String[] words = input.split(" ");
        populate(queue, words);
        int queSize = queue.size();
        for (int i = (queSize - 1); i > 0; i--)
        {
            Node selection = queue.dequeue();
            for (int j = 0; j <= (queSize - 1); j++)
            {
                
                Node requeueNode = queue.dequeue();
                if (j == i)
                {
                    queue.enqueue(selection);
                }
                queue.enqueue(requeueNode);
                if ((i == 1) && j == (queSize - 2))
                {
                    break;
                }
            }
        }
        System.out.println(queue.display());
        sc.close();
    }

}
