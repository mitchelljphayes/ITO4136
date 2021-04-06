import java.util.*;

public class LinkedListCombine
{
    public static int random(int min, int max)
    {
        return (int) (java.lang.Math.random() * (max - min + 1)) + min;
    }

    public static void populate(CustomSinglyLinkedList list, String[] words)
    {
        for (int i = 0; i < words.length; i++)
        {    
            list.addLast(words[i]);
        };
    }

    public static void joinLists(CustomSinglyLinkedList listOne, CustomSinglyLinkedList listTwo)
    {
        listOne.getTail().setNext(listTwo.getHead());
        listOne.resize();
    }

    public static void main (String Args[])
    {
        CustomSinglyLinkedList listOne = new CustomSinglyLinkedList();
        CustomSinglyLinkedList listTwo = new CustomSinglyLinkedList();

        Scanner sc = new Scanner(System.in);
        //populate linked lists
        System.out.println("Please enter the first list of words, seperated by spaces, between 0 and 5 words long:");
        String input = sc.nextLine();
        String[] words = input.split(" ");
        populate(listOne, words);
        System.out.println("Please enter the second list of words, seperated by spaces, between 0 and 5 words long:");
        input = sc.nextLine();
        words = input.split(" ");
        populate(listTwo, words);
        //join linked lists
        joinLists(listOne, listTwo);
        listOne.display();
        sc.close();
    }

}