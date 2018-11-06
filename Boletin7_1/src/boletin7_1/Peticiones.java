/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. V 0.1
 */
package boletin7_1;

import java.util.Scanner;

/**
 *
 * @author: Pablo Alonso Vazquez 
 * @version: 0.3
 * Controla las entradas de numeros por teclado
 * 
 */
public class Peticiones {

    private static Scanner sca = new Scanner(System.in);
    /**
             * Filtro que acepta numeros positivos, negativos y el cero.
             */
    public static final int NEGATIVO_CERO_POSITIVO = 111;
    /**
             * Filtro que acepta numeros positivos y el cero.
             */
    public static final int CERO_POSITIVO = 011;
    /**
             * Filtro que acepta numeros negativos y el cero.
             */
    public static final int NEGATIVO_CERO = 110;
    /**
             * Filtro que acepta numeros positivos.
             */
    public static final int POSITIVO = 001;
    
    /**
             * filtro que acepta numeros negativos.
             */
    public static final int NEGATIVO = 100;

    public static Double pedirNumeroDouble(String nombreDato) {
        Double res;
        do {
            System.out.print("Introduzca " + nombreDato + ": ");
            res = comprobarNumDouble(sca.nextLine());
            System.out.println();
        } while (res == null);  // pedira el dato hasta que e introduzca un numero valido.
        return res;

    }
    

    public static Double comprobarNumDouble(String numero) {
        Double x;
        try {   // lo parseo y si no es un numero valido asigna a x el valor de nulo.
            x = Double.parseDouble(numero);
        } catch (Exception ex) {
            x = null;

        }

        return x;

    }
    public static Short pedirNumeroShort(String nombreDato) {
        Short res;
        do {
            System.out.print("Introduzca " + nombreDato + ": ");
            res = comprobarNumShort(sca.nextLine());
            System.out.println();
        } while (res == null);  // pedira el dato hasta que e introduzca un numero valido.
        return res;

    }
    

    public static Short comprobarNumShort(String numero) {
        Short x;
        try {   // lo parseo y si no es un numero valido asigna a x el valor de nulo.
            x = Short.parseShort(numero);
        } catch (Exception ex) {
            x = null;

        }

        return x;

    }

    public static Integer pedirNumeroInteger(String nombreDato) {
        Integer res;
        do {
            System.out.print("Introduzca " + nombreDato + ": ");
            res = comprobarNumInteger(sca.nextLine());
            System.out.println();
        } while (res == null);  // pedira el dato hasta que e introduzca un numero valido.
        return res;

    }

    public static Integer comprobarNumInteger(String numero) {
        Integer x;
        try {   // lo parseo y si no es un numero valido asigna a x el valor de nulo.
            x = Integer.parseInt(numero);
        } catch (Exception ex) {
            x = null;

        }

        return x;

    }

    public static Integer pedirNumIntFiltrado(String nombreDato, Integer filtro) {
        Integer dev = null, temp;
        temp = pedirNumeroInteger(nombreDato);

        switch (filtro) {
            case NEGATIVO:
                if (temp < 0) {
                    dev = temp;
                }
                break;
            case POSITIVO:
                if (temp > 0) {
                    dev = temp;
                }
                break;
            case NEGATIVO_CERO:
                if (temp <= 0) {
                    dev = temp;
                }
                break;

            case CERO_POSITIVO:
                if (temp <= 0) {
                    dev = temp;
                }
                break;
            case NEGATIVO_CERO_POSITIVO: {
                dev = temp;

                break;
            }
        }
        
        
        return dev;

    }
    public static Double pedirNumDoubleFiltrado(String nombreDato, Integer filtro) {
        Double dev = null, temp;
       do{
        temp = pedirNumeroDouble(nombreDato);

        switch (filtro) {
            case NEGATIVO:
                if (temp < 0) {
                    dev = temp;
                }
                break;
            case POSITIVO:
                if (temp > 0) {
                    dev = temp;
                }
                break;
            case NEGATIVO_CERO:
                if (temp <= 0) {
                    dev = temp;
                }
                break;

            case CERO_POSITIVO:
                if (temp <= 0) {
                    dev = temp;
                }
                break;
            case NEGATIVO_CERO_POSITIVO: {
                dev = temp;

                break;
            }
        }
       }while(dev == null);
        
        
        return dev;

    }
}
