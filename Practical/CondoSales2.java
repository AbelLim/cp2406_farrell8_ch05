import javax.swing.*;

public class CondoSales2
{
    public static void main(String args[])
    {
        int input;
        int price;
        String inputString;
        String viewString;
        String garageString;
        boolean isValid;
        inputString = JOptionPane.showInputDialog(null, "Choose one of the following options:\n1 - Park view\n2 - Golf course view\n3 - Lake view");
        input = Integer.parseInt(inputString);
        switch (input)
        {
            case 1: viewString = "park view";
            price = 15000;
            isValid = true;
            break;
            case 2: viewString = "golf course view";
            price = 170000;
            isValid = true;
            break;
            case 3: viewString = "lake view";
            price = 210000;
            isValid = true;
            break;
            default: viewString = ":invalid code:";
            price = 0;
            isValid = false;
        }

        if(isValid) {
            inputString = JOptionPane.showInputDialog(null, "Choose one of the following options:\n1 - Garage\n2 - Parking space");
            input = Integer.parseInt(inputString);
            switch (input)
            {
                case 1: garageString = "with a garage";
                price += 5000;
                break;
                case 2: garageString = "with a parking space";
                break;
                default: garageString = "no garage";
                break;
            }

            JOptionPane.showMessageDialog(null, "The price for a condo with a " + viewString + " and " + garageString + " is $" + price);
        }

        else
            JOptionPane.showMessageDialog(null, "The price for a condo with a " + viewString + " is $" + price);
    }
}
