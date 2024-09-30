package com.uninorte;

import java.util.ArrayList;
import java.util.List;

public class Editorial {
    private ArrayList<Publicacion> publicaciones;

    public Editorial() {
        this.publicaciones = new ArrayList<>();
    }

    public void addColeccion(int id, String titulo) {
        this.publicaciones.add(new Coleccion(id,titulo));
    }

    public void addLibro(int id, String titulo, int idColeccion,  ArrayList<Persona> autores) {
        Coleccion coleccion = (Coleccion) this.publicaciones.get(idColeccion);
        Libro libro = new Libro(id,titulo,coleccion, autores);
        this.publicaciones.add(libro);
    }

    public int getNumeroColecciones() {
        int numeroColecciones = 0;
        for (Publicacion publicacion : publicaciones) {
            if (publicacion instanceof Coleccion) {
                numeroColecciones++;
            }
        }
        return numeroColecciones;
    }

    public int getNumeroLibros() {
        int numeroLibros = 0;
        for (Publicacion publicacion : publicaciones) {
            if (publicacion instanceof Libro) {
                numeroLibros++;
            }
        }
        return numeroLibros;
    }

    public int getNumeroLibrosEnColeccion(int idColeccion) {
        int numeroLibros = 0;
        for (Publicacion publicacion : publicaciones) {
            if (publicacion instanceof Libro) {
                Libro libro = (Libro) publicacion;
                if (libro.getColeccion().getId() == idColeccion) {
                    numeroLibros++;
                }
            }
        }
        return numeroLibros;
    }

    public void mostrarPublicaciones() {
        for (Publicacion publicacion : publicaciones) {
            System.out.println(publicacion);
        }
    }

    public static void main(String[] args) {
        // Create Editorial
        Editorial editorial = new Editorial();

    }
}
