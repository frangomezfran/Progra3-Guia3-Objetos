import ej1.Cilindro;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Eliga el ejercicio a ver -> 1 - 2 - 3");
        Scanner input = new Scanner(System.in);
        switch (input.nextInt()){
            case 1:
                Cilindro cilindro = new Cilindro("Verde",4,10);//A
                System.out.println(cilindro.imprimeCaracteristicas());

                Cilindro cilindro2 = new Cilindro("Azul",2.6,17);
                System.out.println("\nCilindro 2\nRadio: "+cilindro2.getRadio()+"\nAltura: "+cilindro2.getAltura()+"\nArea del cilindro: "+cilindro2.calculaArea()+"\nArea de la base: "+cilindro2.areaBase()+"\nVolumen: "+cilindro2.calculaVolumen());


                break;

            case 2:
                break;

            case 3:
                break;

            default:
                System.out.println("No era tan dificil bro");
                break;
        }
    }


}

