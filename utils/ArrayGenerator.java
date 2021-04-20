package utils;

import java.util.Random;

/**
 * Class that generates random integer arrays.
 * 
 * @author Mitchell Hayes
 * @since 19 April 2021
 * @version 1.0
 */
public class ArrayGenerator {
    
    /**
     * Constructor method, class has no attributes so is empty
     */
    public ArrayGenerator()
    {

    }
    
    /**
     * Method that returns an array of integers below 10, size of array is passed as an argument. 
     * @param numOfNums size of array
     * @return integer array
     */
    public int[] NumsUnder10(int numOfNums)
    {
        Random random = new Random();
        int[] numList = new int[numOfNums];
        for (int i = 0; i < numOfNums; i++)
        {
            numList[i] = random.nextInt(10);
        }
        return numList;
    }

    /**
     * Method that returns an array of integers below 100, size of array is passed as an argument. 
     * @param numOfNums size of array
     * @return integer array
     */
    public int[] NumsUnder100(int numOfNums)
    {
        Random random = new Random();
        int[] numList = new int[numOfNums];
        for (int i = 0; i < numOfNums; i++)
        {
            numList[i] = random.nextInt(100);
        }
        return numList;
    }
}