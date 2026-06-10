package data;

import model.Tour;

import java.io.*;
import java.util.ArrayList;

public class GestorDatos {
    private String rutaArchivo = "resources/archivo.txt";

    ArrayList<Tour> listaTours = new ArrayList<>();

    private ArrayList<Tour> ListaTours;

    public GestorDatos(){
        listaTours = new ArrayList<>();
    }

    public void agregarTour(Tour tour){
        listaTours.add(tour);
    }

    public void leerArchivo() {

        try(BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))){
            String linea;

            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(";");

                if (partes.length == 3) {
                    int id = Integer.parseInt(partes[0]);
                    String actividad =  partes[1];
                    double precio = Double.parseDouble(partes[2]);

                    Tour tour = new Tour(id, actividad, precio);
                    agregarTour(tour);
                }

            }
        }catch (IOException e) {
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
    }
    public ArrayList<Tour> obtenerLista(){
        return listaTours;
    }
}
