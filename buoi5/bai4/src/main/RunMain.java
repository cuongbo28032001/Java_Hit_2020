package main;


public class RunMain {

    public static ArrayList<SinhVien>list = new ArrayList<>();
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("/*******************************************/");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort students by gpa.");
        System.out.println("5. Sort students by name.");
        System.out.println("6. Show students.");
        System.out.println("0. Exit.");
        System.out.println("/*******************************************/");

        char ck;
        do
        {
            System.out.print("Nhập lựa chọn: ");
            int select = sc.nextInt();

            switch (select)
            {
                case 1:
                {
                    AddStudents();
                    break;
                }
                case 2:
                {
                    EditStudentById();
                    break;
                }
            case 3:
                {
                    DeleteStudentById();
                    break;
                }
            case 4:
                {
                    SortStudentsByGpa();
                    break;
                }
            case 5:
                {
                    SortStudentsByName();
                    break;
                }
            case 6:
                {
                    ShowStudents();
                    break;
                }
                case 0:
                {
                    System.exit(0);
                }
            }System.out.print("\nBạn có muốn tiếp tục không? (c/k): ");
            ck = sc.next().charAt(0);
            if(ck == 'k')
                System.out.println("-----------BYE------------");
        }while( ck!='k');
    }

    public static void AddStudents()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số sinh viên cần thêm: ");  n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            SinhVien x = new SinhVien();
            System.out.println("Sinh viên thứ: " +(i+1));
            x.Input();
            list.add(x);
        }
    }

    public static void EditStudentById()
    {
        Scanner sc = new Scanner(System.in);
        if(list.size()<=0)
            System.out.println("Không có sinh viên để sửa");
        else
        {
            System.out.print("Nhập ID cần sửa: ");
            String SearchID = sc.nextLine();
            int dem = 0;
            int pos = 0;
            for(SinhVien i : list)
            {
                if(i.getId().compareTo(SearchID)==0)
                {
                    dem++;
                    pos = list.indexOf(i);
                }
            }
            if(dem==0)
                System.out.println("Không có sinh viên có ID này");
            else
            {
                SinhVien x = new SinhVien();
                x.Input();
                list.remove(pos);
                list.add(pos, x);
            }
        }
    }

    public static void DeleteStudentById()
    {
        Scanner sc = new Scanner(System.in);
        if(list.size()<=0)
            System.out.println("Không có gì để xóa");
        else
        {
            System.out.print("Nhập ID cần xóa: "); String SearchID = sc.nextLine();
            int dem=0, pos=0;
            for(SinhVien i : list)
            {
                if(i.getId().compareTo(SearchID)==0)
                {
                    dem++;
                    pos = list.indexOf(i);
                }
            }
            if(dem==0)
                System.out.println("Không có sinh viên nào có ID nay!");
            else
            {
                list.remove(pos);
                for(SinhVien i : list)
                {
                    i.Output();
                }
            }
        }
    }

    public static void SortStudentsByGpa()
    {
        if(list.size() <=0){
            System.out.println("Không có sinh viên nào!");
        }else {
            for(int i = 0; i < list.size() - 1; i++){
                if(list.get(i).getGpa() > list.get(i + 1).getGpa()){
                    SinhVien temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            }
        }
    }

    public static void SortStudentsByName() {
        if(list.size() <=0 ){
            System.out.println("Không có sinh viên nào!");
        }else {
            for(int i = 0; i < list.size() - 1; i++){
                if(list.get(i).getName().compareToIgnoreCase(list.get(i + 1).getName()) > 0){
                    SinhVien temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            }
        }
    }

    private static void ShowStudents() {
        if(list.size() < 1)
            System.out.println("Danh sách rỗng");
        else {
            System.out.println("Danh sách sinh viên");
            for(SinhVien i : list){
                i.Output();
            }
        }
    }
}
