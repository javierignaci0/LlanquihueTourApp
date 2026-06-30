package data;

import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

public class GestorServicios {

    public void mostrarServicios() {
        RutaGastronomica ruta1 = new RutaGastronomica("Sabores del Sur", 3.5, 4);
        RutaGastronomica ruta2 = new RutaGastronomica("Ruta de Postres", 2.0, 3);

        PaseoLacustre paseo1 = new PaseoLacustre("Lago Llanquihue", 1.5, "Catamarán");
        PaseoLacustre paseo2 = new PaseoLacustre("Atardecer en el lago", 2.0, "Lancha");

        ExcursionCultural excursion1 = new ExcursionCultural("Museos de la zona", 4.0, "Museo Colonial");
        ExcursionCultural excursion2 = new ExcursionCultural("Ruta patrimonial", 5.0, "Iglesia histórica");

        System.out.println(ruta1);
        System.out.println(ruta2);
        System.out.println(paseo1);
        System.out.println(paseo2);
        System.out.println(excursion1);
        System.out.println(excursion2);
    }
}