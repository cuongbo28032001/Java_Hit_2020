package may;


import java.util.Scanner;

public class May {
    private String maMay;
    private String kieuMay;
    private String tinhTrang;

    public May() {
    }

    public May(String maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }

    public void NhapMay()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhập mã máy:"); maMay = sc.nextLine();
        System.out.print("\tNhập kiểu máy:"); kieuMay = sc.nextLine();
        System.out.print("\tNhập tình trạng:"); tinhTrang = sc.nextLine();
    }

    @Override
    public String toString() {
        return "May{" +
                "maMay='" + maMay + '\'' +
                ", kieuMay='" + kieuMay + '\'' +
                ", tinhTrang='" + tinhTrang + '\'' +
                '}';
    }
}
