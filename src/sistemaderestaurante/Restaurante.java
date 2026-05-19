/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaderestaurante;

import java.util.ArrayList;

public class Restaurante {
    private String nombre;
    private ArrayList<Plato> platosDisponibles;
    private ArrayList<Cliente> clientes;
    private ArrayList<Pedido> pedidos;

    public Restaurante() {
        this.nombre = "";
        this.platosDisponibles = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.platosDisponibles = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public void agregarPlato(Plato plato) {
        platosDisponibles.add(plato);
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void registrarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public Cliente buscarClientePorNombre(String nombre) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equals(nombre)) {
                return cliente;
            }
        }
        return null;
    }

    public void listarPedidos() {
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }

    public double calcularRecaudacionTotal() {
        double total = 0;

        for (Pedido pedido : pedidos) {
            if (pedido.estaConfirmado()) {
                total += pedido.calcularTotal();
            }
        }

        return total;
    }

    @Override
    public String toString() {
        return "Restaurante: " + nombre;
    }
}