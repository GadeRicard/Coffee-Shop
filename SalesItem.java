/**
 * Write a description of class SalesItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SalesItem  
{
    // instance variables - replace the example below with your own
    private double salesPrice;
    private int numOfItem;
    
    /**
     * This is the default contructor for objects of the SalesItem class.
     */
    public SalesItem()
    {
        salesPrice = 0;
        numOfItem = 0;
    }
    
    /**
     * Constructor for objects of the SalesItem class.
     * 
     * @param double sp is the variable that salesPrice should be set to.
     */
    public SalesItem(Double sp)
    {
        salesPrice = sp;
        numOfItem = 1;
    }
    
    /**
     * getNumOfItem is a getter method that returns the variable numOfItem 
     * when called.
     * 
     * @param There are no parameters
     * @return returns the variable numOfItem.
     */
    public int getNumOfItem()
    {
        return numOfItem;
    }
    
    /**
     * getFinalPrice is a getter that returns the final sales price
     * 
     * @param There are no parameters
     * @return Returns the salesPrice variable multiplied by 1.13
     */
    public double getFinalPrice()
    {
        return (salesPrice * 1.13);
    }
    
    /**
     * setPrice is a protected setter that sets salesPrice to the parameter when called
     * 
     * @param double P is the variable that salesPrice should be set to.
     * @return Nothing is returned
     */
    protected void setPrice(double p)
    {
        salesPrice = p;
    }
    
    /**
     * setNumber is a protected setter that sets numOfItem to the parameter when called.
     * 
     * @param int n is the variable that numOfItem should be set to.
     * @return Nothing is returned.
     */
    protected void setNumber(int n)
    {
        numOfItem = n;
    }
}
