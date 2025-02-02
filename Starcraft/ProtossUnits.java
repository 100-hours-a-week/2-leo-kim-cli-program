package Starcraft;

public class ProtossUnits extends Unit{
    public int maxShield;
    public int shield;
    ProtossUnits(String name, String owner, int hpMax, int minerals, int gases, int population, int damage, int maxShield) {
        super(name, owner, hpMax, minerals, gases, population, damage);
        this.maxShield = maxShield;
        this.shield = maxShield;
    }

    void regenerateShield(){
        if(shield != maxShield)
            shield++;
    }
}
