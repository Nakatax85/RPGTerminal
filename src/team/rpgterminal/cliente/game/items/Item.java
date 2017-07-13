package team.rpgterminal.cliente.game.items;

import team.rpgterminal.cliente.game.GameObjects;

public class Item extends GameObjects {

    private String name;
    private int maxDamage;
    private int maxDefense;

    public Item(){
        super();
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public int getMaxDefense() {
        return maxDefense;
    }
    
}


/*

Item types [armour]:
 -> Helmet
 -> Chestplate
 -> Leggings
 -> Boots

 -> Sword
 -> Shield

 */