import greenfoot.*;
/**
 * Write a description of class FileCommands here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileCommands implements MenuCommands
{
    /**
     * Constructor for objects of class FileCommands
     */
    public FileCommands()
    {
    }

    /**
     * execute calls one of the methods in guiWorld in response to which menu item is 
     * clicked.
     * 
     * @param int idx is a variable that controls which method is called in guiWorld.
     * @param World w is a reference to the world that allows this program to run methods contained
     * in that World class
     */
    public void execute(int idx, World w)
    {
        UIMainWorld guiWorld = (UIMainWorld)w;
        if(idx == 0)
        {
            guiWorld.salesScreen();
        }
        else if(idx == 1)
        {
            guiWorld.startScreen();
        }
        else if(idx == 2)
        {
            guiWorld.thankYou();
        }
    }
}
