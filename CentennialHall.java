
/**
 * Write a description of class GameWorld here.
 * Sehaj Mundi
 * 3117464
 */
public class CentennialHall extends GameWorld
{
    GameLevel createLevel(int levelValue)
    { 
        if(levelValue == 1)
        {
            return new Level1();
        }
        else if(levelValue == 2)
        {
            return new Level2();
        }
        else if(levelValue == 3)
        {
            return new Level3();
        }
        else
        {
            return null;
        }
    }
}
