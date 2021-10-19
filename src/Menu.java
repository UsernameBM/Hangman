
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Menu {
    ArrayList<Player>  playerArrayList = new ArrayList<Player>();
    Player currentPlayer;


    public Menu() {



        System.out.println(getString());

        File playerData = new File("src/PlayerData.txt");



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
                    show();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("incorrect input");
                    break;
            }
        }
    }


    public void show() {
        // detta ska visa menyn
        System.out.println();
        System.out.println("1. Start game!");
        System.out.println("2. Chose your character");
        System.out.println("3. Make new character");
        System.out.println("4. Character stats");
        System.out.println("5. Quit");

    }
    public void readFromFIle(File playerData) {

        try {

            Scanner reader = new Scanner(playerData);

            while (reader.hasNextLine()) {
                String playerName = reader.nextLine();
                int playerRound = Integer.parseInt(reader.nextLine());
                int playerWins = Integer.parseInt(reader.nextLine());
                int playerLosses = Integer.parseInt(reader.nextLine());
                Player p = new Player(playerName, playerRound, playerWins, playerLosses);
                System.out.println(p.toString());
                //reader.nextLine();
               this.playerArrayList.add(p);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public void writeToFile(File playerData) {
            System.out.println("Add new player!");
            System.out.print("> ");


            try {
                Scanner saveData = new Scanner(playerData);
                ArrayList<String> temp = new ArrayList<>();
                while (saveData.hasNextLine()){
                    temp.add(saveData.nextLine());
                }
                PrintWriter writer = new PrintWriter(playerData);



                Scanner keyboard = new Scanner(System.in);
                String player = keyboard.nextLine();
                this.currentPlayer = new Player(player, 0, 0, 0);

                for (String s:temp
                     ) {
                    writer.println(s);

                }

                writer.println(this.currentPlayer.toString());

                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("IException");
            }
        }

        public void playerStats(){
        try {


            File playerD = new File("src/PlayerData.txt");
            Scanner playerStat = new Scanner(playerD);
            while (playerStat.hasNextLine()){
                System.out.println(playerStat.nextLine());
            }
        } catch (IOException e){
            e.printStackTrace();
        }



          /*  System.out.println(players[0].getName());
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

           */
        }
//      b a _ a _

        public String getString(){ //ska ta inputs från spelet
           String s;
          s = "Welcome to Hangman";
          return s;
     }
      public int getInt(int min, int max){
       Scanner menuScanner = new Scanner(System.in);

       int x = menuScanner.nextInt();

         return x;
     }
       public char getAlpha(char a, char aa){

        return 0;
    }

    }

