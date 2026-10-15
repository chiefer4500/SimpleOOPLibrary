/**
 * @author: <ahugaira> | <ahugaira@hof-unversity.de>
 */
public class Bibliothek {
  private   Verleihvorgang[] vorgaenge;
  private Medium[] bestand;

    public void setVorgaenge(Verleihvorgang[] vorgaenge) {
        this.vorgaenge = vorgaenge !=null ?vorgaenge:new Verleihvorgang[0];
    }

    public void setBestand(Medium[] bestand) {
        this.bestand = bestand !=null ?bestand:new Medium[0];
    }



    public void hinzu(Medium medium){
        Medium[] temp=new Medium[bestand.length+1];
        for (int i=0;i<bestand.length;i++){
            temp[i]=bestand[i];
        }
        temp[temp.length-1]=medium;
        setBestand(temp);

    }
    public void hinzu(Verleihvorgang vorgang){
        Verleihvorgang[] temp=new Verleihvorgang[vorgaenge.length+1];
        for (int i=0;i<vorgaenge.length;i++){
            temp[i]=vorgaenge[i];
        }
        temp[temp.length-1]=vorgang;
        setVorgaenge(temp);

    }




}
