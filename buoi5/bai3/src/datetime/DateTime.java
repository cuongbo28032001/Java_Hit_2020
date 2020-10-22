package datetime;

import java.util.Scanner;

public class DateTime {
    private int day, month, year;

    public DateTime() {
    }

    public DateTime(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void NhapDate()
    {
        System.out.println("Nhập thời gian");
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhập ngày: "); day = sc.nextInt();
        System.out.print("\tNhập tháng: "); month = sc.nextInt();
        System.out.print("\tNhập năm: "); year = sc.nextInt();
    }

    public void XuatDate()
    {
        System.out.println("Ngày in phiếu: " +day+ "/" +month+ "/" +year);
    }
}
