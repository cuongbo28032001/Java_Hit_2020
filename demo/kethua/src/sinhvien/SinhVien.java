package sinhvien;

public class SinhVien extends Nguoi {
    private String maSinhVien;
    private String hoTen;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoTen) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
    }
    @Override
    public void HienThi()
    {
        super.HienThi();
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                '}';
    }
}
