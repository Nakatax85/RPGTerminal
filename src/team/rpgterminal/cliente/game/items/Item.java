package team.rpgterminal.cliente.game.items;

import team.rpgterminal.cliente.game.GameObjects;

public class Item extends GameObjects {

    private String name;
    private int bonus;
    private KindOfItem itemKind;

    public Item(String name, int bonus, KindOfItem itemKind){
        super();
        this.name = name;
        this.bonus = bonus;
        this.itemKind = itemKind;
    }

    public int getBonus() {
        return bonus;
    }

    public KindOfItem getItemKind() {
        return itemKind;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}