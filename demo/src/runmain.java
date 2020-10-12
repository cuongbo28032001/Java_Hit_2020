import a.SinhVien;

public class runmain {

    public static void Show(){
        System.out.println("Show");
    }

    public static void main(String[] args) {
         SinhVien sv1 = new SinhVien();
         SinhVien sv2 = new SinhVien();
//         SinhVien sv3 = new SinhVien();

        System.out.println(sv1.getMaSV());
        System.out.println(sv1.getDiaChi()="Hà Nội");
        System.out.println(sv2.getMaSV());
//        System.out.println(sv3.getMaSV());

         sv1.Showinfo();
         Show();
    }
}
