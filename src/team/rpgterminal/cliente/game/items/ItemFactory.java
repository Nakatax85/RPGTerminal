package team.rpgterminal.cliente.game.items;

public class ItemFactory {

    private Item item = null;
    private int numberOfItens;

    /**
     * @param itemType to create a new Item
     * @return item
     */
    public Item createItem(ItemType itemType) {

        switch (itemType) {
            case BASIC_AXE:
                item = new Item("Basic Axe", 3, KindOfItem.WEAPON);
                return item;
            case BREAD:
                item = new Item("Bread", 50, KindOfItem.HEALING);
                return item;
            case CLOTH:
                item = new Item("Cloth", 0, KindOfItem.DEFAULT);
                return item;
            case STICK:
                item = new Item("Stick", 0, KindOfItem.DEFAULT);
                return item;
            case TORCH:
                item = new Item("Torch", 0, KindOfItem.DEFAULT);
                return item;
            case SCROLL:
                item = new Item("Scroll", 0, KindOfItem.DEFAULT);
                return item;
            case BASIC_SHIELD:
                item = new Item("Basic Shield", 2, KindOfItem.DEFENSE);
                return item;
            case SMALL_ROCK:
                return new Item("Small Roch", 0, KindOfItem.DEFAULT);
            case RUSTY_KNIFE:
                item = new Item("Rusty Knife", 0, KindOfItem.DEFAULT);
                return item;
            case LIGHTED_TORCH:
                item = new Item("Lighted Torch", 0, KindOfItem.DEFAULT);
                return item;
            default:
                System.out.println("Something went really wrong...");
                break;
        }

        return null;

    }

}
