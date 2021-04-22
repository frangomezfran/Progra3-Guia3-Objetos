package ej1;

public class Estudiante extends Persona {
    private int anioIngreso;
    private double cuotaMensual;
    private String carrera;

    public Estudiante(String dni, String nombre, String apellido, String direccion, String email, int anioIngreso,
            double coutaMensual, String carrera) {
        super(dni, nombre, apellido, direccion, email);
        this.anioIngreso = anioIngreso;
        this.cuotaMensual = coutaMensual;
        this.carrera = carrera;
    }

}
