import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private int fontSize;
    private String firstImage;
    private String secondImage;
    private GreenfootImage text1;
    private GreenfootImage text2;
    private String text;
    
    /**
     * Constructor for objects of the Button class.
     * 
     * @param int fs is the variable that fontSize should be set to.
     * @param String f is the variable that firstImage should be set to.
     * @param String s is the variable that secondImage should be set to.
     * @param String t is the variable that text should be set to.
     */
    public Button(int fs, String f, String s, String t)
    {
        fontSize = fs;
        firstImage = f;
        secondImage = s;
        text = t;
        
        text1 = new GreenfootImage(t, fontSize, Color.WHITE, new Color(0, 0, 0, 0));
        text2 = new GreenfootImage(t, fontSize, Color.BLACK, new Color(0, 0, 0, 0));
        setImage(firstImage);
        
        getImage().drawImage(text1, (getImage().getWidth() - text1.getWidth())/2, (getImage().getHeight() - text1.getHeight())/2);
    }
    
    /**
     * Constructor for objects of the Button class.
     * 
     * @param String f is the variable that firstImage should be set to.
     * @param String s is the variable that secondImage should be set to.
     */
    public Button(String f, String s)
    {
        firstImage = f;
        secondImage = s;
        
        setImage(firstImage);
    }
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        handleMouseClicks();
    }
    
    /**
     * handleMouseClicks checks if the Button object is pressed or clicked on by the mouse,
     * and updates the buttons image accordingly. Also calls the clickedAction method.
     * 
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    private void handleMouseClicks()
    {
        
        
        if(Greenfoot.mousePressed(this))
        {
            setImage(secondImage);
            getImage().drawImage(text2, (getImage().getWidth() - text1.getWidth())/2, (getImage().getHeight() - text1.getHeight())/2);
        }
        else if(Greenfoot.mouseClicked(this))
        {
            setImage(firstImage);
            getImage().drawImage(text1, (getImage().getWidth() - text1.getWidth())/2, (getImage().getHeight() - text1.getHeight())/2);
            
            clickedAction();
        }
    }
    
    /**
     * clickedAction is called when the mouse is clicked on the Button object,
     * and checks which button was clicked, calling the addItem method with the correct
     * SalesItem object as the parameter
     * 
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    private void clickedAction()
    {
        UIMainWorld world = (UIMainWorld)getWorld();
        
        if(text.equalsIgnoreCase("Add Timbit"))
        {
            world.addItem(new Timbit());
        }
        else if(text.equalsIgnoreCase("Add Doughnut"))
        {
            world.addItem(new Doughnut());
        }
        else if(text.equalsIgnoreCase("Add Coffee"))
        {
            world.addItem(new Coffee());
        }
    }
}
