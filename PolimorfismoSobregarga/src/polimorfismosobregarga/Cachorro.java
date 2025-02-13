/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismosobregarga;

/**
 *
 * @author Alisson Kaelan
 */
public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }
    
    public void reagir(String frase){
        if("Toma comida".equals(frase) || "Ola".equals(frase) || "cheguei".equals(frase)){
            System.out.println("Abanando rabo e latindo");  
        }else{
            System.out.println("Rosnando");
        }
    }
    
    public void reagir(int hora,int min){
        if (hora<12){
            System.out.println("Abanar");
        }else if(hora >=19){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e latir");
        }
               
    }
    
    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e latir");
        }
    }
    
    
    
}
