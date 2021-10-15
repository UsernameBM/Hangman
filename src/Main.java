import java.io.IOException;
import java.util.Scanner;





        public class Main {
            public static void main(String[] args) throws IOException {

                boolean playing =true;
                Scanner in = new Scanner(System.in);
                Menu menu = new Menu();
                while (playing){

                    //kod här

                    Menu.show();


                    System.out.println("vill du avsluta?");
                    String svar = in.next();
                    if(svar.equals("ja")){
                        playing = false;

               /* Player[] players = new Player [7];

                players[0] = new Player("Bill", 0, 0, 0);
                players[1] = new Player("Niklas", 0, 0, 0);
                players[2] = new Player("Lahoud", 0, 0, 0);
                players[3] = new Player("Sahra", 0, 0, 0);
                players[4] = new Player("Anuka", 0, 0, 0);
                players[5] = new Player("Ahmed", 0, 0, 0);
                players[6] = new Player("Henning", 0, 0, 0);

                */






                System.out.println("P1 set your name: ");
                System.out.print("> ");
               /* String player1Name = in.nextLine();
                players[0].setName(player1Name);

                System.out.println(players[0].getName());
                System.out.println(players[0].getRounds());
                System.out.println(players[0].getWins());
                System.out.println(players[0].getLosses());

                */


                    }
                }

            }
        }




