package Embarcaciones;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Acorazado extends Barco{
    //Creo el codigo de acorazado como string para así concatenarle su número
    private static String codAcorazado = "Ac-";
    private static int numAcorazado = 1;
    private int cantCaniones;

    //Constructor
    public Acorazado(int longitud, int cantCaniones) {
        super(codAcorazado, numAcorazado, longitud);
        numAcorazado++;

        this.cantCaniones = cantCaniones;
    }

    //Getters y setters
    public static String getCodAcorazado() {
        return codAcorazado;
    }

    public static int getNumAcorazado() {
        return numAcorazado;
    }

    public static void setNumAcorazado(int numAcorazado) {
        Acorazado.numAcorazado = numAcorazado;
    }

    public int getCantCaniones() {
        return cantCaniones;
    }

    public void setCantCaniones(int cantCaniones) {
        this.cantCaniones = cantCaniones;
    }

    //toString específico de acorazado
    @Override
    public String toString(){
        return getClass().getSimpleName() + "\n Código: " + super.getCodigo() + "\n Longitud: " + super.getLongitud() + "\n Nº de cañones: " + cantCaniones + "\n";
    }
}
