package team.rpgterminal.game;

/**
 * Created by NJSilva on 11/07/2017.
 */
public class RandomNumber {

    private static int random;

    public static int numGen(){
        return random = (int)(Math.random() * 5 + 1);
    }
}
