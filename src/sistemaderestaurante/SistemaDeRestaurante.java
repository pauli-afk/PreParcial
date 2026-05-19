/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaderestaurante;

public class SistemaDeRestaurante {

    public static void main(String[] args) {

        Restaurante restaurante = new Restaurante("Sabores del Sur");

        Plato milanesa = new Comida("Milanesa", 8000, CategoriaComida.PRINCIPAL, true);
        Plato ensalada = new Comida("Ensalada Cesar", 6000, CategoriaComida.PRINCIPAL, false);
        Plato cerveza = new Bebida("Cerveza", 3000, CategoriaComida.BEBIDA, true);
        Plato helado = new Postre("Helado", 4000, CategoriaComida.POSTRE, true);

        restaurante.agregarPlato(milanesa);
        restaurante.agregarPlato(ensalada);
        restaurante.agregarPlato(cerveza);
        restaurante.agregarPlato(helado);

        Cliente maria = new Cliente("Maria", "maria@gmail.com", "1111-1111");
        Cliente juan = new Cliente("Juan", "juan@gmail.com", "2222-2222");

        restaurante.agregarCliente(maria);
        restaurante.agregarCliente(juan);

        Pedido pedido1 = new Pedido(maria, MetodoEntrega.LOCAL);
        pedido1.agregarPlato(milanesa);
        pedido1.agregarPlato(cerveza);
        pedido1.confirmar();
        pedido1.entregar();

        Pedido pedido2 = new Pedido(juan, MetodoEntrega.DELIVERY, 10);
        pedido2.agregarPlato(ensalada);
        pedido2.agregarPlato(cerveza);
        pedido2.agregarPlato(helado);
        pedido2.confirmar();
        pedido2.entregar();

        restaurante.registrarPedido(pedido1);
        restaurante.registrarPedido(pedido2);

        System.out.println("\n--- PEDIDOS REALIZADOS ---");
        restaurante.listarPedidos();

        System.out.println("--- TOTAL RECAUDADO ---");
        System.out.println("$" + restaurante.calcularRecaudacionTotal());
    }
    
}
