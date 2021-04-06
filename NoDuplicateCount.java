public class NoDuplicateCount {
    

    public static void main (String Args[])
    {
        int[] array = {2,2,3,5,7,9,9,11,13,15,15,19,21};
        int duplicates = 0;
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] == (array[i - 1]))
            {
                array[i-1] = 0;
                duplicates++;
            }
        }
        System.out.println(duplicates + " duplicates found, array length without duplicates = " + (array.length - duplicates));
    }
}
