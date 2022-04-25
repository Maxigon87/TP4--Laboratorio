/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4;

/**
 *
 * @author NEXO-MAX
 */
public class Personaje {
    protected Position ubicacion;
    protected String nick;
    protected int vidas = 3;
    protected int energia = 100;
    protected char orientacion;

    public Personaje(Position ubicacion, String nick, char orientacion) {
        this.ubicacion = ubicacion;
        this.nick = nick;
        this.orientacion = orientacion;
    }
    
    
    
    
    public void Disparar(){
        if (energia >=10){
            energia -= 10;
            
        }else{System.out.println("No pudo disparar sin energia, quedo desarmado.");}
    }
    
    public void Girar(){
        
        switch (orientacion) {
            case 'N':
                orientacion = 'E';
                break;
                
            case 'E':
                orientacion = 'S';
                break;
            case 'S':
                orientacion = 'O';
                break;
            case 'O':
                orientacion = 'N';
                break;}
             
    }
    public void Avanzar (){
         
        switch(orientacion){
            case 'N':
                this.ubicacion.setY(ubicacion.getY()+1);
            case 'E':
                this.ubicacion.setY(ubicacion.getX()+ 1);
                break;
            case 'S':
                this.ubicacion.setY(ubicacion.getY()- 1);
                break;
            case 'O':
                this.ubicacion.setY(ubicacion.getX()- 1);
                break;
            
        }
        System.out.println("Se movio un paso.");
    }

    public Position getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Position ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public char getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(char orientacion) {
        this.orientacion = orientacion;
    }
    
    
    
}
