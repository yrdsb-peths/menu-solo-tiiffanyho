import greenfoot.*; 
import java.util.HashMap;
import java.util.Map;

public class HighScoreScreen extends World
{
    private Map<String, Integer> highScores;
    
    public HighScoreScreen(World home)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        highScores = new HashMap<>();
        highScores.put("Gloriana", 1200);
        highScores.put("Tiffany", 950);
        highScores.put("Natalie", 800);
        displayHighScores();
    }
    
    private void displayHighScores()
    {
        int y = 150; 
        for (Map.Entry<String, Integer> entry : highScores.entrySet()) {
            String name = entry.getKey();
            Integer score = entry.getValue();
            Label scoreLabel = new Label(name + ": " + score, 30);
            addObject(scoreLabel, getWidth() / 2, y);
            y += 50;
        }
    }
}
