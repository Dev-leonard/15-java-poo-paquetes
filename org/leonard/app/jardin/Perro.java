package org.leonard.app.jardin;

import org.leonard.app.hogar.Persona;

import java.io.StringReader;

public class Perro {
    protected String nombre;  // aqui se puede usar sin "public" porque estan dentro del mismo paquete
    protected String raza; // aqui se puede usar sin "public" porque estan dentro del mismo paquete

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
