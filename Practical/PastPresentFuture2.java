import javax.swing.*;
import java.time.LocalDate;

public class PastPresentFuture2
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

        if (LocalDate.now().isAfter(LocalDate.of(year,month, day)))
        {
            JOptionPane.showMessageDialog(null, "This date is in the past.");
        }

        else if (LocalDate.now().isBefore(LocalDate.of(year, month, day)))
        {
            JOptionPane.showMessageDialog(null, "This date is in the future.");
        }

        else
        {
            JOptionPane.showMessageDialog(null, "This date is the current date.");
        }
    }
}
