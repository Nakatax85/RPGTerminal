package team.rpgterminal.game.nonplayables;

/**
 * Created by codecadet on 11/07/2017.
 */
public enum EnemyType {
    MONSTER ("MONSTER",7,7,2),
    DRAGON("DRAGON",12,16,12),
    DWARF("DWARF",5,3,1),
    ELF("ELF",9,10,8),
    MERCENARY("MERCENARY",8,5,10);

    private String symbol;
    private int maxHits;
    private int attackPower;
    private int shield;

    EnemyType(String symbol, int maxHits, int attackPower, int shield) {
        this.symbol = symbol;
        this.maxHits = maxHits;
        this.attackPower = attackPower;
        this.shield = shield;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getMaxHits() {
        return maxHits;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getShield() {
        return shield;
    }
}
