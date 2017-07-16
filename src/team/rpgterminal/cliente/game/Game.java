package team.rpgterminal.cliente.game;

import team.rpgterminal.cliente.game.items.ItemFactory;
import team.rpgterminal.cliente.game.items.ItemType;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.EnemyFactory;
import team.rpgterminal.cliente.game.nonPlayablesCharacters.enemy.EnemyType;
import team.rpgterminal.cliente.game.playableCharacters.Player;
import team.rpgterminal.cliente.game.tools.Map;
import team.rpgterminal.cliente.game.tools.MapFactory;
import team.rpgterminal.cliente.game.tools.MapZones;
import team.rpgterminal.server.tools.SplitCommands;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class Game {

    private AsciiMaker asciiMaker = new AsciiMaker(200, 40, "DragonQuest");
    private Socket socket;
    private EnemyFactory enemyFactory;
    private ItemFactory itemFactory;
    private MapFactory mapFactory;
    private HashMap<EnemyType, Integer> enemyList;
    private HashMap<ItemType, Integer> itemList;
    private Scanner message = new Scanner(System.in);
    private String receivedMessage;
    private Map mapHome;
    private Map mapForest;
    private Map mapTreeOfLife;
    private SplitCommands splitCommands;
    private Player p1;

    public Game(Socket socket) {
        this.socket = socket;
    }

    public Game() {
    }

    public void start(Player p1) {
        asciiMaker.drawTitle();

        createHome();

        System.out.println("\n\nWelcome to the first chapter of DragonQuest!\n" +
                "You will lear the basics and after words you can continue this journey all by your self.");
        System.out.println("\nYou are at home. You can be teleported here anywhere you want. Just type: tp Home");
        System.out.println("You only have one way possible from this point. Type south to exit Home");

        //TODO: MISSION

        // delete used itens
        mapHome.getItems().remove(0);
        System.out.println("Well done " + p1.getName() + " you completed the first part. Are you ready for the next step");

        receivedMessage = message.nextLine();

        while (!receivedMessage.equals("south")) {
            System.out.println("That's not what I've asked. Please enter what I've told you");
            receivedMessage = message.nextLine();
        }
        p1.move(receivedMessage);

        System.out.println("Nice one! You can move throw the map using the basic commands: north south east west");

        System.out.println("You just left home behind...");

        createForest();
        // TODO mission

        System.out.println("It looks like you have two ways possible: west and east");

        receivedMessage = message.nextLine();

        while(!receivedMessage.equals("west")) {
            System.out.println("Are you sure you want to go this way");
            receivedMessage = message.nextLine();
        }
        p1.move(receivedMessage);

        createTreeOfLife();
        System.out.println("You are now at the Tree Of Life");

        System.out.println("You see something shiny and you want to pick it up");

        //TODO: comando para apanhar

        System.out.println("This place looks empty...");

        while(!receivedMessage.equals("east")) {
            System.out.println("Try again...");
            receivedMessage = message.nextLine();
        }
        p1.move(receivedMessage);

        System.out.println("You are now at the Forest...");

        while(!receivedMessage.equals("east")) {
            System.out.println("Try again...");
            receivedMessage = message.nextLine();
        }
        p1.move(receivedMessage);


        createRiverFlow();
        System.out.println("You are now at the RiverFlow");
        //TODO: River quest


        while(!receivedMessage.equals("south")) {
            System.out.println("Try again...");
            receivedMessage = message.nextLine();
        }
        p1.move(receivedMessage);

        createCataratFalls();
    }

    private void createRiverFlow() {
        enemyFactory = new EnemyFactory();
        itemFactory = new ItemFactory();
        mapFactory = new MapFactory(enemyFactory, itemFactory);
        enemyList = new HashMap<>();
        itemList = new HashMap<>();

        itemList.put(ItemType.BASIC_AXE, 5);

        mapTreeOfLife = mapFactory.createMap(MapZones.HOME, enemyList, itemList);
        System.out.println(mapTreeOfLife);
    }

    private void createCataratFalls() {
        enemyFactory = new EnemyFactory();
        itemFactory = new ItemFactory();
        mapFactory = new MapFactory(enemyFactory, itemFactory);
        enemyList = new HashMap<>();
        itemList = new HashMap<>();

        itemList.put(ItemType.SCROLL, 1);

        mapTreeOfLife = mapFactory.createMap(MapZones.HOME, enemyList, itemList);
        System.out.println(mapTreeOfLife);
    }

    private void createTreeOfLife() {
        enemyFactory = new EnemyFactory();
        itemFactory = new ItemFactory();
        mapFactory = new MapFactory(enemyFactory, itemFactory);
        enemyList = new HashMap<>();
        itemList = new HashMap<>();

        itemList.put(ItemType.BASIC_SHIELD, 5);

        mapTreeOfLife = mapFactory.createMap(MapZones.HOME, enemyList, itemList);
        System.out.println(mapTreeOfLife);
    }

    private void createHome() {
        enemyFactory = new EnemyFactory();
        itemFactory = new ItemFactory();
        mapFactory = new MapFactory(enemyFactory, itemFactory);
        enemyList = new HashMap<>();
        itemList = new HashMap<>();

        itemList.put(ItemType.BASIC_AXE, 1);

        mapHome = mapFactory.createMap(MapZones.HOME, enemyList, itemList);
        System.out.println(mapHome);
    }

    private void createForest() {
        enemyFactory = new EnemyFactory();
        itemFactory = new ItemFactory();
        mapFactory = new MapFactory(enemyFactory, itemFactory);
        enemyList = new HashMap<>();
        itemList = new HashMap<>();

        enemyList.put(EnemyType.ELF,2);
        enemyList.put(EnemyType.TROLL,3);

        itemList.put(ItemType.STICK, 1);
        itemList.put(ItemType.TORCH, 1);
        itemList.put(ItemType.CLOTH, 1);
        itemList.put(ItemType.SMALL_ROCK, 2);
        itemList.put(ItemType.PILE_OF_LEAVES, 1);

        mapForest = mapFactory.createMap(MapZones.HOME, enemyList, itemList);

        System.out.println(mapForest);
    }

}
