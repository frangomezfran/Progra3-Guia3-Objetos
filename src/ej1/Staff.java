package ej1;

public class Staff extends Persona{
    private double salario;
    private String turno;

    public Staff(String dni, String nombre, String apellido, String direccion, String email, double salario,
            String turno) {
        super(dni, nombre, apellido, direccion, email);
        this.salario = salario;
        this.turno = turno;
    }

    public String getTurno(){
        return this.turno;
    }
}
