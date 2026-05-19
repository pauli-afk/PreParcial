/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaderestaurante;

/**
 *
 * @author CGDELL
 */
public abstract class Plato {
    private String nombre;
    private double precioBase;
    private CategoriaComida categoria;

    public Plato() {
        this.nombre = "";
        this.precioBase = 0;
        this.categoria = CategoriaComida.PRINCIPAL;
    }

    public Plato(String nombre, double precioBase, CategoriaComida categoria) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public CategoriaComida getCategoria() {
        return categoria;
    }

    public abstract double calcularPrecio();

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               ", Precio base: $" + precioBase +
               ", Categoria: " + categoria;
    }
}