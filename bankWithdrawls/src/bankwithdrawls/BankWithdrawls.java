/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankwithdrawls;
import java.util.Scanner;
/**
 *
 * @author t7047098
 */
public class BankWithdrawls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double balance = 40.0;
        String overDraft = "", charge = " ";
        System.out.print("Please Enter the amout you wish to withdraw: ");
        int withdrawl = keyboard.nextInt();
        balance -= withdrawl;
        if (balance - withdrawl < 0 )
        {
            overDraft = " (Using OverDraft) ";
            if (balance < -50)
            {
                charge = " Charge: 5 ";
                balance -= 5;
            }
        }
        System.out.println("Withdraw: "+ withdrawl + overDraft + charge + "New Balance: " + balance);      
    }
    
}
