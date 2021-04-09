import java.util.Random;

public class ArrayGenerator {
    
    public ArrayGenerator()
    {

    }

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