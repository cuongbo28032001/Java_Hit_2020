package Main;

import HangHoa.HangHoa;

public class Main {
    public static void main(String[] args) {
        HangHoa a = new HangHoa("MA01","BIM BIM",1000,1000);
        a.Xuat();
        HangHoa b = new HangHoa();
        b.setMaHang("MA02");
        b.setTenHang("Kẹo mút");
        b.setDonGia(500);
        b.setSoLuong(3000);
        b.Xuat();
    }
}
