package team.rpgterminal.cliente.test;


import team.rpgterminal.cliente.game.AsciiMaker;

/**
 * Created by NJSilva on 13/07/2017.
 */
public class TesterASCII {

    public static void main(String[] args) {
        AsciiMaker asciiMaker = new AsciiMaker(200, 50, "DragonQuest");

        asciiMaker.drawTitle();

    }

}
