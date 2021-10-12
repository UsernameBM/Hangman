import java.util.Scanner;





        public class Main {
            public static void main(String[] args) {
                boolean playing =true;
                Scanner in = new Scanner(System.in);

                System.out.println("Välkommen!");
                while (playing){

                    //kod här
                    Game.main();


                    System.out.println("vill du avsluta?");
                    String svar = in.next();
                    if(svar.equals("ja")){
                        playing = false;
                    }
                }

            }
        }




