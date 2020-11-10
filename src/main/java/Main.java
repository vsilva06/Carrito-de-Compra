
import java.util.Random;

public class Main {

    public static Random rNum = new Random();
    private int largo;

    public static void main(String[] args) {

        int largo = rNum.nextInt(21);
        int[] arreglo = new int[largo];

        llenarCarrito(arreglo);
        mostrarCarrito(arreglo);
        detalleCarrito(arreglo);
    }

    private static void detalleCarrito(int[] arreglo) {
        int precio = 500;
        int cantidad;
        for (int i = 0; i < arreglo.length; i++) {
            cantidad = arreglo[i];
            System.out.println("Producto  ["+i+"]   Cantidad:   "+cantidad+"    Subtotal: "+cantidad*precio);
            precio+=150;
        }
    }

    private static void mostrarCarrito(int[] arreglo) {
        int aux = 0;
        for (int i = 0; i < arreglo.length; i++) {
            aux+= arreglo[i];
            System.out.println("["+i+"] "+arreglo[i]+" ");

        }
        System.out.println("El carrito contiene "+aux+" Productos");
    }

    private static int[] llenarCarrito(int[] arreglo) {
        int nProductos;
        for (int i = 0; i < arreglo.length; i++) {
            nProductos = rNum.nextInt(16);
            arreglo[i] = nProductos;

        }
        return arreglo;
    }

}
