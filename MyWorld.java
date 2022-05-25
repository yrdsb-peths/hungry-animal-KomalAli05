import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int startScore = 0;
    Label score; 
    int level = 1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 

        //create bumble object
        BumbleBee bumble = new BumbleBee();
        addObject(bumble, 300, 300);

        //create label to keep track of amnt of pumpkins eaten
        score = new Label(0, 100);
        addObject(score, 50, 50);
        createPumpkin();
    }

    /**
     * Finish the game and put up "Game Over" on screen when
     * pumpkin touches ground
     */
    public void gameOver()
    {
        Label gameOver = new Label("Game Over :(", 100);
        addObject(gameOver, 300, 200);
    }

    /**
     * increase score when pumpkin eaten 
     */
    public void increaseScore()
    {
        startScore++;
        score.setValue(startScore);
        
        if(startScore % 3 == 0)
        {
            level += 1;
        }
    }

    /**
     *creates a new pumpkin at top of screen after bumble eats
     */
    public void createPumpkin()
    {
        Pumpkin pumpkin = new Pumpkin();
        pumpkin.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0; //this means a random (x,y) coordinate
        addObject(pumpkin, x, y);
    }
}
