/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KevinK
 */
import java.util.ArrayList;


public class Library {
    private ArrayList<Book> books;
    
    public Library() {
        this.books = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook) {
        this.books.add(newBook);
    }
    
    public void printBooks() {
        for (Book ele : this.books) {
            System.out.println(ele.toString());
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> matchingBooks = new ArrayList<Book>();
        for (Book ele : this.books) {
            if (StringUtils.included(ele.title(), title)) {
                matchingBooks.add(ele);
            }
        }
        return matchingBooks;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> matchingBooks = new ArrayList<Book>();
        for (Book ele : this.books) {
            if (StringUtils.included(ele.publisher(), publisher)) {
                matchingBooks.add(ele);
            }
        }
        return matchingBooks;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> matchingBooks = new ArrayList<Book>();
        for (Book ele : this.books) {
            if (ele.year() == (year)) {
                matchingBooks.add(ele);
            }
        }
        return matchingBooks;
    }
}
