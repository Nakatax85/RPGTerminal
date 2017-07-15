package team.rpgterminal.cliente;

import java.io.*;

/**
 * Created by codecadet on 10/07/2017.
 */
public class FileManager {

    private String FILE_PATH = "resources/";
    private String FILE_EXTENSION = ".txt";

    public FileManager() {

    }

    public void write(String file, String content) throws IOException {

        FileWriter fileWriter = new FileWriter(FILE_PATH + file + FILE_EXTENSION);

        BufferedWriter bWriter = new BufferedWriter(fileWriter);

        bWriter.write(content);

        System.out.println("FILE SAVED");

        bWriter.close();

    }


    public String read(String file) throws IOException {

        FileReader fileReader = new FileReader(FILE_PATH + file + FILE_EXTENSION);

        BufferedReader bReader = new BufferedReader(fileReader);

        String loadFile;
        String result = "";

        while ((loadFile = bReader.readLine()) != null) {
            result += loadFile + "\n";

        }

        System.out.println("LOADING FILE");

        bReader.close();

        return result;

    }

}
