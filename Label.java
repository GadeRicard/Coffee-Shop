import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
    private String value;
    private int fontSize;
    private Color lineColor = Color.BLACK;
    private Color fillColor = Color.WHITE;
    
    private final Color TRANSPARENT = new Color(0, 0, 0, 0);
    
    /**
     * constructor for objects of the Label class.
     * 
     * @param String value is the value that the value instance variable should be set to
     * @param int fontSize is the value that the fontSize instance variable should be set to.
     */
    public Label(String value, int fontSize)
    {
        this.value = value;
        this.fontSize = fontSize;
        updateImage();
    }
    
    /**
     * Constructor for objects of the Label class.
     * 
     * @param int value is the value that the value instance variable should be set to, while converted to
     * a string
     * @param int fontSize is the value that the fontSize instance variable should be set to.
     */
    public Label(int value, int fontSize)
    {
        this(Integer.toString(value), fontSize);
    }
    
    /**
     * Act - do whatever the Label wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    /**
     * setValue(String) is a setter method that changes the 'Label.value' variable to the parameter,
     * This is called if the 'value' parameter is not an integer.
     * 
     * @param String value is the variable the 'Label.value' variable should be changed to.
     * @return Nothing is returned
     */
    public void setValue(String value)
    {
        this.value = value;
        updateImage();
    }
    
    /**
     * setValue(int) is a setter method that changes the 'Label.value' variable to the parameter,
     * This is called if the 'value' parameter is an integer.
     * 
     * @param int value is the variable the 'Label.value' variable should be changed to.
     * @return Nothing is returned.
     */
    public void setValue(int value)
    {
        this.value = Integer.toString(value);
        updateImage();
    }
    
    /**
     * setLineColor is a setter method that changes the 'Label.lineColor' variable to the parameter.
     * 
     * @param Color lineColor is the variable that the 'Label.lineColor' variable should be changed to.
     * @return Nothing is returned.
     */
    public void setLineColor(Color lineColor)
    {
        this.lineColor = lineColor;
        updateImage();
    }
    
    /**
     * setFillColor is a setter method that changes the 'Label.fillColor' variable to the parameter.
     * 
     * @param Color fillColor is the variable that the 'Label.fillColor' variable should be changed to.
     * @return Nothing is returned.
     */
    public void setFillColor(Color fillColor)
    {
        this.fillColor = fillColor;
        updateImage();
    }
    
    /**
     * updateImage is called to refresh the current image to the newly modified image.
     * 
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    private void updateImage()
    {
        setImage(new GreenfootImage(value, fontSize, fillColor, TRANSPARENT, lineColor));
    }
}
