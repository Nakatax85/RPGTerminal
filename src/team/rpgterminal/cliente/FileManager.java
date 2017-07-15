package team.rpgterminal.cliente;

import java.io.*;

/**
 * Created by codecadet on 10/07/2017.
 */
public class FileManager {

    private String FILE_PATH = "resources/";

    public FileManager() {

    }

    public void write(String file) throws IOException {

        FileWriter fileWriter = new FileWriter(FILE_PATH + file);

        BufferedWriter bWriter = new BufferedWriter(fileWriter);

        bWriter.write(file);

        System.out.println("FILE SAVED");

        bWriter.close();

    }


    public String read(String file) throws IOException {

        FileReader fileReader = new FileReader(FILE_PATH + file);

        BufferedReader bReader = new BufferedReader(fileReader);

        String loadFile = bReader.readLine();

        System.out.println("LOADING FILE");

        bReader.close();

        return loadFile;

    }

}
