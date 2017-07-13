package team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy;

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

    /**
     * Constructs the enemy type enum.
     * @param symbol
     * @param maxHits
     * @param attackPower
     * @param shield
     */
    EnemyType(String symbol, int maxHits, int attackPower, int shield) {
        this.symbol = symbol;
        this.maxHits = maxHits;
        this.attackPower = attackPower;
        this.shield = shield;
    }

    /**
     * It gets the symbol from a specific enemy type.
     * @return string - symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * It gets the maximum number of hits a enemy can take before dying.
     * @return int - max number of hits
     */
    public int getMaxHits() {
        return maxHits;
    }

    /**
     * It gets the attacking power of a specific enemy type.
     * @return int - attacking power
     */
    public int getAttackPower() {
        return attackPower;
    }

    /**
     * It gets the shield protection from a specific enemy type-
     * @return int - shield
     */
    public int getShield() {
        return shield;
    }
}
