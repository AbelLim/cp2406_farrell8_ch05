import javax.swing.*;

public class EvenOdd
{
    public static void main(String args[]) {
        int input;
        String inputString;
        String outputString;

        inputString = JOptionPane.showInputDialog(null,"Please enter an integer.");
        input = Integer.parseInt(inputString);
        if(input%2 == 0)
        {
            outputString = "The integer is even.";
        }

        else
        {
            outputString = "The integer is odd.";
        }

        JOptionPane.showMessageDialog(null, outputString);
    }
}
