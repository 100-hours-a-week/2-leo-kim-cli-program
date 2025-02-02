package Starcraft;

public class ZergUnits extends Unit{
    ZergUnits(String name, String owner, int hpMax, int minerals, int gases, int population, int damage) {
        super(name, owner, hpMax, minerals, gases, population, damage);
    }

    void regenerateHp(){
        if(hp != hpMax)
            hp++;
    }
}
