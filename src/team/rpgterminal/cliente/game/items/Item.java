package team.rpgterminal.cliente.game.items;

import team.rpgterminal.cliente.game.GameObjects;

public class Item extends GameObjects {

    private String name;
    private int bonus;
    private ItemType itemType;

    public Item(String name, int bonus, ItemType itemType){
        super();
        this.name = name;
        this.bonus = bonus;
        this.itemType = itemType;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public ItemType getItemType() {
        return itemType;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", bonus=" + bonus +
                ", itemType=" + itemType +
                '}';
    }
}