import utils.*;
import lib.*;
/**
* Class which satisfies the coding challenge requirement of determining if a given string is a palindrome. 
* 
* @author Mitchell Hayes
* @since 19 April 2021
* @version 1.0
*/
public class Palindrome {
    
    /**
     * Static Method which determines if the string held in the dequeue is a palindrome. 
     * in each iteration the first and last elements are removed and compared, 
     * this is continues while there is more then one node in the dequeue,
     * if the two nodes are ever not equal there is no palindrome and the function returns false. 
     * 
     * Running time is O(1/2*n) because the algorithm removes two elements in each iteration. 
     * This is the fastest possible implementation because each element i must be compared with its n-i counter-part,
     * in order to confirm the presence of a palindrome. The process also terminates as soon as a non-palindrome is detected, 
     * giving near constant time rejections of non-palindromes. 
     * 
     * @param deq a dequeue which has each char of the string being assessed as a node. 
     * @return a boolean which is true if the dequeue contains a palindrome and false otherwise
     */
    public static boolean palindromeCheck(CustomDequeue deq)
    {
        Boolean isPalindrome = true;
        while (deq.size() > 1)
        {
            ListNode front = deq.dequeueFront();
            ListNode back = deq.dequeueBack();  
            if (!front.getData().equals(back.getData()))
            {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static void populateDequeue(String word, CustomDequeue deq)
    {
        for (int i = 0; i < word.length(); i++)
        {
            String str = "" + word.charAt(i);
            deq.enqueueFront(str);
        }
    }

    /**
     * Main method, acts as driver code for the "algorithm" above. 
     *  
     * @param args takes a list of command line args, not used in this program, just convention.
     */
    public static void main (String[] args)
    {
        StringGenerator sg = new StringGenerator();
        Input in = new Input();
        while (true)
        {    
            CustomDequeue deq = new CustomDequeue();
            String word = "";
            int choice = in.acceptIntegerInput( "Enter 1 to enter word to check if it is a palindrome."
                                                + "\nEnter 2 to generate a random palindrome."
                                                + "\nEnter 3 to generate a random 'word'."
                                                + "\nEnter 4 to have a 30 % chance of a palindrome."
                                                + "\nEnter 5 to quit." );

            switch (choice)
            {
                case 1:
                    word = in.acceptStringInput("Please enter your word");
                    break;

                case 2:
                    word = sg.createPalindrome();
                    break;

                case 3:
                    word = sg.createWord();
                    break;

                case 4:
                    word = sg.sometimesPalindromes();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    word = in.acceptStringInput("Please enter your word");
            }
            word = word.trim();
            populateDequeue(word, deq);
            boolean isPalindrome = palindromeCheck(deq);
            if (isPalindrome)
            {
                System.out.println(word + " IS a palindrome");
            }
            else
            {
                System.out.println(word + " IS NOT a palindrome");
            }
        }
    }
}
