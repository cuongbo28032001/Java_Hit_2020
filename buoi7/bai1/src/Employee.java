import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Employee extends  PerSon {
    private int Salary;

    public Employee() {
    }

    public Employee(String name, String address) {
        super(name, address);
    }

    public Employee(int salary) {
        Salary = salary;
    }

    public Employee(String name, String address, int salary) {
        super(name, address);
        Salary = salary;
    }

    @Override
    void display() {
        System.out.println("Employee name: "+super.getName());
        System.out.println("Employee address: "+super.getAddress());
        System.out.println("Employee salary: "+Salary);
    }
}
