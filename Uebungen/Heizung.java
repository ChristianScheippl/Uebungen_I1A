
/**
 * Write a description of class Heizung here.
 *
 * @author Christian Scheippl 
 * @version 18.10.2017
 */
public class Heizung{
    // Datenfelder
    private int temperatur;
    private int min;
    private int max; 
    private int schrittweite;
    
    // Konstruktor mit Variablen
    public Heizung (int min, int max){
        this.temperatur = 15;
        this.min = min;
        this.max = max;
        this.schrittweite = 5;
    }
    
    public void waermer(){
        int neueTemperatur = this.temperatur + this.schrittweite; 
        if (neueTemperatur <= this.max){
        this.temperatur = neueTemperatur;
        } else {
        this.temperatur = this.max;
        }
    }
    
    public void kühler(){
        int neueTemperatur = this.temperatur - this.schrittweite;
        if (neueTemperatur >= this.min){
        this.temperatur = neueTemperatur;
        } else {
            this.temperatur = this.min; 
        }
    }
    
    public void setzeSchrittweite(int neueSchrittweite){
        if (neueSchrittweite >0){
        this.schrittweite = neueSchrittweite;
        } else {
        System.out.println("Bitte keine negativen Schrittwerte angeben");
        }
    }
    // Getter
    public int getTemperatur(){
        return temperatur;
    }
}


