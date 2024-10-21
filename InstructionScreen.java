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
    private String[] allText = { "Instruction 1", "Instruction 2", "Intruction 3" };
    private int currentIndex = 0;
    private Label instructionLabel = new Label(allText[currentIndex], 50);
    private Label instruction;

    public InstructionScreen(World home)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        this.home = home;
        instruction = new Label("Navigate through the screens with the buttons", 20);
        addObject(instruction, 300, 100);
        
        addObject(instructionLabel, 300, 200);
        
        addObject(new Button(this::nextScreen), 500, 300);
        
        addObject(new Button(this::prevScreen), 100, 300);
        
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
}
