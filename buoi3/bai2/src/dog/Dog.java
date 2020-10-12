package dog;


public class Dog {

    private String name;
    private int MP = 100;


    public void Inputname(String name)
    {
        this.name = name;
    }

    public void ShowMP()
    {
        System.out.println(" MP = " + (MP=(MP-20)));
    }

    public void Bark()
    {
        if(name == null || name.isEmpty())
        {
            System.out.println("Xin lỗi bạn chưa điền tên");
        }
        else{
            System.out.print(name + " Sủa");
        }
    }

}
