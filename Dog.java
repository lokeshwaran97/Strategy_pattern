
package strategy_pattern;

public class Dog extends Animal{
    
    public Dog(){
        eat = new Omnivore();
    }
    
    public void Iam(){
        System.out.println("I am Dog");
    }
    
}
