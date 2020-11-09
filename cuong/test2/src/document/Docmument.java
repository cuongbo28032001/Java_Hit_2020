package document;

import java.util.Scanner;

public class Docmument {
    private String id;
    private String name;
    private String publisher;
    private double price;

    public Docmument() {
    }

    public Docmument(String id, String name, String publisher, double price) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void NhapDoc()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID: "); id = sc.nextLine();
        System.out.print("Nhập tên: "); name = sc.nextLine();
        System.out.print("Nhập publisher: "); publisher = sc.nextLine();
        System.out.print("Nhập price: "); price = sc.nextDouble();
    }

    public void XuatDoc()
    {

        System.out.printf("%5s %20s %20s %20s", id, name, publisher, publisher);
        System.out.println();
    }
}
