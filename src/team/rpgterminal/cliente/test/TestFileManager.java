package team.rpgterminal.cliente.test;

import team.rpgterminal.cliente.FileManager;

import java.io.IOException;

/**
 * Created by oem on 15-07-2017.
 */
public class TestFileManager {

    public static void main(String[] args) {
        FileManager fileManager = new FileManager();

        String file = "Plains";
        String content = "EnemyType.ELF:2\nEnemyType.DWARF:1\nItemType.BREAD:2";

        String load = "";

        try {
            fileManager.write(file, content);
        } catch (IOException e) {
            System.err.println("Failed to write to file: " + e.getMessage());
        }

        try {
            load = fileManager.read(file);
        } catch (IOException e) {
            System.err.println("Failed to read from file: " + e.getMessage());
        }

        System.out.println(load);

    }



}
