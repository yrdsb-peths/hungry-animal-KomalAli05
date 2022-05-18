import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bumbleBee here.
 * Bumblebee go zoom 
 * 
 * @Komal (your name) 
 * @May 2022 (a version number or a date)
 */
public class bumbleBee extends Actor
{
    GreenfootSound bumbleSound = new GreenfootSound("cheers -Greenfoot.mp3");
    
    /**
     * Act - do whatever the bumbleBee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        
        //remove the pumpkin if bumble eats it
        eat();
    }
    /**
     * eat pumpkin and new one spawns once pumpkin is eaten
     */
    public void eat()
    {
        if(isTouching(Pumpkin.class))
        {
            removeTouching(Pumpkin.class);
            MyWorld world = (MyWorld) getWorld();
            world.createPumpkin();
            world.increaseScore();
            
            bumbleSound.play();
        }
    }
}
