

package strategy_pattern;


public class Main {
    
    public static void main(String ar[]){
        Animal animal = new Dog();
        animal.Iam();
        animal.breathe();
        animal.call_Eat();
        animal.set_eat(new Herbivore());   // we can dynamicaly change the feature
        animal.call_Eat();
        animal = new Lion();
        animal.Iam();
        animal.breathe();
        animal.call_Eat();
        animal.set_eat(new Omnivore());    //
        animal.call_Eat();
        
        
    }
    
}
