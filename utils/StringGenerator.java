package utils;

import java.util.Random;
/**
 * Class which generates random words for use when testing functions.
 * 
 * @author Mitchell Hayes
 * @since 19 April 2021
 * @version 1.0
 */
public class StringGenerator {
    /**
     * Default constructor for the String generator class, 
     * class has no attributes so method is empty.
     */
    public StringGenerator(){}

    /**
     * Method to generate a random palindrome between 3 and 15 charachters
     * @return String of palindrome generated. 
     */
    public String createPalindrome()
    {
        Random random = new Random();
        char[] pal = new char[(random.nextInt(12)+3)];        
        for (int j = 0; j < pal.length; j++)
        {
            if (j <= ((pal.length - 1) / 2))
            {
                pal[j] = (char)('a' + random.nextInt(26));
                continue;
            }
            pal[j] = pal[((pal.length - 1) - j)];
        }
        return new String(pal);
    }

    /**
     * Method to generate a string array of random words.
     * @return String array of random words.
     */
    public String[] createWordList(int numElements)
    {
        String[] stringList = new String[numElements];
        for(int i = 0; i < numElements; i++)
        {
            stringList[i] = createWord();
        }
        return stringList;
    }

    /**
     * Method that creates words of a defined length.
     * @param numLetters number of letters to be in word.
     * @return word generated. 
     */
    public String createWord(int numLetters)
    {
        Random random = new Random();
        char[] word = new char[numLetters];
        for(int j = 0; j < word.length; j++)
        {
            word[j] = (char)('a' + random.nextInt(26));
        }
        String newWord = new String(word);
        return newWord;
    }

    /**
     * Method that creates random words between 3 and 15 characters long.
     * @return word generated. 
     */
    public String createWord()
    {
        Random random = new Random();
        char[] word = new char[random.nextInt(12)+3];
        for(int j = 0; j < word.length; j++)
        {
            word[j] = (char)('a' + random.nextInt(26));
        }
        String newWord = new String(word);
        return newWord;
    }

    /**
     * Method that return palindromes 30% of the time.
     * @return String that is sometimes a palindrome.
     */
    public String sometimesPalindromes()
    {
        Random random = new Random();
        String newWord;
        int choice = random.nextInt(10);
        if (choice <= 3)
        {
            newWord = createPalindrome();
            return newWord;
        }
        newWord = createWord();
        return newWord;
    }

}
