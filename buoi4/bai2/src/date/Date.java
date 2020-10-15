package date;

import java.util.Scanner;

public class Date {
    private int day, month, year;

    public void NhapDate()
    {
        System.out.println("Nhập ngày sinh");
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhập ngày: "); day = sc.nextInt();
        System.out.print("\tNhập tháng: "); month = sc.nextInt();
        System.out.print("\tNhập năm: "); year = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Ngày Sinh{" +
                "Day=" + day +
                ", Month=" + month +
                ", Year=" + year +
                '}';
    }
}
