package Coleccion;

import Embarcaciones.Barco;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Flota {
    Barco[] flota;
    private int longitudFlota;

    //Crea un array de longitud aleatoria (10-20)
    public Flota() {
        longitudFlota = (int) (Math.random()*11+10);
        flota = new Barco[10];
    }

    //Cuenta el número de elementos y se para a llegar a los elementos vacios
    public int numeroElementos(){
        int res = 0;

        for(int i = 0; i < flota.length; i++){
            if (flota[i] != null) {
                res++;
            }
        }

        return res;
    }

    //Inserta barco
    public boolean insertarBarco(Barco b){
        boolean exito = true;

        //Comprueba si la embarcación ya existe, se para si la encuentra o llega a un espacio vacio (null)
        for(int i = 0; i < flota.length && exito == true && flota[i] != null; i++){
            if (flota[i].getLongitud() == b.getLongitud() && flota[i].getClass().getSimpleName() == b.getClass().getSimpleName()) {
                exito = false;
            }
        }

        //En caso de que no exista se inserta en la tabla
        if (exito == true) {
            flota[this.numeroElementos()] = b;
        }

        return exito;
    }

    //Elimina barco
    public boolean eliminarBarco(Barco b){
        //Creo un array auxiliar
        boolean exito = false;
        Barco[] aux = new Barco[flota.length];

        //Busco el barco, en caso de no existir devuelve false, si existe lo borra y para la iteración
        for(int i = 0; i < flota.length && exito == false && flota[i] != null; i++){
            if (flota[i].getLongitud() == b.getLongitud() && flota[i].getClass().getSimpleName() == b.getClass().getSimpleName()) {
                //Uso el array auxiliar para copiar encima del elemento borrado, así no quedan huecos en blanco (null) en medio del array
                System.arraycopy(flota, 0, aux, 0, i);
                System.arraycopy(flota, i + 1, aux, i, this.numeroElementos() - i - 1);
                flota = aux;

                exito = true;
            }
        }

        return exito;
    }

    //Devuelve el array de flota
    public Barco[] arrayBarcos(){
        Barco[] aux = new Barco[numeroElementos()];

        for(int i = 0; i < aux.length; i++){
            aux[i] = flota[i];
        }

        return aux;
    }

    //Tira de los métodos toString de cada clase para mostrar todo el contenido del array
    public void mostrar(){
        for(int i = 0; i < flota.length && flota[i] != null; i++){
            System.out.println(flota[i]);
        }
    }
}
