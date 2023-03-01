
/**
 * Write a description of class GameWorld here.
 * Sehaj Mundi
 * 3117464
 */
import java.util.*;
public class GameLevel
{
    protected String name;
    protected String environment;
    protected ArrayList enemies = new ArrayList();
    
    public void createEnemies()
    {
        
    }
    
    public void renderEnemies()
    {
        System.out.println("Rendering enemies...");
    }
    
    public void spawnEnemies()
    {
        System.out.println("spawning enemies:");
        System.out.print(enemies.get(0)+", ");
        for(int i = 0; i < enemies.size()-1; i++)
        {
            System.out.print(enemies.get(i)+", ");
        }
        System.out.print(enemies.get(enemies.size()-1));
    }
    
    public void renderEnvironment()
    {
        System.out.println("Rendering enviornment: "+ getEnvironment());
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setEnvironment(String environment)
    {
        this.environment = environment;
    }
    
    public String getEnvironment()
    {
        return environment;
    }
    
    public String toString() {
        int count = 0;
        if(getName().equalsIgnoreCase("duckworth centre"))count = 1;
        else if(getName().equalsIgnoreCase("centennial hall"))count = 2;
        else if(getName().equalsIgnoreCase("lockhart hall"))count = 3;
        return "***Completed playing " + getName() +" level " + count + "***\n";
    }
}
