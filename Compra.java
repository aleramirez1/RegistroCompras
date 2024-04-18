package models;

import java.util.ArrayList;

public class Compra {
    private Usuario cliente;
    private ArrayList<DetalleCompra> detallesCompra;
    private MetodoPago metodoPago;
    private int gastoTotal;
    private int cambio;

    public Compra(Usuario cliente, ArrayList<DetalleCompra> detallesCompra, MetodoPago metodoPago) {
        this.cliente = cliente;
        this.detallesCompra = detallesCompra;
        this.metodoPago = metodoPago;
    }

    public void calcularGastoTotal() {
        int gastoTotal = 0;
        for (DetalleCompra detalle : detallesCompra) {
            gastoTotal += detalle.getSubtotal();
        }
        this.gastoTotal = gastoTotal;
    }

    public int getGastoTotal() {
        return gastoTotal;
    }

    public void calcularCambio() {
        this.cambio = metodoPago.getDineroAportado() - gastoTotal;
    }

    public int getCambio() {
        return cambio;
    }

    public void mostrarDetalleCompra() {
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Detalle de la compra:");
        for (DetalleCompra detalle : detallesCompra) {
            System.out.println("Productos: ");
            for (Producto producto : detalle.getProductos()) {
                System.out.println("- " + producto.getNombre());
            }
            System.out.println("Cantidad: " + detalle.getCantidad());
            System.out.println("Subtotal: " + detalle.getSubtotal());
        }
        System.out.println("Gasto total: " + gastoTotal);
        System.out.println("Cambio: " + cambio);
    }
}
