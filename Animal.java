

package strategy_pattern;


public abstract class Animal {
    
    public Animal(){
        
    }
    
    Eat_Behaviour eat ;
    
    public void breathe(){
        System.out.println("All animal breathes");
    }
    
    public void set_eat(Eat_Behaviour eat){
        this.eat=eat;
    }
    
    public void call_Eat(){
        eat.eat();
    }
   
    abstract void Iam();
       
}
