public class Player {





        private int rounds;
        private int wins;
        private int losses;
        private String name;




        public Player (String name, int rounds, int wins, int losses){
            this.name = name;
            this.rounds = rounds;
            this.wins = wins;
            this.losses = losses;
        }

        public int getRounds() {
            return rounds;
        }

        public void setRounds(int rounds) {
            this.rounds = rounds;
        }

        public int getWins() {
            return wins;
        }

        public void setWins(int wins) {
            this.wins = wins;
        }

        public int getLosses() {
            return losses;
        }

        public void setLosses(int losses) {
            this.losses = losses;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            System.out.println("Namn på spelare: " + this.name);
            System.out.println("Antalet omgångar körda: " + this.rounds);
            System.out.println("Antalet omgångar vunna: " + this.wins);
            System.out.println("Antalet omgångar förlorade " + this.losses);
            return "Player{" + name +
                    "rounds =" + rounds +
                    ", wins" + wins +
                    ", losses'" + losses +'\'' +
            '}';
        }




    }

