import greenfoot.*;

public class MenuScreen extends World 
{
    private Label instructionAvatar;
    private Label highScoreButtonLabel;
    private Label goNext;
    public MenuScreen() 
    {
        super(600, 400, 1);
        goNext = new Label("Instructions", 20);
        addObject(goNext, 300, 315);
        addObject(new Button(() -> goInstructions()), 300, 350);
        
        AvatarManager avatarManager = new AvatarManager();
        addObject(avatarManager, 300, 100);
        instructionAvatar = new Label("Click to change your avatar", 20);
        addObject(instructionAvatar, 300, 160);
        
        addObject(new Button(() -> goHighScores()), 300, 275);
        highScoreButtonLabel = new Label("View High Scores", 20);
        addObject(highScoreButtonLabel, 300, 240);
    }
    
    public void goInstructions() 
    {
        Greenfoot.setWorld(new InstructionScreen(this));
    }
    
    public void goHighScores() 
    {
        Greenfoot.setWorld(new HighScoreScreen(this));
    }
}