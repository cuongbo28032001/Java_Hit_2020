public class RunMain {
    public static void main(String[] args) {
        IShape[] a = new IShape[3];
        a[0] = new Rectangle(2,3);
        a[1] = new Circle(3);
        a[2] = new Rectangle(4, 5);
        for(int i=0; i<3; i++)
        {
            System.out.println("Area of Shape["+ (i+1) +"]: " +a[i].getArea());
            System.out.println("Perimeter of Shape["+ (i+1) +"]: " +a[i].getPerimeter());
        }
    }
}
