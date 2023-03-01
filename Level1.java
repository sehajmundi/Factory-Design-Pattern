
/**
 * Write a description of class GameWorld here.
 * Sehaj Mundi
 * 3117464
 */
public class Level1 extends GameLevel
{
    public void createEnemies()
    {
        setName("Duckworth Centre");
        setEnvironment("classrooms, labs, fitness facility, gym");
        for(int i = 0; i<7; i++)
        {
            enemies.add(new PiranhaPlant());
        }
        
        for(int i = 0; i<7; i++)
        {
            enemies.add(new KoopaTroopa());
        }
        
        for(int i = 0; i<7; i++)
        {
            enemies.add(new Goomba());
        }
    }
}
