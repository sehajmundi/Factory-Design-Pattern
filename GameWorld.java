
/**
 * Write a description of class GameWorld here.
 * Sehaj Mundi
 * 3117464
 */
public abstract class GameWorld
{
    abstract GameLevel createLevel(int levelValue);
    
    public GameLevel playLevel(int level)
    {
        GameLevel gameLevel = createLevel(level);
        gameLevel.createEnemies();
        System.out.println("***Setting up " + gameLevel.getName() + " " + level + "***");
        gameLevel.renderEnvironment();
        gameLevel.renderEnemies();
        gameLevel.spawnEnemies();
        System.out.println();
        return gameLevel;
    }
}
