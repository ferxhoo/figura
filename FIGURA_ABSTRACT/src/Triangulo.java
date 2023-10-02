/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ESTUDIANTES
 */
public class Triangulo extends Figura {
    
    private double base;
    private double altura;

    public Triangulo() {
    }
    
    public Triangulo(String detalle, double base, double altura) {
        super(detalle);
        this.altura=altura;
        this.base=base;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return """
               Triangulo{
                    \t base=""" + base + "\n" +
                    "\t altura=" + altura + "\n" +
                    "\t Area=" + this.calcularArea() + "\n" +
                    "\t* Perimetro=" + this.calcularPerimetro() + "\n" +'}';
    }
    
    @Override
    public double calcularArea(){
        return this.base * this.altura / 2;
    }
    
    @Override
    public double calcularPerimetro(){
        return 0;
    }
    
}
