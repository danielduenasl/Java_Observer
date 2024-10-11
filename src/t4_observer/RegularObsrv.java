/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4_observer;

/**
 *
 * @author PC
 */
public class RegularObsrv extends Observer {
    
    private double precio = 29.32;

    public RegularObsrv(Sujeto sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }
    
    @Override
    public void update() {
        System.out.println("Precio regular: " + (sujeto.getEstado() * precio));
    }
}
