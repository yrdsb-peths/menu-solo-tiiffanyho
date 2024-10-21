import greenfoot.*; 
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HighScoreScreen extends World
{
    private Map<String, Integer> highScores;
    private World previousScreen;
    
    public HighScoreScreen(World previousScreen)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        this.previousScreen = previousScreen;

        highScores = new HashMap<>();
        highScores.put("Gloriana", 1200);
        highScores.put("Tiffany", 950);
        highScores.put("Natalie", 800);
        displayHighScores();
        backButton();
    }

    private void backButton()
    {
        addObject(new Button(() -> back()), 500, 350);
        Label backButtonLabel = new Label("Back to menu", 20);
        addObject(backButtonLabel, 500, 320);
    }
    
    private void displayHighScores()
    {
        int y = 150; 
        List<Map.Entry<String, Integer>> sortedScores = new ArrayList<>(highScores.entrySet());
        sortedScores.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        int ranking = 1;
        for (Map.Entry<String, Integer> entry : sortedScores) {
            String name = entry.getKey();
            Integer score = entry.getValue();
            Label scoreLabel = new Label(ranking + ". " + name + ": " + score, 30);
            addObject(scoreLabel, getWidth() / 2, y);
            y += 50;
            ranking++;
        }
    }
    
    private void back() {
        // Set the world back to the previous screen.
        Greenfoot.setWorld(previousScreen);
    }
}
