package cl.desafioPOO.modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Nombre del Package :cl.desafioPOO
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : lunes 03 de junio de 2024
 * 03-06-2024 18:06
 * Nombre del Proyecto Desafio Manejo de Excepciones POO Java
 */
public class LibroVenta {
 //atributos
 private String nombreVenta;
 private String fechaVenta;
 public static ArrayList<String> libroVenta = new ArrayList<>();

 //constructor vacio

 public LibroVenta() {
 }
 //constructor completo

 public LibroVenta(String nombreVenta, String fechaVenta) {
  this.nombreVenta = nombreVenta;
  this.fechaVenta = fechaVenta;
 }

 //Metodos
////////////////////////////////////////////////////////////////////
 //Metodo para guardar datos ingresados
 public void guardarVenta(){
  Cliente cliente = new Cliente("14093458-4", "Raul Martinez",56);
  Vehiculo vehiculo= new Vehiculo("Azul Midnight", "rzgh87");
  int edadCliente  = cliente.getEdad();
  libroVenta.add(nombreVenta);
  libroVenta.add(fechaVenta);
  libroVenta.add(String.valueOf(edadCliente));
  libroVenta.add(vehiculo.getPatente());
  crearArchivo();
 }
////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////
 //Metodo para Creacion de Archivo validacion de Directorio
 public  void crearArchivo() {
  String nombreDirectorio = "ficheros";
   File directorio = new File("src/" + nombreDirectorio);
   String ruta1 = String.valueOf(directorio);
   String ruta=ruta1;
   if (!directorio.exists()) {
    System.out.println("Directorio se Creado");
    directorio.mkdir();
   }
   File archivo = new File(directorio.getAbsoluteFile() + "/" + nombreVenta +".txt");
   try {
        if (archivo.exists()){
            System.out.println("el Archivo ya existe");
        }else {
         System.out.println("Se a Creado el Archivo");
         escribirArreglo(archivo);
        }
   }catch (Exception e) {
            System.out.println("Error al Crear el archivo");
            e.printStackTrace();
   }
}
///////////////////////////////////////////////////////////////////
 //Metodo para escribir en el array y el archivo
 public static void escribirArreglo(File ruta) {
  File ruta1 = ruta;
  FileWriter fileW = null;
  try {
   fileW = new FileWriter(ruta1);
   BufferedWriter bufferedWriter = new BufferedWriter(fileW);
   for (Iterator<String> iterador = libroVenta.iterator(); iterador.hasNext();) {
    String element = iterador.next();
    bufferedWriter.write(element);
    bufferedWriter.newLine();
   }
   bufferedWriter.close();
  } catch (Exception e) {
   e.printStackTrace();
  }
 }
//////////////////////////////////////////////////////////////////
 //Getters y Setters
 public String getNombreVenta() {
  return nombreVenta;
 }

 public void setNombreVenta(String nombreVenta) {
  this.nombreVenta = nombreVenta;
 }

 public String getFechaVenta() {
  return fechaVenta;
 }

 public void setFechaVenta(String fechaVenta) {
  this.fechaVenta = fechaVenta;
 }

 public static ArrayList<String> getLibroVenta() {
  return libroVenta;
 }

 public static void setLibroVenta(ArrayList<String> libroVenta) {
  LibroVenta.libroVenta = libroVenta;
 }
}
