package nguoi;


import java.util.Scanner;

public class Person {
    private String hoTen;
    private String queQuan;
    private int ngay, thang, nam;

    public Person() {
    }

    public Person(String hoTen, String queQuan, int ngay, int thang, int nam) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void NhapPerson()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: "); hoTen = sc.nextLine();
        System.out.print("Nhập quê quán: "); queQuan = sc.nextLine();
        System.out.println("Nhập ngày sinh");
        System.out.print("\tNhập ngày: "); ngay = sc.nextInt();
        System.out.print("\tNhập tháng: "); thang = sc.nextInt();
        System.out.print("\tNhập năm: "); nam = sc.nextInt();
    }

    public void XuatPerson()
    {
        System.out.printf("%20s %20s %15d %1s %1d %1s %1d", hoTen, queQuan, ngay,"/", thang, "/", nam);
        System.out.println();
    }
}
