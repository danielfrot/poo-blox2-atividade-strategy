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
public class Bird extends Animal {

    public Bird() {
        super();
        
        super.setSound(new SoundBird());
        super.setFlybehavior(new FlyWithWings());
        
    }
    
    
    
    
}
