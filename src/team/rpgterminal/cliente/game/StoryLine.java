package team.rpgterminal.cliente.game;

/**
 * Created by codecadet on 16/07/2017.
 */
public class StoryLine {

    private String storyMessage;




    public String welcomeGameMessage(){
        return storyMessage = "\n\n                  Welcome to the first chapter of DragonQuest!\n" +
                "You will learn the basics and afterwards you can continue this journey all by yourself.";
    }

    public String getHomeTutorial(){
        return storyMessage = "\n You can be teleported anywhere you want. Just type: tp Home";
    }

    public String getTutorial(){
        return storyMessage = "\n This is your safe place. At home you can start your adventure knowing that no enemies will surprise attack you.\n" +
                "In the world of DragonQuest you can become a truly great warrior.\n" +
                "The commands for moving around the map are: north south east west\n" +
                "You will encounter many items along the way to help your quest, the commands to interact with them are: ";
    }

}
