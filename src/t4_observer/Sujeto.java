/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4_observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Sujeto {
    
    private List<Observer> observers  = new ArrayList<Observer>();
    private int estado;

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
        notificarTodos();
    }
    
    public void agregar(Observer observer){
        observers.add(observer);
    }
    
    public void notificarTodos(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
