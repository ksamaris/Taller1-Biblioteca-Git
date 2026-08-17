package com.mycompany.taller1.biblioteca.git;

/**
 *
 * @author kevin
 */

import com.mycompany.taller1.biblioteca.git.Libro;

public class Prestamo {
 
    private Cliente cliente;
    private Libro libro;
    private boolean activo;
 
    public Prestamo(Cliente cliente, Libro libro) {
        this.cliente = cliente;
        this.libro = libro;
        this.activo = true;
    }
 
    public Cliente getCliente() {
        return cliente;
    }
 
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
 
    public Libro getLibro() {
        return libro;
    }
 
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
 
    public boolean isActivo() {
        return activo;
    }
 
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
 
    @Override
    public String toString() {
        return "Cliente: " + cliente
                + ", Libro: " + libro
                + ", Estado: " + (activo ? "Activo" : "Devuelto");
    }
}
