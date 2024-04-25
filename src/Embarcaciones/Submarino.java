package Embarcaciones;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Submarino extends Barco{
    //Creo el codigo de submarino como string para así concatenarle su número
    private static String codSubmarino = "Sub-";
    private static int numSubmarino = 1;
    private int cantCaniones, longPeriscopio;

    //Constructor
    public Submarino(int longitud, int cantCaniones) {
        super(codSubmarino, numSubmarino, longitud);
        numSubmarino++;

        this.cantCaniones = cantCaniones;
        this.longPeriscopio = (int) longitud/10;
    }

    //Getters y setters
    public static String getCodSubmarino() {
        return codSubmarino;
    }

    public static int getNumSubmarino() {
        return numSubmarino;
    }

    public static void setNumSubmarino(int numSubmarino) {
        Submarino.numSubmarino = numSubmarino;
    }

    public int getCantCaniones() {
        return cantCaniones;
    }

    public void setCantCaniones(int cantCaniones) {
        this.cantCaniones = cantCaniones;
    }

    public int getLongPeriscopio() {
        return longPeriscopio;
    }

    public void setLongPeriscopio(int longPeriscopio) {
        this.longPeriscopio = longPeriscopio;
    }
    
    //toString específico de submarino
    @Override
    public String toString(){
        return getClass().getSimpleName() + "\n Código: " + super.getCodigo() + "\n Longitud: " + super.getLongitud() + "\n Nº de cañones: " + cantCaniones + "\n Longitud periscopio: " + longPeriscopio + "\n";
    }
}
