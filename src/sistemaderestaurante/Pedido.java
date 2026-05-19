/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaderestaurante;

import java.util.ArrayList;

public class Pedido implements Descontable, Entregable {
    private Cliente cliente;
    private ArrayList<Plato> platos;
    private MetodoEntrega metodoEntrega;
    private boolean confirmado;
    private double descuento;

    public Pedido(Cliente cliente, MetodoEntrega metodoEntrega) {
        this.cliente = cliente;
        this.metodoEntrega = metodoEntrega;
        this.platos = new ArrayList<>();
        this.confirmado = false;
        this.descuento = 0;
    }

    public Pedido(Cliente cliente, MetodoEntrega metodoEntrega, double descuento) {
        this.cliente = cliente;
        this.metodoEntrega = metodoEntrega;
        this.platos = new ArrayList<>();
        this.confirmado = false;
        this.descuento = descuento;
    }

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public void confirmar() {
        if (confirmado) {
            System.out.println("El pedido ya fue confirmado.");
        } else if (platos.isEmpty()) {
            System.out.println("No se puede confirmar un pedido sin platos.");
        } else {
            confirmado = true;
            System.out.println("Pedido confirmado.");
        }
    }

    public boolean estaConfirmado() {
        return confirmado;
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        double total = 0;

        for (Plato plato : platos) {
            total += plato.calcularPrecio();
        }

        return total - (total * porcentaje / 100);
    }

    public double calcularTotal() {
        double total = 0;

        for (Plato plato : platos) {
            total += plato.calcularPrecio();
        }

        if (platos.size() > 2 && descuento > 0) {
            total = aplicarDescuento(descuento);
        }

        return total;
    }

    @Override
    public void entregar() {
        if (metodoEntrega == MetodoEntrega.DELIVERY) {
            System.out.println("Pedido en camino hacia " + cliente.getNombre());
        } else {
            System.out.println("Pedido listo para servir en mesa.");
        }
    }

    @Override
    public String toString() {
        String texto = "Pedido de: " + cliente.getNombre() + "\n";
        texto += "Metodo de entrega: " + metodoEntrega + "\n";
        texto += "Confirmado: " + confirmado + "\n";
        texto += "Platos:\n";

        for (Plato plato : platos) {
            texto += "- " + plato + "\n";
        }

        texto += "Total: $" + calcularTotal() + "\n";
        return texto;
    }
}
