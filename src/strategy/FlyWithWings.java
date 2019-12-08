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
public class FlyWithWings implements FlyStrategy {

    @Override
    public String fly() {
        return "Flying high with Wings!";
    }
    
}
