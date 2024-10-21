import greenfoot.*;

public class MenuScreen extends World 
{
    public MenuScreen() 
    {
        super(600, 400, 1);
        addObject(new Button(() -> Greenfoot.setWorld(new InstructionScreen(this))), 300, 340);
        
        AvatarManager avatarManager = new AvatarManager();
        addObject(avatarManager, 300, 100);
    }
    
    public void goInstructions() 
    {
        Greenfoot.setWorld(new InstructionScreen(this));
    }
}