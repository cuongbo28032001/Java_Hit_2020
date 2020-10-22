package sophuc;

public class SoPhuc {
    private double thuc, ao;

    public SoPhuc() {
    }

    public SoPhuc(double thuc, double ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public void Tong(SoPhuc x, SoPhuc y)
    {
        SoPhuc temp = new SoPhuc(0, 0);
        temp.thuc = x.thuc + y.thuc;
        temp.ao = x.ao + y.ao;
        System.out.println("Tổng = " +temp.thuc+ "+" +temp.ao+ "i");
    }

    public void Hieu(SoPhuc x, SoPhuc y)
    {
        SoPhuc temp = new SoPhuc(0, 0);
        temp.thuc = x.thuc - y.thuc;
        temp.ao = x.ao - y.ao;
        System.out.println("Hiệu = " +temp.thuc+ "+" +temp.ao+ "i");
    }
}
