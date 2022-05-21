import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bumbleBee here.
 * Bumblebee go zoom 
 * 
 * @Komal (your name) 
 * @May 2022 (a version number or a date)
 */
public class BumbleBee extends Actor
{
    GreenfootSound bumbleSound = new GreenfootSound("sounds/greenFootCheers.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[5];
    GreenfootImage[] idleLeft = new GreenfootImage[5];
    
    //Direction the bee is facing
    String facing = "right";
    private SimpleTimer animationTimer = new SimpleTimer();
    /**
     * Contructor --> code runs once when object is created
     */
    public BumbleBee()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/BumbleBee/BumbleBee0" + i + ".png");
            idleRight[i].scale(150, 100);
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/BumbleBee.png" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(150, 100);
        }
        
        animationTimer.mark();
        
        //Initial bee image
        setImage(idleRight[0]);
    }
    
    /**
     * Animate the bee looking up and down
     */
    int imageIndex = 0;
    public void animateBee()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
            facing = "right";
        }
        
        //remove the pumpkin if bumble eats it
        eat();
        
        //Animate bee by callinng on animateBee method
        animateBee();
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
