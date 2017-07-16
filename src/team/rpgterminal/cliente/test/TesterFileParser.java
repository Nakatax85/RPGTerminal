package team.rpgterminal.cliente.test;

import team.rpgterminal.server.tools.FileParsing;

/**
 * Created by oem on 16-07-2017.
 */
public class TesterFileParser {

    public static void main(String[] args) {

        FileParsing fileParsing = new FileParsing();

        fileParsing.parse("Enemies:\n" +
                "ELF:2\n" +
                "DWARF:1\n" +
                "\n" +
                "Items:\n" +
                "BREAD:2");



    }

}
