/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal toto = new Dog();
        Animal piupiu = new Bird();
        
        System.out.println("Try to Fly");
        System.out.println("Toto: "+ toto.tryFlyTipe());
        System.out.println("Piupiu: "+ piupiu.tryFlyTipe());
        
        System.out.println("-------------- Piupiu got Salt! -----------------");
        
        piupiu.setFlybehavior(new FlyNoWay());
        System.out.println("Try to Fly");
        System.out.println("Toto: "+ toto.tryFlyTipe());
        System.out.println("Piupiu: "+ piupiu.tryFlyTipe());
        
        
        System.out.println("Try to Sound");
        toto.setSound(new SoundDog());
        System.out.println("Toto: "+ toto.getSound().sound());
        piupiu.setSound(new SoundBird());
        System.out.println("Piupiu: "+ piupiu.getSound().sound());
        
    }
    
}
