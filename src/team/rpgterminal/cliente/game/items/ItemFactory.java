package team.rpgterminal.cliente.game.items;

public class ItemFactory {

    private Item item = null;

    /**
     *
     * @param itemType to create a new Item
     * @return item
     */
    public Item createItem (ItemType itemType) {

        switch (itemType){
            case BASIC_AXE:
                item = new Item("Basic Axe", 3, itemType);
                return item;
            case BREAD:
                item = new Item("Bread", 50, itemType);
                return item;
            case CLOTH:
                item = new Item("Cloth", 0, itemType);
                return item;
            case STICK:
                item = new Item("Stick", 0, itemType);
                return item;
            case TORCH:
                item = new Item("Torch", 0, itemType);
                return item;
            case SCROLL:
                item = new Item("Scroll", 0, itemType);
                return item;
            case BASIC_SHIELD:
                item = new Item("Basic Shield", 2, itemType);
                return item;
            case SMALL_ROCK:
                return new Item("Small Roch", 0, itemType);
            case RUSTY_KNIFE:
                item = new Item("Rusty Knife", 0,itemType);
                return item;
            case LIGHTED_TORCH:
                item = new Item("Lighted Torch", 0, itemType);
                return item;
            default:
                System.out.println("Something went really wrong...");
                break;
        }

        return null;

    }

}
