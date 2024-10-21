import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionScreen extends World
{
    private World home;
    private String[] allText = { "Instruction 1", "Instruction 2", "Instruction 3" };
    private int currentIndex = 0;
    private Label instructionLabel = new Label(allText[currentIndex], 50);
    private Label instruction;
    private Label goBack;
    private Label goNext;
    private Label backMenuLabel;
    
    public InstructionScreen(World home)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        this.home = home;
        instruction = new Label("Navigate through the screens with the buttons", 20);
        addObject(instruction, 300, 100);
        
        addObject(instructionLabel, 300, 200);
        
        addObject(new Button(this::nextScreen), 500, 300);
        goNext = new Label("next", 20);
        addObject(goNext, 500, 265);
        
        addObject(new Button(this::prevScreen), 100, 300);
        goBack = new Label("back", 20);
        addObject(goBack, 100, 265);
        
        addObject(new Button(this::backMenu), 100, 370);
        backMenuLabel = new Label("Back to menu", 20);
        addObject(backMenuLabel, 100, 338);
    }
    
    private String getInstruction(int index)
    {
        return "Screen " + index;
    }

    private void nextScreen()
    {
        if (currentIndex < allText.length - 1) {
            currentIndex++;
            instructionLabel.setValue(allText[currentIndex]);
        }
    }
    
    private void prevScreen()
    {
        if(currentIndex == 0)
        {
            Greenfoot.setWorld(home);
            return;
        }
        else
        {
            currentIndex--;
            instructionLabel.setValue(allText[currentIndex]);
        }
    }
    
    private void backMenu()
    {
        Greenfoot.setWorld(home);
    }
}
