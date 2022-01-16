package kg.geektech.game.players;

import static kg.geektech.game.players.Names.INTERN;

public class Medic extends Hero {
    private int healPoints;

    public Medic (int health, int damage, int healPoints, Names name) {
        super(health, damage, SuperAbility.HEAL, Names.DOCTOR );
        this.healPoints = healPoints;
    }


    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && heroes[i] != this) {
                heroes[i].setHealth(heroes[i].getHealth() + this.healPoints);
            }
        }
    }
}
