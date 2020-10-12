package main;
import dog.Dog;

public class Runmain {

    public static void main(String[] args)
    {
        Dog n1 = new Dog();
        Dog n2 = new Dog();
        n1.Inputname("Maria");
        for(int i=0; i<3; i++)
        {
            n1.Bark();
            n1.ShowMP();
        }
        n2.Inputname("");
        n2.Bark();

    }

}
