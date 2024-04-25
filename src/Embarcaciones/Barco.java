package Embarcaciones;

/**
 *
 * @author Samuel Vergara Martín
 */
public abstract class Barco {
    private String codigo;
    private int longitud;

    //Constructor
    public Barco(String cod, int numBarco, int longitud) {
        this.codigo = cod + numBarco;
        this.longitud = longitud;
    }

    //Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    //toString general para superclase barco
    @Override
    public String toString(){
        return "Codigo: " + codigo + "\nLongitud: " + longitud;
    }
}
