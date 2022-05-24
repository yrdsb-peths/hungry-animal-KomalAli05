import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * First thing people see when they boot up greenfoot
 * 
 * @Komal (your name) 
 * @May 2022 (a version number or a date)
 */
public class TitleScreen extends World
{
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        
        prepare();
    }

    /**
     * This is the main world's loop 
     */

    public void act()
    {
        //Boots the game up once the player hits "enter"
        if(Greenfoot.isKeyDown("enter"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BumbleBee bumbleBee = new BumbleBee();
        addObject(bumbleBee,306,317);
        
        Label label = new Label("Welcome to the Hungry Bumblebee game!", 37);
        addObject(label,291,41);
        label.setLocation(302,51);
        
        Label label2 = new Label("Hit enter to start!", 33);
        addObject(label2,294,165);
        label2.setLocation(303,134);
        
        Label label3 = new Label("Use left and right arrow keys to play :)", 30);
        addObject(label3,303,209);
        label3.setLocation(309,206);
    }
}


