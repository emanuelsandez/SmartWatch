
/*
 *  * Proyecto que permite calcular el promedio de pasos de una persona entre un rango de valores
 */
package cl.eash;
import java.util.ArrayList;
import java.util.List;


public class SmartWatch {
    public static void main(String[] args) {
        int[] pasos = new int[args.length];
        for (int i = 0; i < args.length; i++) {
        	pasos[i] = Integer.parseInt(args[i]);
        }
        //Declaracion de vector que permite guardar los valores ingresados por consola
        Integer[] pasosFiltrados = clearSteps(pasos);
        double promedio = promedio(pasosFiltrados);
        System.out.println("El promedio de pasos es: " + promedio);
    }

    public static Integer[] clearSteps(int[] pasos) {
    	//Metodo que permite realizar el filtro de los pasos, eliminando los datos que no estan en ese rango
        List<Integer> pasosFiltradosList = new ArrayList<>();        
        //Declaracion de nuevo arreglo con los datos filtrados
        for (int i = 0; i < pasos.length; i++) {
            if (pasos[i] >= 200 && pasos[i] <= 100000) {
            	pasosFiltradosList.add(pasos[i]);
            }
        }
        Integer[] pasosFiltrados = new Integer[pasosFiltradosList.size()];
        pasosFiltrados = pasosFiltradosList.toArray(pasosFiltrados);
        return pasosFiltrados;
    }

    public static double promedio(Integer[] pasosFiltrados) {
    	//Metodo que permite calcular el promedio de los valores
        int totalPasos = 0;
        //declaracion de variable acumulador
        for (int i = 0; i < pasosFiltrados.length; i++) {
        //Ciclo For para llenar acumulado
        	totalPasos += pasosFiltrados[i];        
        }
        double promedio = (double) totalPasos / pasosFiltrados.length;
        return promedio;
    }
}
