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
    Pumpkin pumpkin = new Pumpkin();
    public void act()
    {
        // Pumpkin falls 
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        //Get rid of apple when it's on the bottom and put "Game Over!" on screen
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
            pumpkin.scale(pumpkin.getWidth() - 100, pumpkin.getHeight() - 100);
        }
    }
    
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
}
