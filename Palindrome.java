public class Palindrome {
    

    public static boolean palindromeCheck(CustomDequeue deq)
    {
        Boolean isPalindrome = false;
        while (!deq.isEmpty())
        {
            System.out.println(deq.size());
            if (deq.size() > 1)
            {
                ListNode front = deq.dequeueFront();
                ListNode back = deq.dequeueBack();  
                if (front.getData().equals(back.getData()))
                {
                    isPalindrome = true;
                    continue;
                }
                else
                {
                    isPalindrome = false;
                    break;
                }
            }
            else
            {
                break;
            }
        }
        return isPalindrome;
    }

    
    public static void main (String[] args)
    {
        while (true)
        {    
            CustomDequeue deq = new CustomDequeue();
            StringGenerator sg = new StringGenerator();
            String word = new String(sg.sometimesPalindromes());
            System.out.println(word);
            for (int i = 0; i < word.length(); i++)
            {
                String str = "" + word.charAt(i);
                deq.enqueueFront(str);
            }
            
            boolean isPalindrome = palindromeCheck(deq);
            if (isPalindrome)
            {
                System.out.println("Word IS a palindrome");
                System.exit(0);
            }
            else
            {
                System.out.println("Word IS NOT a palindrome");
                System.exit(0);
            }
        }
    }
}
