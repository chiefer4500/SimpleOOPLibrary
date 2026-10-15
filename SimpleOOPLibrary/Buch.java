/**
 * @author: <ahugaira> | <ahugaira@hof-unversity.de>
 */
public class Buch extends Medium {
    enum Einband{ LEINEN,
            HALBLEINEN,
            PAPPBANDE,
            KARTON
    }
    private Einband einband;
    private String zustand;
    private String bindung;
    private int auflage;

    Buch(String isbn,String titel,String author,Verlag verlag,Datum ershienen,Einband einband,String zustand,String bindung,int auflage){
        super(isbn,titel,author,verlag,ershienen);
        this.einband=einband;
        this.einband=einband;
        this.auflage=auflage;
        this.bindung=bindung;
    }
    public Einband getEinband() {
        return einband;
    }

    public String getZustand() {
        return zustand;
    }

    public String getBindung() {
        return bindung;
    }

    public int getAuflage() {
        return auflage;
    }

    public void setEinband(Einband einband) {
        this.einband = einband;
    }

    public void setZustand(String zustand) {
        this.zustand = zustand;
    }

    public void setBindung(String bindung) {
        this.bindung = bindung;
    }

    public void setAuflage(int auflage) {
        this.auflage = auflage;
    }


}
