package team.rpgterminal.game.playables;

import team.rpgterminal.game.nonplayables.Item;

/**
 * Created by codecadet on 10/07/2017.
 */
public class Player implements Playable {

    private String name;

    public Player(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void listItems(){

    }

    public void useGear(Item item){

    }

    public void attack(){

    }

    public void defend(){

    }

    public void move(){

    }

    public void lookAround(){

    }

    public void interact(){

    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public String getInstruction() {
        return null;
    }

    @Override
    public boolean isDead() {
        return false;
    }
}
