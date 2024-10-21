import greenfoot.*;

public class AvatarManager extends Actor {
    private Queue<Avatar> avatars = new Queue<>();
    private Avatar current;
    public AvatarManager() 
    {
        setImage((GreenfootImage) null);
        avatars.enqueue(new Avatar("images/Avatar_1.png"));
        avatars.enqueue(new Avatar("images/Avatar_2.png"));
        avatars.enqueue(new Avatar("images/Avatar_3.png"));
        current = avatars.dequeue();
    }
    
    protected void addedToWorld(World world) {
        world.addObject(new Button(() -> nextAvatar()), world.getWidth() / 2, world.getHeight() / 2);
        updateDisplay();
    }
    
    public void nextAvatar() 
    {
        avatars.enqueue(current);
        getWorld().removeObject(current);
        current = avatars.dequeue();
        updateDisplay();
    }
    
    private void updateDisplay() 
    {
        World world = getWorld();
        if(current != null)
        {
            world.removeObject(current);
        }
        world.addObject(current, 300, 100);
    }
}