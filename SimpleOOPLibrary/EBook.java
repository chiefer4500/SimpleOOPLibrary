/**
 * @author: <ahugaira> | <ahugaira@hof-unversity.de>
 */
public class EBook extends Medium {
  private String quelle;
 private String lizenz;

    EBook(String isbn,String titel,String author,Verlag verlag,Datum ershienen,String quelle,String lizenz){
        super(isbn,titel,author,verlag,ershienen);
        this.lizenz=lizenz;
        this.quelle=quelle;

    }

    public String getLizenz() {
        return lizenz;
    }

    public String getQuelle() {
        return quelle;
    }

    public void setQuelle(String quelle) {
        this.quelle = quelle;
    }

    public void setLizenz(String lizenz) {
        this.lizenz = lizenz;
    }
}
