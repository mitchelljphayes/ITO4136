import utils.*;
//import lib.*;

public class ProductString {

    public static void main(String[] args)
    {
        Input in = new Input();
        String numOne = new String(in.acceptStringInput("Please enter the first number between 0 and 100"));
        String numTwo = new String(in.acceptStringInput("Please enter the second number between 0 and 100"));

        int a1 = Character.getNumericValue(numOne.charAt(0));
        int a2;
        try
        {
            a2 = Character.getNumericValue(numOne.charAt(1));
        }
        catch (IndexOutOfBoundsException e) 
        {
            a2 = a1;
            a1 = 0;
        }
        int b1 = Character.getNumericValue(numTwo.charAt(0));
        int b2;
        try
        {
            b2 = Character.getNumericValue(numTwo.charAt(1));
        }
        catch (IndexOutOfBoundsException e) 
        {
            b2 = b1;
            b1 = 0;
        }
        
        int lineOne = a2 * b2;
        int lineTwo = a1 * b2 * 10;
        int lineThree = a2 * b1 * 10;
        int lineFour = a1 * b1 * 100; 
        int total = lineOne + lineTwo + lineThree + lineFour;
        
        System.out.println(total);

    }

}
