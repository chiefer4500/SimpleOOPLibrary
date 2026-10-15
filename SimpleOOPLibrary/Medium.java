/**
 * @author: <ahugaira> | <ahugaira@hof-unversity.de>
 */
public class Medium implements Vergleichbar{


    private String isbn;
    private  String titel;
    private String author;
    Verlag verlag;
    Datum erschienen;
    public  Medium (String isbn, String title,String author,Verlag verlag,Datum erschienen){
        this.isbn=isbn;
        this.titel=titel;
        this.author=author;
        this.verlag=verlag;
        this.erschienen=erschienen;
    }



    public int vergleiche(String titel) {
        return 0;
    }


}
