package team.rpgterminal.cliente.test;

import team.rpgterminal.cliente.game.Game;
import team.rpgterminal.cliente.game.playableCharacters.Player;

import java.net.Socket;

/**
 * Created by codecadet on 10/07/2017.
 */
public class TesterGame{

    public static void main(String[] args) {

        Player p1 = new Player("Mário");
        Game game = new Game();

        game.start(p1);

    }
}
