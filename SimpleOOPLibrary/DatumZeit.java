/**
 * @author: <ahugaira> | <ahugaira@hof-unversity.de>
 */

    public class DatumZeit {
        private Datum datum;
        private Zeit zeit;
        DatumZeit(Datum datum,Zeit zeit){
            this.datum=datum;
            this.zeit=zeit;

        }
        public  int getTag(){
            return datum.getTag();
        } public  int getMonat(){
            return datum.getMonat();
        }
        public  int getJahr(){
            return datum.getJahr();
        }
        public int getStunde(){
            return zeit.getStunde();
        }public int getMinute(){
            return zeit.getMinute();
        }

    }


