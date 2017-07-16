package team.rpgterminal.cliente.test;

import team.rpgterminal.cliente.FileManager;
import team.rpgterminal.cliente.game.tools.MapFactory;
import team.rpgterminal.server.tools.FileParsing;

import java.io.IOException;

/**
 * Created by oem on 16-07-2017.
 */
public class TesterFileParser {

    public static void main(String[] args) {

        FileParsing fileParsing = new FileParsing();

        FileManager fileManager = new FileManager();

        String file = "";

        try {
            file = fileManager.read("Plains");
        } catch (IOException e) {
            System.err.println("Couldn't find the file: " + e.getMessage());
        }

        fileParsing.parse(file);

    }

}
