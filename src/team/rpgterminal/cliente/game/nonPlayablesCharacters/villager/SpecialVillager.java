package team.rpgterminal.cliente.game.nonPlayablesCharacters.villager;

import team.rpgterminal.cliente.game.Destructible;

/**
 * Created by codecadet on 10/07/2017.
 */
public class SpecialVillager extends Villager {


    public SpecialVillager() {
        super();
    }

    /**
     * It creates a Special Villager greeting.
     * Prints out the text.
     */
    public void specialVillagerGreeting() {
        System.out.println("Hello brave warrior! My village needs your help. Can you help us, please?");
    }

    /**
     * It creates the Forest Trolls Quest.
     * Prints out the text.
     */

    public void giveForestTrollsQuest() {
        System.out.println("This has been a very difficult time for our village. Since the TROLLS arrived.");
        System.out.println("Many years ago our Forest was populated by the TROLLS until a great fire destroyed part of the forest.");
        System.out.println("They fled and for hundreds of years we lived in peace. But now the TROLLS are back,");
        System.out.println("and they kill everyone who tries to cross the forest. We need your help to scare the TROLLS away.");
        System.out.println("They are just too strong and powerful to be defeated in a combat, but they're dumb as a rock.");
        System.out.println("Will you accept this task? We will reward you if you succeed.");
    }

    /**
     * It prints out the reward message.
     */

    public void reward() {
        System.out.println("You brave soul. Thank you so much for your assistance.");
        System.out.println("Because of your bravery we reward you with this gift. Use it well.");
    }

    /**
     * It prints out a reply if player refuses the quest.
     */
    public void questRefusal() {
        System.out.println("Really?? You will not help us? I guess you lack the courage I thought you had.");
    }

    /**
     * If the player tries to attack Special Villager it returns causes the amount of attackPower of damage to the player.
     * @param attackPower
     * @return int - attackPower
     */
    public int reflectDamage(int attackPower) {
        System.out.println("I am protected by the will and grace of the Atlas. You cannot kill me.");
        System.out.println("You suffered " + attackPower + " points of damage.");
        return attackPower;
    }
}
