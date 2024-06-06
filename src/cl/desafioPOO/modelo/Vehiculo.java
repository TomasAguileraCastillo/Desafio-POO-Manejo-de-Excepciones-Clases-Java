package cl.desafioPOO.modelo;

/**
 * Nombre del Package :cl.desafioPOO
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : lunes 03 de junio de 2024
 * 03-06-2024 20:15
 * Nombre del Proyecto Desafio Manejo de Excepciones POO Java
 */
public class Vehiculo {
    //Atributos
    private String color;
    private String patente;

    //Constructos Vacio
    public Vehiculo() {
    }

    //Constructor Completo
    public Vehiculo(String color, String patente) {
        this.color = color;
        this.patente = patente;
    }

    //Getters y Seters de la Clase
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}

