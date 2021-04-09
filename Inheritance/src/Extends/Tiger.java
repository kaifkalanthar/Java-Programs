package Extends;

public class Tiger extends Animal {
    Tiger(){
        super(20);
        System.out.println("Tiger is created");
    }
    public void Eat(){
        System.out.println("Tiger is eating");
    }
    public void Prusten(){
        System.out.println("Tiger is started to chuff");
    }
    public int getAge(){
        return age;
    }

}
