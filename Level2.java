
/**
 * Write a description of class GameWorld here.
 * Sehaj Mundi
 * 3117464
 */
public class Level2 extends GameLevel
{
    public void createEnemies()
    {
        setName("Centennial Hall");
        setEnvironment("classrooms, cafeteria, security, escalators");
        for(int i = 0; i<7; i++)
        {
            enemies.add(new Gloomba());
        }
        
        for(int i = 0; i<8; i++)
        {
            enemies.add(new PoisonPiranhaPlant());
        }
        
        for(int i = 0; i<15; i++)
        {
            enemies.add(new DryBonesKoopa());
        }
    }
}
