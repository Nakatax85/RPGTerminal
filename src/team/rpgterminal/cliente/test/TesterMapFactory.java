package team.rpgterminal.cliente.test;

import team.rpgterminal.cliente.game.tools.MapFactory;
import team.rpgterminal.cliente.game.tools.MapZones;

/**
 * Created by codecadet on 13/07/17.
 */
public class TesterMapFactory {

    public static void main(String[] args) {

        MapFactory mapFactory = new MapFactory();

        System.out.println(mapFactory.createMap(MapZones.HOME));

    }

}
