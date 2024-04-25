package Aplicacion;

import java.util.Scanner;

import Coleccion.Flota;
import Embarcaciones.Acorazado;
import Embarcaciones.Submarino;

/**
 *
 * @author Samuel Vergara Martín
 */
public class AplicacionExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Flota flota = new Flota();
        int opcion, longitud, cantCaniones;
        String tipoBarco;
        boolean exito;

        System.out.println("Javier Bustamante esta viendo el código de este programa");
        System.out.println("Samuel Vergara esta añadiendo una nueva linea");
        //Bucle para el menu
        do{
            System.out.println("MENU DE OPCIONES \n" +
            "1. Insertar barco. \n" +
            "2. Eliminar barco. \n" +
            "3. Mostrar acorazados ordenados. \n" +
            "0. Salir del programa");
    
            System.out.print("Introduzca su opción: ");
            opcion = sc.nextInt();
            System.out.println("");

            //Opciones de ejecución
            switch (opcion) {
                //Insertar
                case 1:
                    System.out.print("Introduzca la longitud: ");
                    longitud = sc.nextInt();

                    System.out.print("Introduzca el tipo de barco (ac - acorazado // sub - submarino): ");
                    tipoBarco = sc.next();

                    System.out.print("Introduzca la cantidad de cañones: ");
                    cantCaniones = sc.nextInt();

                    //En función del tipo de barco se inserta
                    switch (tipoBarco) {
                        case "ac":
                            Acorazado acorazado = new Acorazado(longitud, cantCaniones);
                            exito = flota.insertarBarco(acorazado);

                            if (exito) {
                                System.out.println("El acorazado se ha insertado exitosamente.");
                            } else {
                                System.out.println("No se ha podido insetar el barco, compruebe que no haya introducido una longitud que ya exista.");
                            }
                            break;

                        case "sub":
                            Submarino submarino = new Submarino(longitud, cantCaniones);
                            exito = flota.insertarBarco(submarino);

                            if (exito) {
                                System.out.println("El submarino se ha insertado exitosamente.");
                            } else {
                                System.out.println("No se ha podido insetar el barco, compruebe que no haya introducido una longitud que ya exista.");
                            }
                            break;

                        default:
                            System.out.println("Por favor, introduza un tipo de embarcación válida (ac // sub).");
                            break;
                    }
                    break;
                //Eliminar
                case 2:
                    System.out.print("Introduzca la longitud de la embarcación a eliminar: ");
                    longitud = sc.nextInt();

                    System.out.print("Introduzca el tipo de barco (ac - acorazado // sub - submarino): ");
                    tipoBarco = sc.next();

                    System.out.print("Introduzca la cantidad de cañones: ");
                    cantCaniones = sc.nextInt();

                    switch (tipoBarco) {
                        case "ac":
                            Acorazado acorazado = new Acorazado(longitud, cantCaniones);
                            exito = flota.eliminarBarco(acorazado);

                            if (exito) {
                                System.out.println("El acorazado se ha eliminado exitosamente.");
                            } else {
                                System.out.println("No se ha podido borrar el barco, compruebe que la longitud exista.");
                            }
                            break;

                        case "sub":
                            Submarino submarino = new Submarino(longitud, cantCaniones);
                            exito = flota.eliminarBarco(submarino);

                            if (exito) {
                                System.out.println("El submarino se ha eliminado exitosamente.");
                            } else {
                                System.out.println("No se ha podido borrar el barco, compruebe que la longitud exista.");
                            }
                            break;

                        default:
                            System.out.println("Por favor, introduza un tipo de embarcación válida (ac // sub).");
                            break;
                    }
                    break;

                //Mostrar todos los datos de las embarcaciones
                case 3:
                    flota.mostrar();
                    break;

                //Salir del programa
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
            
                default:
                    System.out.println("Por favor introduzca una opción válida.");
                    break;
            }
        } while(opcion != 0);
    }
    
}
