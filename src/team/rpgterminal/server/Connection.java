package team.rpgterminal.server;

import team.rpgterminal.cliente.game.Game;

import java.net.Socket;

public class Connection implements Runnable {

    private Socket socket;
    private Game game;

    public Connection(Socket socket) {

        this.socket = socket;
        game = new Game(socket);

    }

    @Override
    public void run() {

        game.start();

    }
}
