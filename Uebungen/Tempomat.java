
/**
 * Write a description of class Tempomat here.
 *
 * @author Christian Scheipppl  
 * @version 20.10.2017
 */
public class Tempomat
{
    // Datenfelder 
    private int geschwindigkeitInKmh;
    private int schrittweite; 
    private int maxKmh;
    private int minKmh;
    private boolean tempomatAn;
    // Konstruktor 
    public Tempomat(){
        this.geschwindigkeitInKmh = 0;
        this.schrittweite = 5;
        this.maxKmh = 200;
        this.minKmh = 20;
        this.tempomatAn = false;
    }

    public Tempomat(int geschwindigkeitInKmh){
        this.schrittweite = 5;
        this.maxKmh = 200;
        this.minKmh = 20;
        this.tempomatAn = false;
        if(geschwindigkeitInKmh>=0){
            this.geschwindigkeitInKmh = geschwindigkeitInKmh;
        } else {
            this.geschwindigkeitInKmh = 0;
            System.out.println("Geschwindigkeit auf 0 gesetzt");
        }
    }
    // Methoden
    public void setGeschwindigkeit(int geschwindigkeitInKmh){
        if(geschwindigkeitInKmh>=0){
            this.geschwindigkeitInKmh = geschwindigkeitInKmh;
        } else {
            System.out.println("Negative Beschleunigung nicht moeglich");
        }
    }

    public void togleTempomat(){
        if(tempomatAn == true){
            this.tempomatAn = false;
            System.out.println("Tempomat ausgeschalten");
        }else {
            this.tempomatAn = true; 
            System.out.println("Tempomat angeschalten");
            if(this.geschwindigkeitInKmh > this.maxKmh){
                this.geschwindigkeitInKmh = this.maxKmh;
            }
            if(this.geschwindigkeitInKmh < this.minKmh){
                this.geschwindigkeitInKmh = this.minKmh;
            }

        }
    }

    public void beschleunigen(){
        int neueGeschwindigkeit = this.geschwindigkeitInKmh + schrittweite;
        if(neueGeschwindigkeit > this.maxKmh){
            this.geschwindigkeitInKmh = this.maxKmh;
        } else {
            this.geschwindigkeitInKmh = neueGeschwindigkeit;
        }
    }

    public void verzögern(){
        int neueGeschwindigkeit = this.geschwindigkeitInKmh - schrittweite;
        if (tempomatAn == true){
            if(neueGeschwindigkeit < this.minKmh){
                this.geschwindigkeitInKmh = this.minKmh;
            } else {
                this.geschwindigkeitInKmh = neueGeschwindigkeit;
            }
        } else {
            this.geschwindigkeitInKmh = neueGeschwindigkeit;
        }
    }

    public void setSchrittweite(int schrittweite){
        this.schrittweite = schrittweite; 
    }
}
