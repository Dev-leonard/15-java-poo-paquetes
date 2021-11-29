package org.leonard.app.jardin;

import org.leonard.app.hogar.*; // aqui se importtan todods los packages

import static org.leonard.app.hogar.Persona.saludar;
import static org.leonard.app.hogar.Persona.*;   //  se importa todos los atributos
import static org.leonard.app.hogar.ColorPelo.*; // con el asterisco se importa todas las constantes

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setApellido("Leonardo");
        p.setNombre("Leon");
        p.setColorPelo(CAFE); // se puedenm autocpmpletar po la importacion realizada

        System.out.println(p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);

        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;

    }
}
