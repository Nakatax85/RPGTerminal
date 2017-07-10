package team.rpgterminal.game.nonplayables;

/**
 * Created by codecadet on 10/07/2017.
 */
public class NonPlayableCharacter implements Destructible{
    @Override
    public int hits() {
        return 0;
    }

    @Override
    public boolean isDestroyed() {
        return false;
    }
}
