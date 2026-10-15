/**
 * @author: <ahugaira> | <ahugaira@hof-unversity.de>
 */
public class Person {

        private String name;
        private String vorname;
        private Adresse adresse;
        private Datum geburtsDatum;

    public Datum getGeburtsDatum() {
        return geburtsDatum;
    }

    Person(String name, String vorname, Adresse adresse){
            this.name=name;
            this.vorname=vorname;
            this.adresse=adresse;
        }

    public void setGeburtsDatum(Datum geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public Adresse getAdresse() {
        return adresse;
    }
}
