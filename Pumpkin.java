import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pumpkin for bumble 
 * 
 * @Komal (your name) 
 * @May 2022 (a version number or a date)
 */
public class Pumpkin extends Actor
{
    int speed = 1;
    
    public void act()
    {
        // Pumpkin falls 
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        .scale(pumpkin.getWidth() - 100)
        //Get rid of apple when it's on the bottom and put "Game Over!" on screen
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
}
