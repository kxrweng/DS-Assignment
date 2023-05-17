import javax.swing.*;

public class TrialDialogBoxForNotis {
    public static void main (String [] args){
        //JOptionPane.showMessageDialog(null,"Your order ticket is successfully processed!","Bought Order Ticket Success",JOptionPane.PLAIN_MESSAGE);
       //JOptionPane.showMessageDialog(null,"Your order ticket is not processed.","Cancelled Order Ticket,JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Are you sure you want to continue with this transaction?","Confirmation of Order Ticket",JOptionPane.QUESTION_MESSAGE);
       // JOptionPane.showMessageDialog(null,"Your account has been hacked! ","Compromised User Account",JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Your buy order ticket failed to be processed.","Failed Buy Order Ticket",JOptionPane.ERROR_MESSAGE);



        String ticket = JOptionPane.showInputDialog("Enter the stock ticket");
        String shares = JOptionPane.showInputDialog("Enter the amount of shares you wish to buy");
        int share =Integer.parseInt(shares);

        int answer = JOptionPane.showConfirmDialog(null,"Are you sure you want to continue with this order ticket?", "Confirmation of Order Ticket", JOptionPane.YES_NO_OPTION);
        if (answer == 1)
            JOptionPane.showMessageDialog(null,"Your order ticket is not processed.","Cancelled Order Ticket",JOptionPane.INFORMATION_MESSAGE);

        else if (answer == 0)
            JOptionPane.showMessageDialog(null,"Your order ticket is successfully processed!","Bought Order Ticket Success",JOptionPane.PLAIN_MESSAGE);

    }
}
