package model;

public class Tour {
    private int id;
    private String actividad;
    private double precio;

    public Tour(int id, String actividad, double precio) {
        this.id = id;
        this.actividad = actividad;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Actividad: " + actividad + ", Precio: " + precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
