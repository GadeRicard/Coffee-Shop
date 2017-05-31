import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuCommands here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface MenuCommands
{
    /**
     * execute is in place to allow FileCommands class to interface with MenuCommands class
     * 
     * @param int idx is a variable that controls which message is called in the Greenfoot
     * console.
     * @param World w is a reference to the world that allows this program to run methods 
     * contained in that World class.
     */
    public void execute(int idx, World w);
}
