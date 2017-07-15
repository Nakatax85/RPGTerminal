package team.rpgterminal.cliente.game;

/**
 * Created by codecadet on 10/07/2017.
 */
public interface Destructible {

    void takeHit(int attackPower);
    boolean isDestroyed();
}
