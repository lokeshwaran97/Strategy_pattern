
package strategy_pattern;

public class Lion extends Animal{
    
    public Lion(){
        eat = new Carnivore();
    }
    
    public void Iam(){
        System.out.println("I am Lion");
    }
}
