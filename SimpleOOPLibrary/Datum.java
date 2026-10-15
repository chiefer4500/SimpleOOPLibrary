
/**
 * @author: <ahugaira> | <ahugaira@hof-unversity.de>
 */
    public class Datum {
    private int tag;
    private int monat;

    public void setTag(int tag) {
        this.tag = tag;
    }

    public void setMonat(int monat) {
        this.monat = monat;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public int getTag() {
        return tag;
    }

    public int getMonat() {
        return monat;
    }

    public int getJahr() {
        return jahr;
    }

    private int jahr;
    public Datum (int tag,int monat,int jahr){
        this.tag=tag;
        this.monat=monat;
        this.jahr=jahr;
    }
}
