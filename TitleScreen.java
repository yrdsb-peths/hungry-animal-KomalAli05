import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * First thing people see when they boot up greenfoot
 * 
 * @Komal (your name) 
 * @May 2022 (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titlePage = new Label("Welcome to the Hungry Bumblebee game!", 35);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titlePage, getWidth()/2, getHeight()/2);
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
        Label label = new Label("Hit enter to start!", 40);
        addObject(label,293,187);
        label.setLocation(376,156);
        label.setLocation(394,159);
        Label label2 = new Label("Use left and right arrow keys to play :)", 25);
        addObject(label2,300,228);
        label2.setLocation(324,230);
        label.setLocation(299,183);
        label2.setLocation(305,128);
        bumbleBee.setLocation(367,281);
        bumbleBee.setLocation(321,357);
        label.setLocation(319,207);
        bumbleBee.setLocation(316,309);
        label2.setLocation(325,159);
    }
}


