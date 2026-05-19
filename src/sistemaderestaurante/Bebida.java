/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaderestaurante;

/**
 *
 * @author CGDELL
 */
public class Bebida extends Plato {
    private boolean esAlcoholica;

    public Bebida(String nombre, double precioBase, CategoriaComida categoria, boolean esAlcoholica) {
        super(nombre, precioBase, categoria);
        this.esAlcoholica = esAlcoholica;
    }

    @Override
    public double calcularPrecio() {
        if (esAlcoholica) {
            return getPrecioBase() * 1.20;
        }
        return getPrecioBase();
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Es alcoholica: " + esAlcoholica +
               ", Precio final: $" + calcularPrecio();
    }
}
