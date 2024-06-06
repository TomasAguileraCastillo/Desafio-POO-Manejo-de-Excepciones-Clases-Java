package cl.desafioPOO.modelo;

/**
 * Nombre del Package :cl.desafioPOO
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : lunes 03 de junio de 2024
 * 03-06-2024 20:19
 * Nombre del Proyecto Desafio Manejo de Excepciones POO Java
 */
public class Vendedor extends Persona {
    //Atributos de la Clase
    private String direccion;
    //Constructor Vacio
    public Vendedor() {
    }
    //Constructor completo de la clase

    public Vendedor(String rut, String nombre, int edad, String direccion) {
        super(rut, nombre, edad);
        this.direccion = direccion;
    }

    //Getters y Setters
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}