import utils.*;
/**
*Class which satisfies the coding challenge requirement of determining if a given array 
*of integers between 0 and 100 contains duplicate elements. 
* 
* @author Mitchell Hayes
* @since 19 April 2021
* @version 1.0
*/
public class DuplicateElements 
{
    
    /**
     * Static Method which finds duplicate elements between 0 - 100 of an n length array of random integers. 
     * 
     * Process runs in O(n) time when no duplicates are present. 
     * This is the fastest implementation possible because there is no direct comparison between elements. 
     * Because we have the constraint of the integers being between 0-100 we can utilise a boolean array,
     * which adds a low space overhead, and constant time look up to determine if we have seen any given value before.
     * So for each value in the array we check if we have seen it before, if we have we return true, otherwise we note that we have now seen it.
     * 
     * @param array The integer array to be assessed for duplicates
     * @return a boolean true if duplicates are present false if none are found. 
     */
    public static boolean duplicateFinder(int[] array)
    {
        boolean[] pList = new boolean[100];
        boolean dupsFound = false;
        for (int i = 0; i < array.length; i++)
        {
            int val = array[i];
            if (pList[val])
            {
                dupsFound = true;
                return dupsFound; 
            }
            pList[val] = true;
        }
        return dupsFound;
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
        int[] intArray = {};
        while (true)
        {
            int choice = in.acceptIntegerInput( "Enter 1 to input a list of integers from 0 - 99 separated by spaces."
                                            + "\nEnter 2 to generate a random list of integers."
                                            + "\nEnter 3 to quit." );
            
            switch (choice)
            {
                case 3:
                    System.exit(0);
                    break;
                    
                case 2:
                    int numOfNums = in.acceptIntegerInput("Please enter size of list");
                    intArray = ag.NumsUnder100(numOfNums);
                    for (int i = 0; i < intArray.length; i++)
                    {
                        System.out.print(intArray[i]+ " ");
                    }
                    System.out.println();
                    break;
                    
                case 1:
                    String nums = in.acceptStringInput("Please enter a list of integers separated by spaces.");
                    String[] stringList = nums.split(" ");
                    intArray = new int[stringList.length];
                    for (int i = 0; i < stringList.length; i++)
                    {
                        intArray[i] = Integer.parseInt("" + stringList[i]);
                    } 
                    break;
    
                default:
                    System.out.println("Invalid input, please enter a number between 1 and 3");
                    continue;
            }
            Boolean dupsFound = duplicateFinder(intArray);
            System.out.println(dupsFound);
        }
    }
}
