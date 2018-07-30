import javax.swing.*;
import java.time.*;
public class PastPresentFuture
{
    public static void main(String args[])
    {
        int month;
        int day;
        int year;
        String inputString;

        inputString = JOptionPane.showInputDialog(null, "Please enter the month (1 - 12)");
        month = Integer.parseInt(inputString);
        inputString = JOptionPane.showInputDialog(null, "Please enter the day (1-31)");
        day = Integer.parseInt(inputString);
        inputString = JOptionPane.showInputDialog(null, "Please enter the year (4-digit)");
        year = Integer.parseInt(inputString);

        if(year!=LocalDate.now().getYear())
        {
            JOptionPane.showMessageDialog(null, "The date is not this year.");
        }

        else if(month<LocalDate.now().getMonthValue())
        {
            JOptionPane.showMessageDialog(null, "The date is an earlier month this year.");
        }

        else if(month>LocalDate.now().getMonthValue())
        {
            JOptionPane.showMessageDialog(null, "This date is a later month this year.");
        }

        else
        {
            JOptionPane.showMessageDialog(null, "This date is this month.");
        }
    }
}
