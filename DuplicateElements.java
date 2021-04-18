import java.util.Random;
import utils.*;

public class DuplicateElements {
    
    public static String duplicateFinder(int[] array, boolean[] plist)
    {
        boolean dupsFound = false;
        String reportString = "Duplicates found: ";
        for (int i = 0; i < array.length; i++)
        {
            int val = array[i];
            if (plist[val])
            {
                dupsFound = true;
                reportString += (val + " ");
                continue; 
            }
            plist[val] = true;
        }
        if (dupsFound == false)
        {
            reportString = "No duplicates found";
        }  
        return reportString;
    }
    
    public static void main(String[] args)
    {
        boolean[] presenceList = new boolean[100];
        ArrayGenerator ag = new ArrayGenerator();
        Random rng = new Random();
        int[] randomArray = ag.NumsUnder100((rng.nextInt(40) + 100));
        System.out.println(duplicateFinder(randomArray, presenceList));

        // for (int i = 0; i < presenceList.length; i++)
        // {
        //     System.out.println(presenceList[i]);
        // }

    }
}
