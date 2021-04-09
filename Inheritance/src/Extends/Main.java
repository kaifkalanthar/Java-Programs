package Extends;
class Animal{
    int age;
    public Animal(int age){
        this.age=age;
        System.out.println("Animal has been created");

    }
    public void Eat(){
        System.out.println("Animal is eating");
    }

    public int getAge(){
        return age;
    }
}

public class Main {

    public static void main(String[] args) {
        Animal animal =new Animal(13);
        Lion lion =new Lion();
        Tiger tiger =new Tiger();

        tiger.Eat();
        lion.Roar();
        System.out.println(lion.getAge());
        animal.getAge();
        tiger.Prusten();
        System.out.println(tiger.getAge());
        lion.Eat();

    //  <--Output-->
    //    Animal has been created
    //    Animal has been created
    //    Lion has been created
    //    Animal has been created
    //    Tiger is created
    //    Tiger is eating
    //    Lion is stared to roar
    //    18
    //    Tiger is started to chuff
    //    20
    //    Lion is eating



    }
}
