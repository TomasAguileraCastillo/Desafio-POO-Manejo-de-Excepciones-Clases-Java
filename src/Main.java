
import cl.desafioPOO.modelo.Cliente;
import cl.desafioPOO.modelo.LibroVenta;
import cl.desafioPOO.modelo.Vehiculo;

import java.util.Objects;
import java.util.Scanner;

/**
 * Nombre del Package :
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : lunes 03 de junio de 2024
 * 03-06-2024 17:03
 * Nombre del Proyecto Default (Template) Project
 */
public class Main {
    public static void main(String[] args) {
       menuVenta();
    }

    //Creacion de Metodo Menu
    public static void menuVenta() {
            Scanner sc = new Scanner(System.in);
            LibroVenta libro = new LibroVenta();
                System.out.println(" *Registro Venta de Vehiculos* ");
                System.out.print("\n");
                System.out.print("  Nombre de la Venta : ");
                String nombreV = sc.nextLine();
                libro.setNombreVenta(nombreV);
                System.out.print("  Fecha de Venta del Vehiculo : ");
                String fechav = sc.nextLine();
                //Carga de datos en la clase
                libro.setFechaVenta(fechav);
                libro.setNombreVenta(nombreV);
                libro.setFechaVenta(fechav);
                libro.guardarVenta();
    }
}