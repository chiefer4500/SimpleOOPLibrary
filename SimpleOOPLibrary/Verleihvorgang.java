/**
 * @author: <ahugaira> | <ahugaira@hof-unversity.de>
 */
public class Verleihvorgang {

    private Medium[] medien;
  private DatumZeit leihtermin ;
   private Datum rueckgabe;
   private Person entleihender;
    private Person verleihender;

    public DatumZeit getLeihtermin() {
        return leihtermin;
    }

    public Medium[] getMedien() {
        return medien;
    }

    public Datum getRueckgabe() {
        return rueckgabe;
    }

    public Person getEntleihender() {
        return entleihender;
    }

    public Person getVerleihender() {
        return verleihender;
    }

    public void setMedien(Medium[] medien) {
        this.medien = medien !=null ?medien:new Medium[0];
    }

    public void setLeihtermin(DatumZeit leihtermin) {
        this.leihtermin = leihtermin;
    }

    public void setRueckgabe(Datum rueckgabe) {
        this.rueckgabe = rueckgabe;
    }

    public void setEntleihender(Person entleihender) {
        this.entleihender = entleihender;
    }

    public void setVerleihender(Person verleihender) {
        this.verleihender = verleihender;
    }
    public void hinzu(Medium medie){
        Medium[] temp=new Medium[medien.length+1];
        for (int i=0;i<medien.length;i++){
            temp[i]=medien[i];
        }
        temp[temp.length-1]=medie;
        setMedien(temp);

    }
}
