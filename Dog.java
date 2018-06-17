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
public class Dog extends Animal{
    
    public Dog(){
        eat = new Omnivore();
    }
    
    public void Iam(){
        System.out.println("I am Dog");
    }
    
}
