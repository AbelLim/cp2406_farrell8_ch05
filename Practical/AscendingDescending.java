import javax.swing.*;
import java.util.Arrays;
public class AscendingDescending
{
    public static void main(String args[])
    {
        int[] numbers = new int[3];
        String inputString;
        inputString = JOptionPane.showInputDialog("Please enter the first integer.");
        numbers[0] = Integer.parseInt(inputString);
        inputString = JOptionPane.showInputDialog("Please enter the second integer.");
        numbers[1] = Integer.parseInt(inputString);
        inputString = JOptionPane.showInputDialog("Please enter the third integer.");
        numbers[2] = Integer.parseInt(inputString);
        Arrays.sort(numbers);
        JOptionPane.showMessageDialog(null, "The integers in ascending order are " + output(numbers));
        JOptionPane.showMessageDialog(null, "The integers in ascending order are " + output(reversedArray(numbers)));
    }

    public static String output(int[] numbers)
    {
        String output = "";
        for(int i = 0; i < numbers.length; i++)
        {
            output += numbers[i] + " ";
        }
        return output;
    }

    public static int[] reversedArray(int[] array)
    {
        for(int i = 0; i < array.length/2;i++)
        {
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }

        return array;
    }
}
