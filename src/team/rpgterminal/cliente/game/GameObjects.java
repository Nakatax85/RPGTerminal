package team.rpgterminal.cliente.game;

/**
 * Created by codecadet on 10/07/2017.
 */
public class GameObjects implements Destructible{



    @Override
    public void takeHit(int attackPower) {}

    @Override
    public boolean isDestroyed() {
        return false;
    }

    public void postAlert(String message){

    }
}
