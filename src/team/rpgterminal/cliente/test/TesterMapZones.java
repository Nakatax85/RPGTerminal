package team.rpgterminal.cliente.test;

import team.rpgterminal.cliente.game.tools.MapZones;

/**
 * Created by codecadet on 12/07/17.
 */
public class TesterMapZones {

    public static void main(String[] args) {

        System.out.println(MapZones.CASTLE_OF_FLAMES);

        System.out.println(MapZones.whichZone("Home"));
        System.out.println(MapZones.whichZone("Forest"));
        System.out.println(MapZones.whichZone("Tree of Life"));
        System.out.println(MapZones.whichZone("River Flow"));
        System.out.println(MapZones.whichZone("Cataract Falls"));
        System.out.println(MapZones.whichZone("Mountain"));
        System.out.println(MapZones.whichZone("Snow Fall"));
        System.out.println(MapZones.whichZone("Icy Peak"));
        System.out.println(MapZones.whichZone("Mount Neverlast"));
        System.out.println(MapZones.whichZone("Plain"));
        System.out.println(MapZones.whichZone("Cliff Eastwood"));
        System.out.println(MapZones.whichZone("Elephant Cemetery"));
        System.out.println(MapZones.whichZone("Death End"));
        System.out.println(MapZones.whichZone("Volcano Hole"));
        System.out.println(MapZones.whichZone("The Forge"));
        System.out.println(MapZones.whichZone("Castle of Flames"));



    }

}
