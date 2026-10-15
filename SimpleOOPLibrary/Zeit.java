/**
 * @author: <ahugaira> | <ahugaira@hof-unversity.de>
 */
    public class Zeit {
        private int stunde;
        private int minute;

        public Zeit (int stunde,int minute){
            this.minute=minute;
            this.stunde=stunde;
        }

        public int getStunde() {
            return stunde;
        }

        public int getMinute() {
            return minute;
        }

        public int getNormalisiert(){
            return stunde*3600+minute*60;
        }


    }

