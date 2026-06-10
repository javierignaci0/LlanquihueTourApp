package ui;

import data.GestorDatos;
import model.Tour;

public class Main {
    public static void main(String[] args) {
        GestorDatos gestor = new GestorDatos();
        gestor.leerArchivo();

        System.out.println("====LISTA DE ACTIVIDADES====");
        for (Tour tour : gestor.obtenerLista()){
            System.out.println(tour);
        }
        System.out.println("\n====LISTA DE TOURS====");
        for (Tour tour : gestor.obtenerLista()){
            if (tour.getActividad().contains("Tour")){
                System.out.println(tour);
            }
        }
        System.out.println("\n====LISTA PRECIOS IMPERDIBLES====");
        for (Tour tour : gestor.obtenerLista()){
            if (tour.getPrecio() < 30000){
                System.out.println(tour);
            }
        }
    }
}