import java.util.Scanner;

public class Game {

        public static void main() {
            Hangman game = new Hangman();

            int asterisk = 1;
            int count = 1;
           // while (count < 7 && asterisk("*")) {
                System.out.println("Guess any letter in the word");
                System.out.println(asterisk);
                String guess=  getString();


                 hang(guess);
           // }

        }

        public static String getString(){
            Scanner sc = new Scanner(System.in);
            String s= sc.next();
            return  s;


        }


        private static void hang(String guess) {

            final String guess1 = guess;
            final String guess2 = guess;
            final String guesses;
            {
                String newasterisk = "";
                CharSequence word = null;
                for (int i = 0; i < word.length(); i++) {
                    String asterisk = null;
                    if (word.charAt(i) == guess.charAt(0)) {
                        newasterisk += guess.charAt(0);
                    } else if (asterisk.charAt(i) != '*') {
                        newasterisk += word.charAt(i);
                    } else {
                        newasterisk += "*";

                        Scanner inputReader = new Scanner(System.in);
                        String input = "";
                        String mastery = "Newton";
                        mastery = mastery.toUpperCase();
                        //say string length
                        System.out.println(" The hangman word is  " + "letters");
                        //do {
                        //     boolean playing = true;
                        //} while() //kolla
                        //fråga användare om de vill gissa bokstav
                        // System.out.println("Press L to guess a letter\n press w to guess word\n press Q to quit");
                        input = Character.toString(inputReader.nextLine().toUpperCase().charAt(0));
                        switch (input) {
                            case "L":
                                System.out.println("Please type the letter:  ");
                                input = Character.toString(inputReader.nextLine().toUpperCase().charAt(0));
                                System.out.println();
                                if (mastery.contains(input)) {
                                    int numberOfLetters = 0;
                                    for (int a = 0; a < mastery.length(); a++) {
                                        if (mastery.substring(i, i + 1).equals(input)) {
                                            numberOfLetters++;
                                            System.out.println("There are " + numberOfLetters + " " + input + " (s)");

                                        }
                                    }


                                }
                        }
                    }
                }
            }
        }


    }






