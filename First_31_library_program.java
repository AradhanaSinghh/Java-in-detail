//A library management system
/*
This is a project to create a basic Library management system using arrays and
oops in java
 */
package com.company; //Package
class Library{
    String[] books;
    int no_of_books;

    Library(){
        this.books = new String[100];//You can store 100 books
        this.no_of_books = 0;
    }

//Method for adding book
    public void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been added!");
    }

//Method to specify the details of the availability of the books
    public void showAvailableBooks(){
        System.out.println("Available Books are:");
        for (String book : this.books) {
            if (book == null){
                continue;
            }
            System.out.println("*" + book);
        }
    }
//Methods to issue a book
    public void issueBook(String book){
        for (int i=0;i<this.books.length;i++){
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i] = null;
               return;
            }
        }

        System.out.println("This book does not exist");
    }
    //Method for returning the book again to the library
    public void returnBook(String book){
        addBook(book);
    }
}
public class First_31_library_program {
    public static void main(String[] args) {

        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++");
        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("C++");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBooks();
    }
}
//Thank you.