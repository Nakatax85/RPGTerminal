package team.rpgterminal.cliente.test;

import team.rpgterminal.cliente.game.Destructible;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.villager.Villager;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.villager.VillagerFactory;

/**
 * Created by codecadet on 10/07/2017.
 */
public class TesterVillager {
    public static void main(String[] args) {

        Destructible villager = new Villager();

        System.out.println("TESTING VILLAGERS");

        villager.hit(2);

        System.out.println();
        System.out.println("TESTING VILLAGER FACTORY");

        VillagerFactory villagerFactory = new VillagerFactory();

        for (int i = 0; i < 5 ; i++) {
            villagerFactory.createVillager();
        }

    }
}
