package team.rpgterminal.cliente.game.tools;

/**
 * Created by codecadet on 12/07/17.
 */
public enum MapZones {

    HOME("Home"),

    FOREST("Forest"),
        TREE_OF_LIFE("Tree Of Life"),
        RIVER_FLOW("River Flow"),
            CATARACT_FALLS("Cataract Falls"),

    MOUNTAIN("Mountain"),
        SNOW_FALL("Snow Fall"),
        ICY_PEAK("Icy Peak"),
            MOUNT_NEVERLAST("Mount Neverlast"),

    PLAIN("Plain"),
        CLIFF_EASTWOOD("Cliff Eastwood"),
        ELEPHANT_CEMETERY("Elephant Cemetery"),
            DEATH_END("Death End"),
            VOLCANO_HOLE("Volcano Hole"),
                THE_FORGE("The Forge"),
                CASTLE_OF_FLAMES("Castle of Flames");

    private String zone;

    MapZones(String zone) {
        this.zone = zone;
    }

    public static MapZones whichZone(String zone) {

        switch (zone) {

            case "Home":
                return HOME;

            case "Forest":
                return FOREST;

            case "Tree of Life":
                return TREE_OF_LIFE;

            case "River Flow":
                return RIVER_FLOW;

            case "Cataract Falls":
                return CATARACT_FALLS;

            case "Mountain":
                return MOUNTAIN;

            case "Snow Fall":
                return SNOW_FALL;

            case "Icy Peak":
                return ICY_PEAK;

            case "Mount Neverlast":
                return MOUNT_NEVERLAST;

            case "Plain":
                return PLAIN;

            case "Cliff Eastwood":
                return CLIFF_EASTWOOD;

            case "Elephant Cemetery":
                return ELEPHANT_CEMETERY;

            case "Death End":
                return DEATH_END;

            case "Volcano Hole":
                return VOLCANO_HOLE;

            case "The Forge":
                return THE_FORGE;

            case "Castle of Flames":
                return CASTLE_OF_FLAMES;

        }

        return null;

    }

}
