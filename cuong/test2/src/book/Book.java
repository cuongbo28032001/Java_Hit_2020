package book;

import document.Docmument;

import java.util.Scanner;

public class Book extends Docmument {
    private int numOfPage;
    private String author;

    public Book() {
    }

    public Book(int numOfPage, String author) {
        this.numOfPage = numOfPage;
        this.author = author;
    }

    public int getNumOfPage() {
        return numOfPage;
    }

    public void setNumOfPage(int numOfPage) {
        this.numOfPage = numOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void InputBook()
    {
        Scanner sc = new Scanner(System.in);
        super.NhapDoc();
        System.out.print("Nhập số trang: "); numOfPage = sc.nextInt();
        System.out.print("Nhập tên tác giả: "); sc.nextLine(); author = sc.nextLine();
    }

    public void OutputBook()
    {
        System.out.printf("%10d %20s", numOfPage, author);
        super.XuatDoc();
    }
}
