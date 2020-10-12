package a;

public class SinhVien {

    private   String maSV;
    private  String hoTen;
    private  String diaChi;


    public SinhVien(String maSV)
    {
        maSV++;
    }

    public SinhVien(String hoTen, String diaChi)
    {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void Showinfo(){
        System.out.println(maSV);
        System.out.println(hoTen);
        System.out.println(diaChi);
    }
}
