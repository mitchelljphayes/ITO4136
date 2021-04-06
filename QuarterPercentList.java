import java.util.Random;

public class QuarterPercentList {
    
    public static void populate(CustomSinglyLinkedList list, String[] words)
    {
        for (int i = 0; i < words.length; i++)
        {    
            list.addLast(words[i]);
            //System.out.println(words[i]);
        };
    }
    public static void main (String Args[])
    {
        CustomSinglyLinkedList randomList = new CustomSinglyLinkedList();
        
        Random random = new Random();
        int listLength = (random.nextInt(20) + 10);

        StringGenerator sg = new StringGenerator();
        String[] words = sg.wordList(listLength);
        
        populate(randomList, words);
        int size = randomList.getSize();
        //System.out.println(size);
        int index = size / 4;
        String indexWord = randomList.findIndexNode(index).getData();
        System.out.println(indexWord);
    }

}
