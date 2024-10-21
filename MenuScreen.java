import greenfoot.*;

public class MenuScreen extends World 
{
    private Label instruction;
    public MenuScreen() 
    {
        super(600, 400, 1);
        addObject(new Button(() -> Greenfoot.setWorld(new InstructionScreen(this))), 300, 340);
        
        AvatarManager avatarManager = new AvatarManager();
        instruction = new Label("Click to change your avatar", 20);
        addObject(instruction, 300, 160);
        addObject(avatarManager, 300, 100);
    }
    
    public void goInstructions() 
    {
        Greenfoot.setWorld(new InstructionScreen(this));
    }
}