package service;

import model.Tour;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TourService {

    //declaracion de atributo
    private ArrayList<Tour> listaTours;
    //constructor
    public TourService(ArrayList<Tour> tours) {
        this.listaTours = tours;
    }

    //filtro buscar tour por nombre
    public ArrayList<Tour> buscarTourNombre(String nombre) {
        ArrayList<Tour> resultados = new ArrayList<>();

        if (nombre == null || nombre.isBlank()) {
            return resultados;
        }

        for (Tour tour : listaTours) {
            if (tour.getNombre().toLowerCase().contains(nombre.toLowerCase().trim())) {
                resultados.add(tour);
            }
        }
        return resultados;
    }

    //filtro buscar por categoria
    public ArrayList<Tour> buscarTourCategoria(String categoria) {
        ArrayList<Tour> resultados = new ArrayList<>();

        if (categoria == null || categoria.isBlank()) {
            return resultados;
        }

        for (Tour tour : listaTours) {
            if (tour.getCategoria().toLowerCase().contains(categoria.toLowerCase().trim())) {
                resultados.add(tour);
            }
        }
        return resultados;
    }

    // Filtro por precio maximo
    public ArrayList<Tour> buscarTourPrecioMax(double precioMax) {
        ArrayList<Tour> listaResultado = new ArrayList<>();

        for (Tour tour : listaTours){
            if (tour.getPrecio() <= precioMax){
                listaResultado.add(tour);
            }
        }
        return listaResultado;
    }

    public ArrayList<Tour> buscarPorLocalidad(String localidad) {
        ArrayList<Tour> listaResultado = new ArrayList<>();

        for (Tour tour : listaTours){
            if (tour.getLocalidad().toLowerCase().contains(localidad.toLowerCase().trim())){
                listaResultado.add(tour);
            }
        }
        return listaResultado;
    }

    public void mostrarTours() {
        for (Tour tour : listaTours) {
            System.out.println(tour);
        }
    }
}
