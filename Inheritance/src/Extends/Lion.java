package Extends;

public class Lion extends Animal {
    public Lion(){
        super(18);
        System.out.println("Lion has been created");
    }
    public void Roar(){
        System.out.println("Lion is stared to roar");
    }
    public void Eat()
    {
        System.out.println("Lion is eating");
    }
    public int getAge(){
        return age;
    }
}
