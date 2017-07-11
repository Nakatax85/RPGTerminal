package team.rpgterminal.game.playables;

public interface Playable {

    int getHealth();

    String getInstruction(String instruction);

    boolean isDead();

}
