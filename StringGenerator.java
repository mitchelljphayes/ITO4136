import java.util.Random;

public class StringGenerator {
    
    public StringGenerator()
    {

    }

    public String[] wordList(int numElements)
    {
        String[] stringList = new String[numElements];
        Random random = new Random();
        for(int i = 0; i < numElements; i++)
        {
            char[] word = new char[random.nextInt(16)+4];
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));
            }
            stringList[i] = new String(word);
        }
        return stringList;
    }

    public String word(int numLetters)
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

    public String sometimesPalindromes()
    {
        Random random = new Random();
        char[] word = new char[(random.nextInt(14)+3)];
        int choice = random.nextInt(10);
        if (choice <= 3)
        {
            for (int j = 0; j < word.length; j++)
            {
                if (j <= ((word.length - 1) / 2))
                {
                    word[j] = (char)('a' + random.nextInt(26));
                    continue;
                }
                else 
                {
                    word[j] = word[((word.length - 1) - j)];
                }
            }
        }
        else 
        {
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));
            }
        }
        String newWord = new String(word);
        return newWord;
    }

}
