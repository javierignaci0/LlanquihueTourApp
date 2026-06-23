package app;

import data.GestorDatos;
import model.Tour;
import service.TourService;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorDatos gestor = new GestorDatos();
        gestor.leerArchivo();

        ArrayList<Tour> tours = gestor.obtenerLista();
        TourService tourService = new TourService(tours);

        Scanner sc = new Scanner(System.in);

        System.out.println("Cantidad de tours: " + gestor.obtenerLista().size());
        System.out.println("LISTA DE TOURS");
        tourService.mostrarTours();

        //Bloque busqueda por nombre
        System.out.println("Ingrese un nombre para buscar: ");
        String nombre = sc.nextLine();
        ArrayList<Tour> encontrados = tourService.buscarTourNombre(nombre);

        if (encontrados.isEmpty()) {
            System.out.println("No se encontraron tours.");
        } else {
            System.out.println("Tours encontrados:");
            for (Tour tour : encontrados) {
                System.out.println(tour);
            }
        }
        System.out.println("Ingrese una categoria para buscar(Naturaleza, Gastronomia, Aventura, Cultural): ");
        String categoria = sc.nextLine();
        ArrayList<Tour> categoriaEncontrados = tourService.buscarTourCategoria(categoria);

        if (categoriaEncontrados.isEmpty()) {
            System.out.println("No hay tours encontrados de esa categoria.");
        } else {
            System.out.println("Tours encontrados: ");
            for (Tour tour : categoriaEncontrados) {
                System.out.println(tour);
            }
        }

        System.out.println("Ingrese un precio maximo para filtrar: ");
        double precioMaximo = sc.nextDouble();
        ArrayList<Tour> precioFiltrados = tourService.buscarTourPrecioMax(precioMaximo);

        if (precioFiltrados.isEmpty()) {
            System.out.println("No hay tours encontrados menores a ese precio");
        } else {
            System.out.println("Tours encontrados con precio menor a " + precioMaximo + ": ");
            for  (Tour tour : precioFiltrados) {
                System.out.println(tour);
            }
        }





        sc.close();


//        System.out.println("====LISTA DE ACTIVIDADES====");
//        for (Tour tour : gestor.obtenerLista()){
//            System.out.println(tour);
//        }

//        System.out.println("\n====LISTA DE TOURS====");
//        for (Tour tour : gestor.obtenerLista()){
//            if (tour.getNombre().contains("Tour")){
//                System.out.println(tour);
//            }
//        }
//        System.out.println("\n====LISTA PRECIOS IMPERDIBLES====");
//        for (Tour tour : gestor.obtenerLista()){
//            if (tour.getPrecio() < 30000){
//                System.out.println(tour);
//            }
//        }
    }
}