package team.rpgterminal.cliente.game.nonPlayablesCharacters.villager;

import team.rpgterminal.cliente.game.tools.RandomNumber;

/**
 * Created by NJSilva on 12/07/2017.
 */
public class VillagerFactory {


    private int randomNumber;
    private Villager villager;

    /**
     * It creates a villager of a specific type depending on a random number.
     * @return Villager - villager.
     */

    public Villager createVillager(){
        randomNumber = RandomNumber.generate(0,2);

        switch (randomNumber){
            case 0:
                villager = new Villager();
                System.out.println("A VILLAGER is nearby.");
                break;
            case 1:
                villager = new SpecialVillager();
                System.out.println("A SPECIAL VILLAGER is nearby. Pay attention he may have a quest for you.");
                break;
            default:
                System.out.println("Look out for villagers.");
                break;
        }
        return villager;
    }


}
