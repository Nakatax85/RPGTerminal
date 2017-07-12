package team.rpgterminal.cliente.game.tools;

public final class RandomNumber {
    /**
     * Auxiliary class to generate a random number between a min and max value
     *
     * @param min minimum possible value, min should be non-negative
     * @param max max needs to be bigger than min andshould be non-negative
     * @return random number between in the range of min and max
     */
    public static int generate(int min, int max){
        return (int)(Math.random() * max) + min;
    }
}
