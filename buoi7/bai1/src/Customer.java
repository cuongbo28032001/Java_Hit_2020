public class Customer extends PerSon{
    private int balance;

    public Customer() {
    }

    public Customer(String name, String address) {
        super(name, address);
    }

    public Customer(int balance) {
        this.balance = balance;
    }

    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }

    @Override
    void display() {
        System.out.println("Customer name: "+super.getName());
        System.out.println("Customer address: "+super.getAddress());
        System.out.println("Customer balance: "+balance);
    }
}
