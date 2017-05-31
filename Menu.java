import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Actor
{
    private TextBox titleBar;
    private TextBox menuItems;
    private MenuCommands menuCommands;
    private int fontSize = 24;
    private boolean visible = false;
    private Color mainFG;
    private Color mainBG;
    private Color secondFG;
    private Color secondBG;
    private int titleHeight;
    private int menuHeight;
    
    /**
     * This is the default constructor for objects of the Menu class.
     */
    public Menu()
    {
        this("not initialized", "none", 24, Color.BLACK, Color.lightGray, Color.BLACK, Color.WHITE, null);
    }
    
    /**
     * Constructor for objects of the Menu class.
     * 
     * @param String tb is the message that will be displayed in text in the titleBar object.
     * @param String items is the message that will be displayed in text in the menuItems object.
     * @param int fs is the variable that fontSize will be changed to.
     * @param Color fgMain is the Color variable that mainFG will be set to.
     * @param Color bgMain is the Color variable that mainBG will be set to.
     * @param Color fgSecond is the Color variable that secondFG will be set to.
     * @param Color bgSecond is the Color variable that secondBG will be set to.
     * @param MenuCommands mc is the variable that menuCommands will be set to.
     */
    public Menu(String tb, String items, int fs, Color fgMain, Color bgMain, Color fgSecond, Color bgSecond, MenuCommands mc)
    {
        fontSize = fs;
        mainFG = fgMain;
        mainBG = bgMain;
        secondFG = fgSecond;
        secondBG = bgSecond;
        menuCommands = mc;
        titleBar = new TextBox(tb, fontSize, true, mainFG, mainBG);
        menuItems = new TextBox(items, fontSize, true, secondFG, secondBG);
    }
    
    /**
     * addToWorld controls the creation and placement of the menu object, and
     * the related values
     * 
     * @param World w is a variable that defines which World the menu Object is
     * added to.
     * @return Nothing is returned.
     */
    public void addedToWorld(World w)
    {
        w.addObject(titleBar, getX(), getY());
        titleHeight = titleBar.getImage().getHeight();
        menuHeight = menuItems.getImage().getHeight();
    }
    
    /**
     * Act - do whatever the Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        handleMouse();
    }
    
    /**
     * handleMouse gets info about what the mouse input is doing to the menu objects,
     * and controls the adding and removing of the menu contents from the world
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void handleMouse()
    {
        UIMainWorld myWorld = (UIMainWorld)getWorld();
        MouseInfo mi;
        int menuIndex;
        
        if(Greenfoot.mouseClicked(titleBar))
        {
            if(visible == false)
            {
                myWorld.addObject(menuItems, getX(), getY() + (titleHeight + menuHeight)/2);
            }
            else if(visible == true)
            {
                myWorld.removeObject(menuItems);
            }
            
            visible = !(visible);
        }
        
        if(Greenfoot.mouseClicked(menuItems))
        {
            mi = Greenfoot.getMouseInfo();
            menuIndex = ((mi.getY() - menuItems.getY() + menuHeight/2) - 1)/fontSize;
            menuCommands.execute(menuIndex, getWorld());
            visible = !(visible);
            myWorld.removeObject(menuItems);
        }
    }
}
