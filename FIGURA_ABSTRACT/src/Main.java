/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ESTUDIANTES
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Figura t = new Triangulo("Triangulo", 30, 10);
        verFigura(t);
        
        Figura r = new Rectangulo(40, 20, "Rectangulo");
        verFigura(r);
        
    }
    
    public static void verFigura(Figura f){
        System.out.println(f);
    }
    
}
