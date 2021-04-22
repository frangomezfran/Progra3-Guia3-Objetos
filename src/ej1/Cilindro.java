package ej1;

public class Cilindro extends Circulo{

    private double altura = 1;

    //----------------- Constructores -----------------
    public Cilindro (String color, double radio, double altura){
        super(color,radio);
        this.altura = altura ;
    }
    public Cilindro (String color, double radio) {
        super(color, radio);
    }

    //----------------- Altura -----------------
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    //----------------- Metodos -----------------
    public double calculaVolumen(){
        return  Math.PI*Math.pow(this.getRadio(),2)*this.altura;
    }

    public String imprimeCaracteristicas(){//Se paro de manos el polimorfismo en el Ej1 inciso A
        return "Color: "+this.getColor()+" | Radio: "+this.getRadio()+"cm | Area: "+this.calculaArea()+"| Volumen: "+this.calculaVolumen();
    }

    public double calculaArea(){
        return (2*Math.PI*Math.pow(this.getRadio(),2))+(2*Math.PI*this.getRadio()*this.altura);
    }

    public double areaBase(){
        return super.calculaArea();
    }
}
