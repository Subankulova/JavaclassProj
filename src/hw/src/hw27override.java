package hw.src;


import java.util.Scanner;

//Create two classes with Parent and Child relationship
//Create a method inside the parent class and override in the child class using @Override annotation
//Create a MainClass
//Create an object of the child class and called the overridden method
class Book {
    void price() {
        System.out.println("our books have low prices");
    }
}
class Ebook extends Book {
    @Override
    void price() {
        System.out.println("Ebook's price is starting from 5$");
    }
}
class Paperbook extends Book {
    @Override
    void price() {
        System.out.println("Paper book's price is starting from 30$");
    }
}
public class hw27override {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What kind of books do you like?");
        String book = sc.next();
        System.out.println("What genre do you like?");
        String genre = sc.next();
        Book b = null;

        if (book.equalsIgnoreCase("ebook")) {
            b = new Ebook();
        } else if (book.equalsIgnoreCase("paperbook")) {
            b = new Paperbook();
        } else {
            System.out.println("Invalid input");
        }
        b.price();
    }
}
