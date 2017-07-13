package team.rpgterminal.cliente.test;

import team.rpgterminal.cliente.game.items.ItemFactory;
import team.rpgterminal.cliente.game.items.ItemType;

public class TesterItem {

    public static void main(String[] args) {

        ItemFactory itemFactory = new ItemFactory();

        System.out.println(itemFactory.createItem(ItemType.BASIC_AXE));
        System.out.println(itemFactory.createItem(ItemType.BREAD));
        System.out.println(itemFactory.createItem(ItemType.LIGHTED_TORCH));
        System.out.println(itemFactory.createItem(ItemType.BASIC_SHIELD));
        System.out.println(itemFactory.createItem(ItemType.STICK));

    }
}
