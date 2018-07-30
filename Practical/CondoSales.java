import javax.swing.*;

public class CondoSales
{
    public static void main(String args[])
    {
        int input;
        int viewPrice;
        String inputString;
        String viewString;
        inputString = JOptionPane.showInputDialog(null, "Choose one of the following options:\n1 - Park view\n2 - Golf course view\n3 - Lake view");
        input = Integer.parseInt(inputString);
        switch (input)
        {
            case 1: viewString = "park view";
            viewPrice = 15000;
            break;
            case 2: viewString = "golf course view";
            viewPrice = 170000;
            break;
            case 3: viewString = "lake view";
            viewPrice = 210000;
            break;
            default: viewString = ":invalid code:";
            viewPrice = 0;
        }
        JOptionPane.showMessageDialog(null, "The price for a condo with a " + viewString + " is $" + viewPrice);
    }
}
