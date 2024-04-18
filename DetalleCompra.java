package models;
import java.util.ArrayList;

public class DetalleCompra {
    private ArrayList<Producto> productos;
    private int cantidad;
    private int subtotal;

    public DetalleCompra(ArrayList<Producto> productos, int cantidad, int subtotal) {
        this.productos = productos;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

}