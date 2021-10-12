public class Player {


        int rounds;
        int wins;
        int losses;
        String name;


        public Player(){
            this.name = "player";
            this.rounds = 10;
            this.wins = 1;
            this.losses = 1;
        }


        public Player (String name, int rounds, int wins, int losses){
            this.name = name;
            this.rounds = rounds;
            this.wins = wins;
            this.losses = losses;
        }


        @Override
        public String toString() {
            System.out.println("Antalet omgångar körda:" + this.rounds);
            System.out.println("Antalet omgångar vunna:" + this.wins);
            System.out.println("Antalet omgångar förlorade" + this.losses);
            return "Player{" +
                    "rounds =" + rounds +
                    ", wins" + wins +
                    ", losses'" + losses +'\'' +
                    '}';
        }


        public void gameplay(Player self){
            self.rounds = self.rounds +(this.wins + this.wins);
            System.out.println("Du har vunnit omgången.");

            self.rounds = self.rounds - (this.losses + this.losses);
            System.out.println("Du har förlorat omgången.");



        }




    }

