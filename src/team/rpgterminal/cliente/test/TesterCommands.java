package team.rpgterminal.cliente.test;

import team.rpgterminal.cliente.game.playableCharacters.PlayerCommands;
import team.rpgterminal.server.ServerCommands;

/**
 * Created by codecadet on 12/07/17.
 */
public class TesterCommands {

    public static void main(String[] args) {

        System.out.println(ServerCommands.KICK);
        System.out.println(ServerCommands.whichCommand("/kick"));

        System.out.println(PlayerCommands.ATTACK);
        System.out.println(PlayerCommands.whichCommand("defend"));

    }

}
