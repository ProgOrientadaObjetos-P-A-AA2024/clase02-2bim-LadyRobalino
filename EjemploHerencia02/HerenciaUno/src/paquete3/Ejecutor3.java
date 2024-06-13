/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {

    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;

        EstudiantePresencial estDistancia = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        estDistancia.establecerCostoCredito(100.2);
        estDistancia.establecerNumeroCreditos(5);
        estDistancia.calcularMatriculaPresencial();

        System.out.println(estDistancia);

    }
}
