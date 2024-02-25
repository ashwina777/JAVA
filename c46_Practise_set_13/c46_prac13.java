/*
    you have to implement a library using Java Class Library
    Methods : issueBook, returnBook,showAvailableBooks
    Properties : Array to store the available books
    array to store issued books
 */
package com.company;
import java.util.Scanner;

public class c46_prac12 {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("alchemist");
        lib.addBook("think and grow rich");
        lib.addBook("room on the roof");
        lib.addBook("ikigai");
        lib.addBook("a thousand splendid suns");
        lib.addBook("the kite runner");
        lib.addBook("malgudi days");
        lib.issuebook("alchemist");
        lib.issuebook("ncert");
        lib.returnBook("english");
        lib.showAvailableBooks();
    }
}
class Library
{
    int flag=0;
    String[] books;
    int no_of_books;
    Library()
    {
        this.books = new String[100];
        this.no_of_books=0;
    }
    void addBook(String s)
    {
        this.books[no_of_books]=s;
        no_of_books++;
        System.out.println(s+" book has been added!");
    }

    void issuebook(String str) {
        int j;

        for ( j=0;j<this.books.length;j++) {

            if (str.equals(this.books[j])) {
                flag=1;
                System.out.println("\nBook " + books[j] + " issued...");
                this.books[j]=null;
                return;
            }
        }
            System.out.println("\nSorry! Book is not available...");

    }

    void returnBook(String s)
    {
        addBook(s);
        System.out.println("\nBook "+s+" has been returned!");
    }
    void showAvailableBooks()
    {
        int count=0;
        System.out.println("\nList of available books : ");
        for(int i=0;i<no_of_books;i++)
        {
            System.out.println("->  "+books[i]);
        }
    }
}
