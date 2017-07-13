package team.rpgterminal.cliente.test;

import team.rpgterminal.server.tools.SplitCommands;

/**
 * Created by codecadet on 13/07/17.
 */

public class TesterSplitter {

    public static void main(String[] args) {

        SplitCommands sc = new SplitCommands();


        //sc.split("cd Yourmom is gay");
        //sc.split(" ");
        //sc.split("");
        sc.split("ls");

        System.out.println(sc.getCommand());
        System.out.println(sc.getActionCommand());
        //System.out.println(sc.getText());

    }

}
