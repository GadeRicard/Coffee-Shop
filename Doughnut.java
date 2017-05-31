import javax.swing.*;
/**
 * Write a description of class Doughnut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Doughnut extends SalesItem 
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Doughnut
     */
    public Doughnut()
    {
        final double DOUGHNUT_PRICE = 0.99;
        final int BOX_CAPACITY = 6;
        final double BOX_PRICE = 5.00;
        
        int numDoughnuts;
        int numBoxes;
        
        numDoughnuts = Integer.parseInt( JOptionPane.showInputDialog( null, "Enter the number of Doughnuts:" ) );
        setNumber(numDoughnuts);
        numBoxes = numDoughnuts / BOX_CAPACITY;
        numDoughnuts = numDoughnuts % BOX_CAPACITY;
        setPrice(numDoughnuts * DOUGHNUT_PRICE + numBoxes * BOX_PRICE);
    }

}
