package team.rpgterminal.game.nonplayables;

/**
 * Created by codecadet on 10/07/2017.
 */
public class Villager implements Destructible {

    public Villager() {

    }

    @Override
    public int hit(int attackPower) {
        return attackPower;
    }

    @Override
    public boolean isDestroyed() {
        return false;
    }
}
