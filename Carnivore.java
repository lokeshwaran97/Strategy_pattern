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
public class Carnivore implements Eat_Behaviour{
    
    public void eat(){
        System.out.println("eats only non veg");
    }
}
