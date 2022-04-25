/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4;

/**
 *
 * @author NEXO-MAX
 */
public class Guerrero extends Personaje {
    boolean caballo; 

    public Guerrero(Position ubicacion, String nick, char orientacion) {
        super(ubicacion, nick, orientacion);
    }

    public boolean isCaballo() {
        return caballo;
    }

    public void setCaballo(boolean caballo) {
        this.caballo = caballo;
    }
    
    
    @Override
    public void Avanzar(){
        
        if (this.caballo = true){
        
        switch(orientacion){
            case 'N':
                this.ubicacion.setY(ubicacion.getY() +10);
                break;
            case 'E':
                this.ubicacion.setX(ubicacion.getX() +10);
                break;
            case 'S':
                this.ubicacion.setY(ubicacion.getY() -10);
                break;
            case 'O':
                this.ubicacion.setX(ubicacion.getX() -10);
                break;            
                }
            System.out.println("Galopa con su caballo diez pasos");
        }else{
                super.Avanzar();
                System.out.println("Avanza solo un paso porque se le fue el caballo");
                }
        
    }
    
    @Override
    public void Disparar(){
        if (energia <30 && energia >10){
            caballo = false;
            energia-= 10;
            System.out.println("Disparo! pero se le canso el caballo.");
    }else{
        if (energia >=10){
            energia -= 10;
            
        }else{System.out.println("Sin energia para disparar. Ya valió");}
    }
    }
}
