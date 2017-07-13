package team.rpgterminal.cliente.game.items;

public class ItemFactory {

    private ItemType itemType;

    public Item createItem (ItemType itemType) {

        switch (itemType){
            case BASIC_AXE:

                return new Item("Basic Axe", 3, itemType);
            case BREAD:
                return new Item("Bread", 50, itemType);
            case CLOTH:
                return new Item("Cloth", 0, itemType);
            case STICK:
                return new Item("Stick", 0, itemType);
            case TORCH:
                return new Item("Torch", 0, itemType);
            case SCROLL:
                return new Item("Scroll", 0, itemType);
            case BASIC_SHIELD:
                return new Item("Basic Shield", 0, itemType);
            case SMALL_ROCK:
                return new Item("Small Roch", 0, itemType);
            case RUSTY_KNIFE:
                return new Item("Rusty Knife", 0,itemType);
            case LIGHTED_TORCH:
                return new Item("Lighted Torch", 0, itemType);
            default:
                System.out.println("Something went really wrong...");
                break;
        }

        return null;

    }

}
