import java.util.ArrayList;
import java.util.List;

import ej1.Estudiante;
import ej1.Persona;
import ej1.Staff;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiantes[] = new Estudiante[4];
        estudiantes[0] = new Estudiante("40.31.34.12", "Alfonso", "gimenez", "98 123", "unmeal@gmail.com", 2012, 2900,
                "arquitecto");
        estudiantes[1] = new Estudiante("32.31.34.12", "martin", "martinez", "98 123", "unmeal@gmail.com", 2012, 2900,
                "arquitecto");
        estudiantes[2] = new Estudiante("78.31.34.12", "raul", "kito", "98 123", "unmeal@gmail.com", 2012, 2900,
                "arquitecto");
        estudiantes[3] = new Estudiante("10.31.34.12", "jose", "perez", "98 123", "unmeal@gmail.com", 2012, 2900,
                "arquitecto");

        Staff equipo[] = new Staff[4];
        equipo[0] = new Staff("40.31.34.12", "Alfonso", "gimenez", "98 123", "unmeal@gmail.com", 45000, "noche");
        equipo[1] = new Staff("42.31.34.12", "raul", "gimenez", "98 123", "unmeal@gmail.com", 134000, "tarde");
        equipo[2] = new Staff("43.31.34.12", "jose", "gimenez", "98 123", "unmeal@gmail.com", 12000, "tarde");
        equipo[3] = new Staff("45.31.34.12", "juan", "gimenez", "98 123", "unmeal@gmail.com", 15300, "noche");

        List<Persona> personas = new ArrayList<>();
        for (Estudiante aux : estudiantes) {
            personas.add(aux);
        }
        for (Staff aux : equipo) {
            personas.add(aux);
        }
        int cantEstudiantes = 0;
        int cantStaff = 0;
        for (Persona aux : personas) {
            if (aux instanceof Estudiante) {

                cantEstudiantes++;
            } else {

                cantStaff++;
            }
        }
        System.out.println(cantEstudiantes);
        System.out.println(cantStaff);
    }

}
