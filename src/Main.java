import java.io.IOException;
import java.util.Scanner;





        public class Main {
            public static void main(String[] args) throws IOException {
                boolean playing =true;
                Scanner in = new Scanner(System.in);
                Menu menu = new Menu();
                System.out.println("Välkommen!");
                while (playing){

                    //kod här
                    menu.showGame();
                    Game.main();


                    System.out.println("vill du avsluta?");
                    String svar = in.next();
                    if(svar.equals("ja")){
                        playing = false;
                    }
                }

            }
        }




