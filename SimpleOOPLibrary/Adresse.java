/**
 * @author: <ahugaira> | <ahugaira@hof-unversity.de>
 */
public class Adresse {
    private String strasse;
    private String hnr;
    private String plz;
    private String ort;
    private String telefon;
    Adresse(String strasse,String hnr,String plz,String ort,String telefon){

        this.strasse=strasse;
        this.hnr=hnr;
        this.plz=plz;
        this.ort=ort;
        this.telefon=telefon;
    }

    public String getStrasse() {
        return strasse;
    }

    public String getHnr() {
        return hnr;
    }

    public String getPlz() {
        return plz;
    }

    public String getOrt() {
        return ort;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public void setHnr(String hnr) {
        this.hnr = hnr;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
