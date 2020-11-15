package infomation;

import java.util.Scanner;

public class Person extends Infomation {
    private String sex;
    private String position;
    private double salary;

    public Person() {
    }

    public Person(String name, String numberPhone, String address, int day, int month, int year) {
        super(name, numberPhone, address, day, month, year);
    }

    public Person(String sex, String position, double salary) {
        this.sex = sex;
        this.position = position;
        this.salary = salary;
    }

    public Person(String name, String numberPhone, String address, int day, int month, int year, String sex, String position, double salary) {
        super(name, numberPhone, address, day, month, year);
        this.sex = sex;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void InputInfo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------Nhập thông tin nhân viên-------------");
        System.out.print("Nhận tên: "); super.name = sc.nextLine();
        System.out.print("Nhập số điện thoại: "); super.numberPhone = sc.nextLine();
        System.out.print("Nhập địa chỉ: "); super.address = sc.nextLine();
        System.out.println("Nhập ngày sinh");
        System.out.print("\tNhập ngày: "); super.day = sc.nextInt();
        System.out.print("\tNhập tháng : "); super.month = sc.nextInt();
        System.out.print("\tNhập năm: "); super.year = sc.nextInt();
        System.out.print("Nhập giới tính: "); sc.nextLine(); sex = sc.nextLine();
        System.out.print("Nhập chức vụ: "); position = sc.nextLine();
        System.out.print("Nhập lương: ");  salary = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "Person{" +
                "sex='" + sex + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", address='" + address + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    @Override
    void OutputInfo() {
        System.out.println(this.toString());
    }
}
