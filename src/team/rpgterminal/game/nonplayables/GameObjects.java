package team.rpgterminal.game.nonplayables;

/**
 * Created by codecadet on 10/07/2017.
 */
public class GameObjects implements Destructible{



    @Override
    public int hit(int attackPower) {
        return 0;
    }

    @Override
    public boolean isDestroyed() {
        return false;
    }

    public void postAlert(String message){

    }
}
