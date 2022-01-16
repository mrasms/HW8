package kg.geektech.game.players;

public class Intern extends Hero {
    private int healPoints;


    public Intern(int health, int damage, int healPoints, Names name) {
        super(health, damage, SuperAbility.HEAL, Names.INTERN );
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
