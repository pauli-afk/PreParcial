/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaderestaurante;

public class Comida extends Plato {
    private boolean tieneGuarnicion;

    public Comida(String nombre, double precioBase, CategoriaComida categoria, boolean tieneGuarnicion) {
        super(nombre, precioBase, categoria);
        this.tieneGuarnicion = tieneGuarnicion;
    }

    @Override
    public double calcularPrecio() {
        if (tieneGuarnicion) {
            return getPrecioBase() * 1.10;
        }
        return getPrecioBase();
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Tiene guarnicion: " + tieneGuarnicion +
               ", Precio final: $" + calcularPrecio();
    }
}
