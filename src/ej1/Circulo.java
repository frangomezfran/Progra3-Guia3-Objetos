package ej1;

public class Circulo {

    private String color = "Rojo";
    private double radio ; // En cm

    //----------------- Constructor -----------------
    public Circulo(String color, double radio) {
        this.color = color;
        this.radio = radio;
    }

    //----------------- Color -----------------
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //----------------- Radio -----------------
    public double getRadio() {
        return this.radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }


    //----------------- Metodos -----------------
    public double calculaArea(){
        return Math.PI*Math.pow(this.radio,2);
    }

    public String imprimeCaracteristicas(){
        return "Color: "+this.getColor()+" | Radio: "+this.getRadio()+"cm | Area: "+this.calculaArea();
    }

}

