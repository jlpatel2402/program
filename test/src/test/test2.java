package test;
class Book
{
    String bookname,price,author;
    public Book(String bookname,String price, String author)
    {
        this.bookname=bookname;
        this.author=author;
        this.price=price;
    }
}

public class test2
{
    String branch,bookcode;
    Book book;
    public test2(String branch,String bookcode,Book book)
    {
        this.bookcode = bookcode;
        this.branch = branch;
        this.book = book;
    }
    void display()
    {
        System.out.println(branch+" "+bookcode);
        System.out.println(book.bookname+" "+book.price+" "+book.author);
    }
    public static void main(String[] args)
    {
        Book b = new Book("Java","345","Yash");
        test2 t = new test2("comp","ht56",b);
        t.display();
    }
}