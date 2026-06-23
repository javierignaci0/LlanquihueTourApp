package data;

import model.Tour;
import java.io.*;
import java.util.ArrayList;

public class GestorDatos {
    private String rutaArchivo = "resources/archivo.txt";

    private ArrayList<Tour> listaTours;

    public GestorDatos(){
        listaTours = new ArrayList<>();
    }

    public void agregarTour(Tour tour){
        listaTours.add(tour);
    }

    // metodo que lee el archivo y sobreescribe el .txt en un arraylist
    public void leerArchivo() {
        try(BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))){
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(";");

                if (partes.length == 5) {
                    int id = Integer.parseInt(partes[0]);
                    String nombre =  partes[1];
                    double precio = Double.parseDouble(partes[2]);
                    String categoria = partes[3];
                    String localidad = partes[4];

                    Tour tour = new Tour(id, nombre, precio, categoria, localidad);
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
