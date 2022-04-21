package es.maestredam.geometria;

/**
 *
 * @author illes
 */
public class Circulo {
    
    
    private static int COLOR_DEF= 0x000000;
    private static double RADIO_DEF=10.0;
    
    private double radio;
    private int colorRGB;
    //Si tengo estos atributos debo inicializarlos en el constructor. Y si se modifica el radio, habrá que recalcularlos.
    //Por otro lado, tendría getArea y getLongitud que solo
    private double area;
    private double longitud;
    
    public Circulo(double radio){
        this.radio=radio;
        this.colorRGB=COLOR_DEF;
    }
    public Circulo(){
        this(RADIO_DEF);
    }
    /**
     * Constructor de copia
     * @param objeto  el objeto que copiar
     */
    public Circulo(Circulo objeto){
        this.radio=objeto.radio;
        this.colorRGB=objeto.colorRGB;  
    }
     
    
    /**
     * 
     * @param radio del circulo
     * @return el area del circulo
     */
    public double obtenerArea(double radio){
        area=Math.PI*(radio^2);
    }
    
    /**
     * 
     * @param radio del circulo
     * @return 
     */
    public double obtenerLongitud(double radio){
    
    }
    
    /**
     * 
     * @param porcentaje
     * @return 
     */
    public double escalar(int porcentaje){
    
    }
}
