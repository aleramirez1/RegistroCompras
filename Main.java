import models.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Buenas ingrese el nombre del cliente:");
        String nombreCliente = scanner.nextLine();
        Usuario cliente = new Usuario(nombreCliente);

        ArrayList<Producto> productos = new ArrayList<>();
        int totalPrecioVenta = 0;

        while (true) {
            System.out.println("Ingrese otro producto o escriba fin para terminar la lista:");
            String nombreProducto = scanner.nextLine();
            if (nombreProducto.equalsIgnoreCase("fin")) {
                break;
            }
            System.out.println("Ingrese el precio del producto que eligio:");
            int precioProducto = Integer.parseInt(scanner.nextLine());
            System.out.println("Ingrese la cantidad del producto que eligio:");
            int cantidadProducto = Integer.parseInt(scanner.nextLine());

            Producto producto = new Producto(nombreProducto, precioProducto);
            productos.add(producto);
            totalPrecioVenta += precioProducto * cantidadProducto;
        }
        System.out.println("Ingrese el método de pago:");
        String metodoPagoNombre = scanner.nextLine();
        System.out.println("Ingrese la cantidad con la que pagará: ");
        int montoPagado = Integer.parseInt(scanner.nextLine());
        MetodoPago metodoPago = new MetodoPago(metodoPagoNombre, montoPagado);

        ArrayList<DetalleCompra> detallesCompra = new ArrayList<>();
        for (Producto producto : productos) {
            System.out.println("Ingrese la cantidad de " + producto.getNombre() + " comprada:");
            int cantidad = Integer.parseInt(scanner.nextLine());
            detallesCompra.add(new DetalleCompra(productos, cantidad, producto.getPrecioVenta() * cantidad));
        }
        Compra compra = new Compra(cliente, detallesCompra, metodoPago);
        compra.calcularGastoTotal();
        compra.calcularCambio();
        compra.mostrarDetalleCompra();

        scanner.close();
    }
}
