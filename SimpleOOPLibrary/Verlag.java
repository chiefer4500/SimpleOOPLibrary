/**
 * @author: <ahugaira> | <ahugaira@hof-unversity.de>
 */
public class Verlag {

    private String name;
    private int lieferantennummer;
    private  Adresse adresse;

    public String getName() {
        return name;
    }

    public int getLieferantennummer() {
        return lieferantennummer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLieferantennummer(int lieferantennummer) {
        this.lieferantennummer = lieferantennummer;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public Verlag(String name, int lieferantennummer, Adresse adresse){
        this.name=name;
        this.lieferantennummer=lieferantennummer;
        this.adresse=adresse;

    }






}
