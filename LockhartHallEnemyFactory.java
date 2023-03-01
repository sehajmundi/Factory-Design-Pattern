
/**
 * Write a description of class GameWorld here.
 * Sehaj Mundi
 * 3117464
 */
public class LockhartHallEnemyFactory implements EnemyFactory
{
    public PiranhaPlantSpecies createPiranhaPlant()
    {
        return new GiantPiranhaPlant();
    }
    
    public GoombaSpecies createGoomba()
    {
        return new Choomba();
    }
    
    public KoopaTroopaSpecies createKoopaTroopa()
    {
        return new SuperKoopa();
    }
}
