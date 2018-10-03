/*
 * Anton dela Cruz
 * Shopping!.java
 * This program calculates the total price of the purchases
 */

package shopping;
import java.util.Scanner;
/**
 *
 * @author andel7651
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        double USB,Kb,CM,total;
        double USBp = 19.99;
        double Kbp = 49.99;
        double CMp = 25.99;
        
        System.out.println("Enter how many USB storage devices you want");
        USB = keyedInput.nextInt();
        System.out.println("Enter how many keyboards you want");
        Kb = keyedInput.nextInt();
        System.out.println("Enter how many computer mice you want");
        CM = keyedInput.nextInt(); 
        total = (USB + Kb + CM) * 1.13;
        
        System.out.println("Your order costs " + total + " dollars");
    }
    
}
