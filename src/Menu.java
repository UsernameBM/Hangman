
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Menu {
    public Menu() {



        System.out.println(getString());

        File playerData = new File("C:\\Users\\henni\\IdeaProjects\\Hangman11\\src\\PlayerData.txt");



        boolean running;
        running = true;
        show();
        while (running){

// behöver veta lite hur man kopplar playerdata med textdocument mm.
            // vad ska stå i main? kan man ha player där???
            //hur gör man så spelare sparas och så man kan välja dom? (vi vill inte att den ska overwrite)

            switch (getInt(1,5)){
                case 1:
                    System.out.println(); // starta spelet och känna av att du har valt en spelare
                    break;
                case 2:
                    readFromFIle(playerData); // ska kunna välja spelare
                    running = false;
                    break;
                case 3:
                    writeToFile(playerData); // ska kunna säga vilken spelare som du lägger till
                    show();
                    break;
                case 4:
                    playerStats(); // vill vill komma åt den här datan från write och read också

                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("felaktig input");
                    break;
            }
        }
    }


    public static void show() {
        // detta ska visa menyn
        System.out.println();
        System.out.println("1. Start game!");
        System.out.println("2. Chose your character");
        System.out.println("3. Make new character");
        System.out.println("4. Character stats");
        System.out.println("5. Quit");

    }
    public static void readFromFIle(File playerData) {

        try {

            Scanner reader = new Scanner(playerData);

            int counter = 0;
            while (reader.hasNextLine()) {
                counter++;
                reader.nextLine();
            }
            reader = new Scanner(playerData);

            String[] fileContent = new String[counter];


            for (int i = 0; i < counter; i++) {
                fileContent[i] = reader.nextLine();
                System.out.println(i + ". " + fileContent[i]); // är det här okej???
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public static void writeToFile(File playerData) {
            System.out.println("Type in new player name!");
            System.out.print("> ");
            String[] names = {"Bill", "Niklas", "Lahoud", "Sahra", "Anuka", "Ahmed", "Henning"}; //den här kanske behöver ändras

            try {

                PrintWriter writer = new PrintWriter(playerData);


                for (int i = 0; i < names.length; i++) {
                    writer.println(names[i]);
                }
                Scanner keyboard = new Scanner(System.in);
                String player = keyboard.nextLine();
                writer.println(player);

                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("IOexception");
            }
        }

        public static void playerStats(){
            Player[] players = new Player [7];

            players[0] = new Player("Bill", 0, 0, 0);
            players[1] = new Player("Niklas", 0, 0, 0);
            players[2] = new Player("Lahoud", 0, 0, 0);
            players[3] = new Player("Sahra", 0, 0, 0);
            players[4] = new Player("Anuka", 0, 0, 0);
            players[5] = new Player("Ahmed", 0, 0, 0);
            players[6] = new Player("Henning", 0, 0, 0);

            System.out.println(players[0].getName());
            System.out.println(players[0].getRounds());
            System.out.println(players[0].getWins());
            System.out.println(players[0].getLosses());
            System.out.println();
            System.out.println(players[1].getName());
            System.out.println(players[1].getRounds());
            System.out.println(players[1].getWins());
            System.out.println(players[1].getLosses());
            System.out.println();
            System.out.println(players[2].getName());
            System.out.println(players[2].getRounds());
            System.out.println(players[2].getWins());
            System.out.println(players[2].getLosses());
            System.out.println();
            System.out.println(players[3].getName());
            System.out.println(players[3].getRounds());
            System.out.println(players[3].getWins());
            System.out.println(players[3].getLosses());
            System.out.println();
            System.out.println(players[4].getName());
            System.out.println(players[4].getRounds());
            System.out.println(players[4].getWins());
            System.out.println(players[4].getLosses());
            System.out.println();
            System.out.println(players[5].getName());
            System.out.println(players[5].getRounds());
            System.out.println(players[5].getWins());
            System.out.println(players[5].getLosses());
            System.out.println();
            System.out.println(players[6].getName());
            System.out.println(players[6].getRounds());
            System.out.println(players[6].getWins());
            System.out.println(players[6].getLosses());
            System.out.println();
        }
//      b a _ a _

    public static String getString(){ //ska ta inputs från spelet
        String s;
        s = "Welcome to Hangman";
        return s;
    }
    public static int getInt(int min, int max){
    Scanner menuScanner = new Scanner(System.in);

    int x = menuScanner.nextInt();

        return x;
    }
    public static char getAlpha(){

        return 0;
    }

    }

