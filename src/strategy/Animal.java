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
public class Animal {
    
    private String name;
    private int wheight;
    private int speed;
    private SoundStrategy sound;
    // usando o padrão Strategy (agregação com a interface FlyStrategy)
    protected FlyStrategy flyTipe;

    public Animal() {
        this.flyTipe = new FlyNoWay();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheight() {
        return wheight;
    }

    public void setWheight(int wheight) {
        this.wheight = wheight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public SoundStrategy getSound() {
        return sound;
    }

    public void setSound(SoundStrategy sound) {
        this.sound = sound;
    }

    public String tryFlyTipe() { // parecido com o get, porém já busca direto o que o método fly retorna, uma String.
        return flyTipe.fly();
    }

    public void setFlybehavior(FlyStrategy flyTipe) {
        this.flyTipe = flyTipe;
    }
    
    
    
    
    
}
