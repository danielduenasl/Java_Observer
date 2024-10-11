/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_observer;

/**
 *
 * @author PC
 */
public class T4_Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sujeto sujeto = new Sujeto();
        
        new SuperObsrv(sujeto);
        new DieselObsrv(sujeto);
        new RegularObsrv(sujeto);
        
        System.out.println("compra de 5 galones");
        sujeto.setEstado(5);
        System.out.println("- - - - - - - - - - -");
        System.out.println("compra de 10 galones");
        sujeto.setEstado(10);
    }
    
}
