package main;

import book.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static  ArrayList<Book>list = new ArrayList<>();
    public static int m;
    public static void main(String[] args) {
        System.out.println("********************************************");
        System.out.println("1. Add book.");
        System.out.println("2. Edit book by id.");
        System.out.println("3. Delete book by id.");
        System.out.println("4. Sort book by name (ascending).");
        System.out.println("5. Sort book by price (descending).");
        System.out.println("6. Show all books.");
        System.out.println("0. Exit.");
        System.out.println("********************************************");

        Scanner sc = new Scanner(System.in);
        char ck;
        do {

            System.out.print("Nhập lựa chọn của bạn: ");
            int n = sc.nextInt();
            switch (n) {
                case (1): {
                    AddBook();
                    break;
                }

                case (2): {
                    EditById();
                    break;
                }

                case (3): {
                    DeleteById();
                    break;
                }
                case (4): {
                    SortByName();
                    break;
                }

                case (5): {
                    SortByPrice();
                    break;
                }
                case (6): {
                    ShowBooks();
                    break;
                }

                case (0): {
                    System.exit(0);
                    return;
                }
            }
                System.out.print("\nBạn có muốn tiếp tục không? (c/k): ");
                ck = sc.next().charAt(0);
                if(ck == 'k')
                    System.out.println("-----------BYE------------");
            }while( ck!='k');
        }


        public static void AddBook()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số sách muốn thêm: "); m = sc.nextInt();
        for(int i=0; i<m; i++)
        {
            Book x = new Book();
            x.InputBook();
            list.add(x);
        }
    }

    public static void EditById()
    {
        Scanner sc = new Scanner(System.in);
        if(list.size() < 1)
            System.out.println("Không có sách để sửa");
        else
        {
            System.out.print("Nhập ID cần sửa: ");
            String SearchID = sc.nextLine();
            int dem=0, pos=0;
            for(Book i : list)
            {
                if(i.getId().compareTo(SearchID)==0)
                {
                    dem++;
                    pos = list.indexOf(i);
                }
            }
            if(dem==0)
                System.out.println("Không có ID đó");
            else
            {
                Book x = new Book();
                list.remove(pos);
                list.add(pos, x);
            }
        }
    }

    public static void DeleteById() {
        Scanner sc = new Scanner(System.in);
        if (list.size() < 1)
            System.out.println("Không có sách để xóa");
        else {
            System.out.print("Nhập ID cần xóa: ");
            String SearchID = sc.nextLine();
            int dem = 0, pos = 0;
            for (Book i : list) {
                if (i.getId().compareTo(SearchID) == 0) {
                    {
                        dem++;
                        pos = list.lastIndexOf(i);
                    }
                }
            }
            if (dem == 0)
                System.out.println("Không có ID đó");
            else {
                Book x = new Book();
                list.remove(pos);
            }
        }
    }

        public static void SortByName()
        {
            if (list.size() < 1)
                System.out.println("Không có sách ");
            else {
                for(int i=0; i<list.size()-1; i++)
                {
                    if(list.get(i).getName().compareTo(list.get(i+1).getName())>0)
                    {
                        Book temp = list.get(i);
                        list.set(i, list.get(i + 1));
                        list.set(i + 1, temp);
                    }
                }
            }
        }


    public static void SortByPrice()
    {

        if (list.size() < 1)
            System.out.println("Không có sách ");
        else {
                for(int i=0; i<list.size()-1; i++)
                {
                    if(list.get(i).getPrice()>list.get(i+1).getPrice())
                    {
                        Book temp = list.get(i);
                        list.set(i, list.get(i + 1));
                        list.set(i + 1, temp);
                    }
                }
            }
    }

    public static void ShowBooks()
    {
        if(list.size()<1)
            System.out.println("Không có danh sách để xuất");

        else
            System.out.printf("%5s %20s %20s %20s %10s %20s\n", "ID", "Name", "Publisher", "price", "Numofpage", "Author");
            for(Book i : list)
        {
            i.OutputBook();
        }
    }
}
