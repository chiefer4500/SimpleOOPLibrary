/**
 * @author: <ahugaira> | <ahugaira@hof-unversity.de>
 */
public class Zeitschrift extends Medium{
private int ausgabe;
private Datum datum;
private Person redakteur;


    Zeitschrift(String isbn, String titel, String author, Verlag verlag, Datum ershienen,int ausgabe,Datum datum,Person redakteur) {
        super(isbn, titel, author, verlag, ershienen);
        this.ausgabe=ausgabe;
        this.datum=datum;
        this.redakteur=redakteur;

    }

    public int getAusgabe() {
        return ausgabe;
    }

    public Datum getDatum() {
        return datum;
    }

    public Person getRedakteur() {
        return redakteur;
    }

    public void setAusgabe(int ausgabe) {
        this.ausgabe = ausgabe;
    }

    public void setDatum(Datum datum) {
        this.datum = datum;
    }

    public void setRedakteur(Person redakteur) {
        this.redakteur = redakteur;
    }
}
