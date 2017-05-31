import javax.swing.*;
/**
 * Write a description of class Coffee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coffee extends SalesItem 
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Coffee
     */
    public Coffee()
    {
        final double SMALL_PRICE = 1.33;
        final double MEDIUM_PRICE = 1.59;
        final double LARGE_PRICE = 1.86;
        
        String size;
        
        size = JOptionPane.showInputDialog( null, "Enter the size of the Coffee: (Options are S, M, or L)" );
        
        if(size.equalsIgnoreCase("s") == true)
        {
            setNumber(1);
            setPrice(SMALL_PRICE);
        }
        else if(size.equalsIgnoreCase("m") == true)
        {
            setNumber(2);
            setPrice(MEDIUM_PRICE);
        }
        else if(size.equalsIgnoreCase("L") == true)
        {
            setNumber(3);
            setPrice(LARGE_PRICE);
        }
    }
}
