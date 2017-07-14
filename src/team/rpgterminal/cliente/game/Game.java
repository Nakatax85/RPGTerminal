package team.rpgterminal.cliente.game;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by codecadet on 10/07/2017.
 */
public class Game {
    private AsciiMaker asciiMaker = new AsciiMaker(200, 60, "DragonQuest");

    private Socket socket;

    public Game(Socket socket) {
        this.socket = socket;
    }

    public void start() {

        OutputStream outputStream = null;
        try {
            outputStream = this.socket.getOutputStream();
            outputStream.write(asciiMaker.drawTitle().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
