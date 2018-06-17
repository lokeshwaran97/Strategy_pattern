/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy_pattern;

/**
 *
 * @author lokeshwaran
 */
public class Sheep extends Animal{
    
    public Sheep(){
        eat = new Herbivore();
    }
    
     public void Iam(){
        System.out.println("I am Sheep");
    }
    
}
