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
            char[] word = new char[random.nextInt(8)+3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));
            }
            stringList[i] = new String(word);
        }
        return stringList;
    }
}
