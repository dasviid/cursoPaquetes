package ar.davidbarre.app.jardin;

import ar.davidbarre.app.hogar.*;
import static ar.davidbarre.app.hogar.Persona.*;
import static ar.davidbarre.app.hogar.Color.*;


public class EjemploPaquetes {
    public static void main(String[] args) {

        // ar.davidbarre.app.hogar.Persona p = new ar.davidbarre.app.hogar.Persona();
        Persona persona = new Persona();
        persona.setNombre("David");
        persona.setApellido("Nisman");
        persona.setColorPelo(CAFE);
        System.out.println(persona.getNombre());

        Perro perro = new Perro();
        perro.nombre = "cata";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(persona);
        System.out.println(jugando);
        String saludo = saludar();
        System.out.println(saludo);
        String genero = GENERO_FEMENINO;
        String genero2 = GENERO_MASCULINO;
        System.out.println(genero);
        System.out.println(genero2);
    }
}
