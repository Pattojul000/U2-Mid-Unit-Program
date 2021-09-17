/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

(Hourly rate * Hours Worked) + (Total Sales * Sales Commission) = Total Earnings
The Total Earnings: $1184.38

 */


import javax.swing.*;
import java.text.DecimalFormat;

/* Get inputs
       Calculate Total Pay; Hourly rate * Hours Worked
       Calculate Total Sale; Sales Commission * Total Sales
       Display Results - 2 decimals
     */
public class SalesCommission {

    public static void main(String[] args) {

        double hours = getInput("How many hours did you work?(Between 30 and 40 hours)");
        double wage = getInput("How much are you paid an hour?(Between $5.00 and $8.00)");
        double salesCom = getInput("What was your sales commission?");
        double totalSales = getInput("What was your total sales?");


        double totalEarnings = totalPay(hours, wage, salesCom, totalSales);

        outputResults(totalEarnings);

        System.exit(0);
    }

    public static double getInput(String message){
        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }


    public static double totalPay(double hours, double wage, double salesCom, double totalSales){
        salesCom = salesCom * .01;

        return (salesCom * totalSales) + (hours * wage);



    }
    public static void outputResults(double totalEarnings){
        DecimalFormat round = new DecimalFormat("#,###.##");


       JOptionPane.showMessageDialog(null, "The Total Earnings is: " + round.format(totalEarnings));
    }

}
