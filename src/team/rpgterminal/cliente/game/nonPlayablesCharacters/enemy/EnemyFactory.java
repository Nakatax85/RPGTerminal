package team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy;

import team.rpgterminal.cliente.game.tools.RandomNumber;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codecadet on 11/07/2017.
 */
public class EnemyFactory {

    private int randomNumber;
    private Enemy enemy;

    /**
     * It creates an enemy of random types.
     * @return enemy
     */
    public Enemy createEnemy() {
        EnemyType enemyType = null;
        randomNumber = RandomNumber.generate(0,5);

        switch (randomNumber) {
            case 0:
                enemy = new Enemy(enemyType = EnemyType.MONSTER);
                System.out.println("A " + enemyType.getSymbol() + " appears.");
                break;
            case 1:
                enemy = new Enemy(enemyType = EnemyType.DRAGON);
                System.out.println("A " + enemyType.getSymbol() + " appears.");
                break;
            case 2:
                enemy = new Enemy(enemyType = EnemyType.DWARF);
                System.out.println("A " + enemyType.getSymbol() + " appears.");
                break;
            case 3:
                enemy = new Enemy(enemyType = EnemyType.ELF);
                System.out.println("An " + enemyType.getSymbol() + " appears.");
                break;
            case 4:
                enemy = new Enemy(enemyType = EnemyType.MERCENARY);
                System.out.println("A " + enemyType.getSymbol() + " appears.");
                break;
            default:
                System.out.println("Something amazing will happen eventually");
        }
        return enemy;
    }
}
