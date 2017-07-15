package team.rpgterminal.cliente.game.nonPlayablesCharacters;

import team.rpgterminal.cliente.game.Destructible;

/**
 * Created by codecadet on 10/07/2017.
 */
public class NonPlayableCharacter implements Destructible {

    public int hits() {
        return 0;
    }

    @Override
    public void takeHit(int attackPower) {}

    @Override
    public boolean isDestroyed() {
        return false;
    }
}
