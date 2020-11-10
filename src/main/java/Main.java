
import java.util.Random;

public class Main {

    public static Random rNum = new Random();
    private int largo;

    public static void main(String[] args) {

        int largo = rNum.nextInt(21);
        int[] carrito = new int[largo];
        int total;

        llenarCarrito(carrito);
        mostrarCarrito(carrito);
        total = totalCompra(carrito);

        detalleCarrito(carrito, total);
    }

    private static int totalCompra(int[] carrito) {
        int total = 0;
        int precio = 500;
        for (int i = 0; i < carrito.length; i++) {
            total += carrito[i] * precio;
            precio += 150;
        }
        return total;
    }

    private static void detalleCarrito(int[] carrito, int total) {
        int precio = 500;
        for (int i = 0; i < carrito.length; i++) {

            System.out.println("Producto  [" + i + "]   Cantidad:   " + carrito[i] + "    Subtotal: $" + carrito[i] * precio);
            precio += 150;

        }
        System.out.println("Total de la compra: $" + total);
    }

    private static void mostrarCarrito(int[] carrito) {
        int aux = 0;
        for (int i = 0; i < carrito.length; i++) {
            aux += carrito[i];
            System.out.println("[" + i + "] " + carrito[i] + " ");

        }
        System.out.println("\nEl carrito contiene " + aux + " Productos\n");
    }

    private static int[] llenarCarrito(int[] carrito) {
        int nProductos;
        for (int i = 0; i < carrito.length; i++) {
            nProductos = rNum.nextInt(16);
            carrito[i] = nProductos;

        }
        return carrito;
    }

}
