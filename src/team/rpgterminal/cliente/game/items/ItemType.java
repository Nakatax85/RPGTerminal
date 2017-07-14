package team.rpgterminal.cliente.game.items;

public enum ItemType {
    BASIC_SHIELD(true, false, true),
    BASIC_AXE(true, true, false),
    BREAD(false, false, false),
    RUSTY_KNIFE(false, false, false),
    STICK(false, false, false),
    CLOTH(false, false, false),
    SMALL_ROCK(false, false, false),
    TORCH(false, false, false),
    LIGHTED_TORCH(false, false, false),
    SCROLL(false, false, false);

    private boolean isPossibleToEquip;
    private boolean attackItem;
    private boolean defenseItem;

    ItemType (boolean isPossibleToEquip, boolean attackItem, boolean defenseItem) {
        this.isPossibleToEquip = isPossibleToEquip;
        this.attackItem = attackItem;
        this.defenseItem = defenseItem;
    }

    public boolean isPossibleToEquip() {
        return isPossibleToEquip;
    }

    public boolean isAttackItem() {
        return attackItem;
    }

    public boolean isDefenseItem() {
        return defenseItem;
    }
}
