import javax.swing.*;

public class CellPhoneService
{
    public static void main(String args[])
    {
        int talkMinutes;
        int textMessages;
        int dataGB;
        int planPrice;
        String planString;
        String inputString;

        inputString = JOptionPane.showInputDialog(null, "Please enter your maximum talk time (in minutes)");
        talkMinutes = Integer.parseInt(inputString);
        inputString = JOptionPane.showInputDialog(null, "Please enter your maximum number of text messages");
        textMessages = Integer.parseInt(inputString);
        inputString = JOptionPane.showInputDialog(null, "Please enter your maximum data usage (in Gigabytes)");
        dataGB = Integer.parseInt(inputString);


        if(talkMinutes<500 && textMessages==0 && dataGB==0)
        {
            planString = "plan A";
            planPrice = 49;
        }
        else if(talkMinutes<500 && textMessages>0 && dataGB==0)
        {
            planString = "plan B";
            planPrice = 55;
        }

        else if(talkMinutes>=500 && textMessages<100 && dataGB==0)
        {
            planString = "plan C";
            planPrice = 61;
        }

        else if(textMessages>=100 && dataGB==0)
        {
            planString = "plan D";
            planPrice = 70;
        }

        else if (dataGB<2)
        {
            planString = "plan E";
            planPrice = 79;
        }

        else
        {
            planString = "plan F";
            planPrice = 87;
        }

        JOptionPane.showMessageDialog(null, "You should sign up for " + planString + " for $" + planPrice);
    }
}
