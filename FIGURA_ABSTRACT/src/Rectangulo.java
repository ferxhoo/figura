/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ESTUDIANTES
 */
public class Rectangulo extends Figura {
    
    private double largo;
    private double ancho;
    
    public Rectangulo(){
    }

    public Rectangulo(double largo, double ancho, String detalle) {
        super(detalle);
        this.largo = largo;
        this.ancho = ancho;
    }

    
    
    

    @Override
    public double calcularArea() {
        return this.largo * this.ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (this.largo + this.ancho);
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    @Override
    public String toString() {
        return "Rectangulo{\n" +
                "\t largo=" + largo + "\n" + 
                "\t ancho=" + ancho +
                "\t Area=" + this.calcularArea() + "\n" +
                "\t* Perimetro=" + this.calcularPerimetro() + "\n" +
                '}';
    }
    
    
}
