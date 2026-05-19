/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaderestaurante;

/**
 *
 * @author CGDELL
 */
public class Postre extends Plato {
    private boolean conHelado;

    public Postre(String nombre, double precioBase, CategoriaComida categoria, boolean conHelado) {
        super(nombre, precioBase, categoria);
        this.conHelado = conHelado;
    }

    @Override
    public double calcularPrecio() {
        if (conHelado) {
            return getPrecioBase() * 1.15;
        }
        return getPrecioBase();
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Con helado: " + conHelado +
               ", Precio final: $" + calcularPrecio();
    }
}
