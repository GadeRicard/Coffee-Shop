import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class TextBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextBox extends Actor
{
    private GreenfootImage img;
    private boolean border = false;
    private int fontSize;
    private Color foreground;
    private Color background;
    
    /**
     * Constructor for objects of the TextBox class.
     * 
     * @param String message is what should be displayed as text in the TextBox.
     * @param int fs is the value that fontSize should be changed to
     * @param boolean b is the variable that border should be set to.
     * @param Color fg is the Color variable that foreground should be set to.
     * @param Color bg is the Color variable that background should be set to.
     */
    public TextBox(String message, int fs, boolean b, Color fg, Color bg)
    {
        fontSize = fs;
        border = b;
        foreground = fg;
        background = bg;
        img = new GreenfootImage(message, fontSize, foreground, background);
        display();
    }
    
    /**
     * Act - do whatever the TextBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    /**
     * setText controls the text contents that will be added to the TextBox object
     * 
     * @param String message is a variable that contains the specific message
     * to be added.
     * @return Nothing is returned.
     */
    public void setText(String message)
    {
        img = new GreenfootImage(message, fontSize, foreground, background);
        display();
    }
    
    /**
     * display controls the creation of the TextBox object's image to be displayed
     * 
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    private void display()
    {
        this.setImage(img);
        if(border == true)
        {
            img.setColor(Color.BLACK);
            img.drawRect(0, 0, img.getWidth() - 1, img.getHeight() - 1);
            this.setImage(img);
        }
    }
}
