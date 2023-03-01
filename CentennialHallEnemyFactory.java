
/**
 * Write a description of class GameWorld here.
 * Sehaj Mundi
 * 3117464
 */
public class CentennialHallEnemyFactory implements EnemyFactory
{
    public PiranhaPlantSpecies createPiranhaPlant()
    {
        return new PoisonPiranhaPlant();
    }
    
    public GoombaSpecies createGoomba()
    {
        return new Gloomba();
    }
    
    public KoopaTroopaSpecies createKoopaTroopa()
    {
        return new DryBonesKoopa();
    }
}
