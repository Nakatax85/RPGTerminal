package team.rpgterminal.cliente.game.nonPlayablesCharacters.villager;

import team.rpgterminal.cliente.game.Destructible;

/**
 * Created by codecadet on 10/07/2017.
 */
public class SpecialVillager extends Villager implements Destructible {

    private int reflectedAttackPower;

    public SpecialVillager() {
        super();
    }

    public void giveMission(){


    }




    @Override
    public int causeDamage() {
        return hit(reflectedAttackPower);
    }

    @Override
    public int hit(int attackPower) {
        return super.hit(attackPower);
    }
}
