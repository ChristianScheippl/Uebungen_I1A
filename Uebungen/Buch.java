
/**
 * Beschreiben Sie hier die Klasse Buch.
 * 
 * @author Christian Scheippl 
 * @version 17.10.2017
 */
public class Buch {
    // Datenfelder 
    private String titel;
    private double preis;

    public Buch(){
        this.titel = ("kein Titel vorhanden");
        this.preis = 0;
    }
    
    public Buch(String titel){
        this.titel = titel;
        this.preis = 0;
    }
    
    public Buch(double preis){
        this.titel = ("kein Titel vorhanden");
        this.preis = preis;
    }
    
    public Buch(String titel, double preis){
        this.titel = titel; 
        this.preis = preis;
    }
    // Getter 
    public String getTitel(){
        return titel;
    }
    
    public double preis(){
        return preis;
    }
    // Setter 
    public void setTitel(String titel){
        this.titel = titel;
    }
    
    public void setPreis(double preis){
        this.preis = preis;
    }
    
    
}