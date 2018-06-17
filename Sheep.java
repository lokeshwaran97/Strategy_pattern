
package strategy_pattern;

public class Sheep extends Animal{
    
    public Sheep(){
        eat = new Herbivore();
    }
    
     public void Iam(){
        System.out.println("I am Sheep");
    }
    
}
