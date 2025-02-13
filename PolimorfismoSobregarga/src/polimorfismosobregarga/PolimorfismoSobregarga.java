/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismosobregarga;

/**
 *
 * @author Alisson Kaelan
 */
public class PolimorfismoSobregarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cachorro c = new Cachorro();
        System.out.println("Cachorro");
        c.emitirSom();
        
        Lobo l = new Lobo();
        System.out.println("Lobo");
        l.emitirSom();
    }
    
}
