package ar.davidbarre.app.hogar;

public class Persona {
    private String nombre;
    private String apellido;
    private Color colorPelo;

    public static final String GENERO_MASCULINO = "Masculino";
    public static final String GENERO_FEMENINO = "Femenino";




    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Color getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(Color colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String lanzarPelota() {
        return "lanza la pelota al perro";
    }
    public static  String saludar(){
        return "hola que tal";
    }
}
