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
public class SoundBird implements SoundStrategy {

    @Override
    public String sound() {
        return "Piu Piu";
    }
    
}
