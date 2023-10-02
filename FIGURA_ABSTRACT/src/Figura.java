/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ESTUDIANTES
 */
public abstract class Figura {
    protected String detalle;

    public Figura() {
    }
    
    public Figura(String detalle) {
        this.detalle = detalle;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Figura{" + "detalle=" + detalle + '}';
    }

    public abstract double calcularArea();
    
    public abstract double calcularPerimetro();
    
}
