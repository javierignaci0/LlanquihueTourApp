
Proyecto LlanquihueTourApp

Aplicacion de consola en Java para leer informacion de tours desde un archivo de texto y mostrarla en pantalla.

Este proyecto carga datos de tours desde un archivo `archivo.txt`, los convierte en objetos `Tour` y los guarda en una lista para luego mostrarlos en consola.
Cada linea del archivo debe tener este formato:

id;actividad;precio

Funciones:
- Lee un archivo de texto ubicado en `resources/archivo.txt`.
- Separa cada línea usando `;`.
- Convierte los datos en objetos `Tour`.
- Guarda los tours en una lista.
- Muestra la lista en consola.

Clases:
- Tour:
    Representa un tour con los siguientes atributos:
    -id
    -actividad
    -precio

- GestorDatos:
    Se encarga de:
  - almacenar la lista de tours,
  - leer el archivo de texto,
  - crear los objetos Tour,
  - agregar los tours a la lista.

- Main
Es el punto de entrada del programa. Crea el gestor, carga los datos y muestra la lista en consola.

Ejemplo para ejecutar la clase Main:


public class Main {
    public static void main(String[] args) {
        GestorDatos gestor = new GestorDatos();
        gestor.leerArchivo();

        System.out.println("Lista de tours:");
        for (Tour tour : gestor.getListaTours()) {
            System.out.println(tour);
        }
    }
}
