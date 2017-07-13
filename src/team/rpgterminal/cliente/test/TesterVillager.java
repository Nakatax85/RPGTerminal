package team.rpgterminal.cliente.test;

import sun.security.krb5.internal.crypto.Des;
import team.rpgterminal.cliente.game.Destructible;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.villager.SpecialVillager;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.villager.Villager;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.villager.VillagerFactory;

import java.util.ArrayList;

/**
 * Created by codecadet on 10/07/2017.
 */
public class TesterVillager {
    public static void main(String[] args) {

        Destructible villager = new Villager();
        SpecialVillager specialVillager1 = new SpecialVillager();
        ArrayList<Villager> villagersList = new ArrayList<>();

        System.out.println("TESTING VILLAGERS");

        villager.hit(2);

        System.out.println();
        System.out.println("TESTING VILLAGER FACTORY");

        VillagerFactory villagerFactory = new VillagerFactory();

        for (int i = 0; i < 5 ; i++) {
            villagersList.add(villagerFactory.createVillager());
        }

        System.out.println();
        System.out.println("TESTING VILLAGER");
        villagersList.get(1).villagerBraveGreeting();
        villagersList.get(2).villagerJokerGreeting();
        villagersList.get(3).villagerNormalGreeting();
        System.out.println();
        villagersList.get(1).villagerBraveReply();
        villagersList.get(2).villagerNormalReply();
        villagersList.get(3).villagerJokerReply();

        System.out.println();
        System.out.println("TESTING SPECIAL VILLAGER");
        specialVillager1.specialVillagerGreeting();
        specialVillager1.giveForestTrollsQuest();
        System.out.println();
        specialVillager1.questRefusal();
        specialVillager1.reward();
        specialVillager1.reflectDamage(34);


    }
}
