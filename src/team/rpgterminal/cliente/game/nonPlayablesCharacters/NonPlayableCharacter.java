package team.rpgterminal.cliente.game.nonPlayablesCharacters;

import team.rpgterminal.cliente.game.Destructible;

/**
 * Created by codecadet on 10/07/2017.
 */
public class NonPlayableCharacter implements Destructible {
    @Override
    public int hit(int attackPower) {
        return 0;
    }

    public int hits() {
        return 0;
    }

    @Override
    public boolean isDestroyed() {
        return false;
    }
}
