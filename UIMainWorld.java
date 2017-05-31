import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.util.List;
/**
 * A GUI that adds up sales of different coffee shop items
 * 
 * Author: Gade Ricard
 * Teacher: Mr.Hardman
 * Assignment: #7 Encapsulation, Inheritance, Polymorphism
 * Date Last Modified: May 31th
 */
public class UIMainWorld extends World
{
    private int backgroundImage;
    private boolean onSales;
    private SalesItem salesItems[];
    private int numItemsAdded;
    
    /**
     * Constructor for objects of class UIMainWorld.
     * 
     */
    public UIMainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        startScreen();
    }
    
    /**
     * startScreen creates the start screen containing the file menu
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void startScreen()
    {
        onSales = false;
        salesItems = new SalesItem[50];
        numItemsAdded = 0;
        
        Menu guiMenu = new Menu("File", "New Sales...\nClose\nExit", 20, Color.BLACK, Color.WHITE, Color.RED, Color.YELLOW, new FileCommands());
        clearScreen();
        addObject(guiMenu, 100, 20);
    }
    
    /**
     * salesScreen creates the sales screen which contains the buttons to control
     * the calculations
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void salesScreen()
    {
        onSales = true;
        Button timbitAdd = new Button(12, "button-blue.png", "button-green.png", "Add Timbit");
        Button doughnutAdd = new Button(12, "button-blue.png", "button-green.png", "Add Doughnut");
        Button coffeeAdd = new Button(12, "button-blue.png", "button-green.png", "Add Coffee");
        
        addObject(timbitAdd, 100, 90);
        addObject(doughnutAdd, 100, 180);
        addObject(coffeeAdd, 100, 270);
    }
    
    /**
     * thankYou creates the thank you screen which displays a message of thanks,
     * and stops the program
     */
    public void thankYou()
    {
        onSales = false;
        clearScreen();
        
        showText("Thank you for using our system!", getWidth()/2, getHeight()/2);
        Greenfoot.stop();
    }
    
    public void act() 
    {
        if(onSales == true)
        {
            calculateSale();
        }
    }
    
    /**
     * calculateSale calculates how many items are sold, and displays the amounts in
     * text on the screen
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void calculateSale()
    {
        double total = 0;
        int timbits = 0;
        int doughnuts = 0;
        int smalls = 0;
        int mediums = 0;
        int larges = 0;
        String list = "";
        for(int i = 0; salesItems[i] != null && i < salesItems.length; i++)
        {
            if(salesItems[i] instanceof Timbit)
            {
                timbits = timbits + salesItems[i].getNumOfItem();
            }
            else if(salesItems[i] instanceof Doughnut)
            {
                doughnuts = doughnuts + salesItems[i].getNumOfItem();
            }
            else
            {
                if(salesItems[i].getNumOfItem() == 1)
                {
                    smalls++;
                }
                else if(salesItems[i].getNumOfItem() == 2)
                {
                    mediums++;
                }
                else
                {
                    larges++;
                }
            }
            
            total = total + salesItems[i].getFinalPrice();
        }
        list = "Timbits: " + timbits + "\nDoughnuts: " + doughnuts + "\nSmall Coffees: " + smalls + "\nMedium Coffees: " + mediums + "\nLarge Coffees: " + larges;
        
        showText(list + String.format("\nTotal Price: $%5.2f", total), 400, 200);
    }
    
    /**
     * addItem is a setter that fills out the salesItems array with the correct
     * SalesItem object
     * 
     * @param SalesItem s is the variable that controls which SalesItem object is added to the 
     * salesItem array
     * @return Nothing is returned
     */
    public void addItem(SalesItem s)
    {
        salesItems[numItemsAdded] = s;
        numItemsAdded++;
    }
    
    /**
     * clearScreen removes all objects except the menu object from the world when called
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void clearScreen()
    {
        showText("", 400, 200);
        
        List objects = getObjects(null);
        if(objects != null)
        {
            removeObjects(objects);
        }
    }
}
