
# LlanquihueTourMejorado

Proyecto de consola en Java para gestionar y buscar tours de la zona de Llanquihue y la Región de Los Lagos.

## Descripción

Este proyecto permite cargar tours desde un archivo `.txt`, guardarlos en un `ArrayList` y hacer búsquedas por nombre desde consola.

Fue desarrollado aplicando conceptos de Programación Orientada a Objetos, manejo de archivos, colecciones dinámicas y organización por paquetes.

## Funcionalidades

- Carga de datos desde archivo `.txt`
- Uso de `ArrayList<Tour>`
- Mostrar tours por consola
- Búsqueda por nombre
- Búsqueda flexible con `contains()`
- Comparación sin importar mayúsculas o minúsculas
- Tours con categoría y localidad

## Estructura del proyecto

```text
src/
├── app/
│   └── Main.java
├── data/
│   └── GestorDatos.java
├── model/
│   └── Tour.java
└── service/
    └── TourService.java

resources/
└── archivo.txt
```

## Clases principales

- **Main**: inicia el programa y conecta las demás clases.
- **GestorDatos**: lee el archivo y carga los tours.
- **Tour**: representa cada tour con sus datos.
- **TourService**: contiene la lógica de búsqueda y manejo de la lista.

## Atributos de Tour

Cada tour maneja datos como:
- id
- nombre
- precio
- categoría
- localidad

## Búsqueda

La búsqueda por nombre devuelve un `ArrayList<Tour>` con uno o varios resultados.

Ejemplo:
- si el usuario escribe `paseo`
- también puede encontrar `Paseo Lago`, `PASEO Frutillar` o `pAseO Puerto Varas`

Esto se hace normalizando el texto con minúsculas antes de comparar.

## Ejemplo de archivo

Ejemplo de datos en `archivo.txt`:

```txt
1;Paseo Frutillar;15000;Cultural;Frutillar
2;Tour Puerto Varas;18000;Urbano;Puerto Varas
3;Ruta Lago Llanquihue;22000;Naturaleza;Llanquihue
```

## Cómo ejecutar

1. Abrir el proyecto en IntelliJ IDEA
2. Verificar que el archivo `resources/archivo.txt` exista
3. Ejecutar la clase `Main`

## Objetivo

El objetivo del proyecto es practicar:
- clases y objetos
- encapsulación
- constructores
- `ArrayList`
- lectura de archivos
- búsquedas y filtros simples
- organización modular del código

## Autor

Javier R.