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
        updateDisplay();
    }
    
    public void nextAvatar() 
    {
        avatars.enqueue(current); 
        current = avatars.dequeue();
        updateDisplay();
    }
    
    private void updateDisplay() 
    {
        // Update the Actor's image with the current avatar's image.
        setImage(current.getImage());
    }
}