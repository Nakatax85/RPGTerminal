package team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy;

import team.rpgterminal.cliente.game.tools.RandomNumber;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codecadet on 11/07/2017.
 */
public class EnemyFactory {

    private EnemyType enemyType = null;
    private Enemy enemy;

    /**
     * It creates an enemy of type Dwarf.
     *
     * @return enemy - Dwarf.
     */
    public Enemy createDwarf() {
        enemy = new Enemy(enemyType = EnemyType.DWARF);
        getEnemyMessage(enemyType);
        return enemy;
    }

    /**
     * It creates an enemy of type Dragon.
     *
     * @return enemy - Dragon.
     */
    public Enemy createDragon() {
        enemy = new Enemy(enemyType = EnemyType.DRAGON);
        getEnemyMessage(enemyType);
        return enemy;
    }

    /**
     * It creates an enemy of type Dragon.
     *
     * @return enemy - Dragon.
     */
    public Enemy createMercenary() {
        enemy = new Enemy(enemyType = EnemyType.MERCENARY);
        getEnemyMessage(enemyType);
        return enemy;
    }

    /**
     * It creates an enemy of type Elf.
     *
     * @return enemy - Elf.
     */
    public Enemy createElf() {
        enemy = new Enemy(enemyType = EnemyType.ELF);
        getEnemyMessage(enemyType);
        return enemy;
    }

    /**
     * It creates an enemy of type Monster.
     *
     * @return enemy - Monster.
     */

    public Enemy createMonster() {
        enemy = new Enemy(enemyType = EnemyType.MONSTER);
        getEnemyMessage(enemyType);
        return enemy;
    }

    /**
     * It creates a intro message for a enemy type.
     * @param enemyType
     */
    public void getEnemyMessage(EnemyType enemyType) {
        System.out.println("A " + enemyType.getSymbol() + " appears.");
        System.out.println("It has "+ enemyType.getAttackPower()+" points of attacking power and "+ enemyType.getShield()+ " points of shield.");
    }


}
