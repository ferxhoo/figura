/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ESTUDIANTES
 */
public class Circulo extends Figura {
    
    private double radio;

    public Circulo(double radio, String detalle) {
        super(detalle);
        this.radio = radio;
    }

   

    
    
    

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2)
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
}
