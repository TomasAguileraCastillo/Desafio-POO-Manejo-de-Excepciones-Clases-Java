package cl.desafioPOO.modelo;

/**
 * Nombre del Package :cl.desafioPOO
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : lunes 03 de junio de 2024
 * 03-06-2024 20:14
 * Nombre del Proyecto Desafio Manejo de Excepciones POO Java
 */
public class Tienda {
    //Atributos
    private Vendedor vendedor ;
    private Vehiculo vehiculo ;
    private int stock;

    //constructor Vacio
    public Tienda() {
    }

    //Constructor Completo de la Clase
    public Tienda(Vendedor vendedor, Vehiculo vehiculo, int stock) {
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.stock = stock;
    }

    //Metodos y Metodos

    public String existeStock(){
        return String.format("el estock es %d", stock);
    }
    /*
    public String existeStock2() {
        return "cantidad de stock es " + getStock();
    }
    */




    //Getters y Setters

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
