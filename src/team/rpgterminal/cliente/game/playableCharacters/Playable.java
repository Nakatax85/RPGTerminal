package team.rpgterminal.cliente.game.playableCharacters;

public interface Playable {

    int getHealth();

    String getInstruction(String instruction);

    boolean isDead();

}
