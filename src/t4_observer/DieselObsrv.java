/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4_observer;

/**
 *
 * @author PC
 */
public class DieselObsrv extends Observer {
    
    private double precio = 25.70;

    public DieselObsrv(Sujeto sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }
    
    @Override
    public void update() {
        System.out.println("Precio diesel: " + (sujeto.getEstado() * precio));
    }
}
