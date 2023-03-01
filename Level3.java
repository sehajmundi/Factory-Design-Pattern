
/**
 * Write a description of class GameWorld here.
 * Sehaj Mundi
 * 3117464
 */
import java.util.*;
public class Level3 extends GameLevel
{
    public void createEnemies()
    {
        setName("Lockhart Hall");
        setEnvironment("lecture halls, classrooms, mezzanine");
        Random rand = new Random();
        int species;
        for(int i = 0; i<12; i++)
        {
            species = rand.nextInt(3)+1;
            switch(species)
            {
                case 1:
                    enemies.add(new Goomba());
                    break;
                case 2: 
                    enemies.add(new Choomba());
                    break;
                case 3:
                    enemies.add(new Gloomba());
                    break;
            }
        }
        
        for(int i = 0; i<12; i++)
        {
            species = rand.nextInt(3)+1;
            switch(species)
            {
                case 1:
                    enemies.add(new PiranhaPlant());
                    break;
                case 2: 
                    enemies.add(new PoisonPiranhaPlant());
                    break;
                case 3:
                    enemies.add(new GiantPiranhaPlant());
                    break;
            }
        }
        
        for(int i = 0; i<12; i++)
        {
            species = rand.nextInt(3)+1;
            switch(species)
            {
                case 1:
                    enemies.add(new KoopaTroopa());
                    break;
                case 2: 
                    enemies.add(new DryBonesKoopa());
                    break;
                case 3:
                    enemies.add(new SuperKoopa());
                    break;
            }
        }
    }
}
