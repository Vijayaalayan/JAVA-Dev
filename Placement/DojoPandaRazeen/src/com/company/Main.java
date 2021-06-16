package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//Sample I/O

//Enter number of books :
//        5
//        500
//        150
//        8
//        700
//        100
//        6
//        600
//        50
//        8
//        550
//        300
//        7
//        650
//        100
//        9
//        MRP	CP	Rating
//        600	50	8
//        650	100	9
//        700	100	6
//        -----------------
//        MRP	CP	Rating
//        650	100	9
//        600	50	8
//        500	150	8


class Books{
    private ArrayList<Book> books = new ArrayList<Book>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void sortMRP(){
        books.sort(Comparator.comparing(Book::getMRP));
    }
    public void sortCP(){
        books.sort(Comparator.comparing(Book::getCP));
    }
    public void sortRating(){
        books.sort(Comparator.comparing(Book::getRating));
    }
}

class Book{
    private int MRP;
    private int CP;
    private int rating;

    public Book(int MRP, int CP, int rating) {
        this.MRP = MRP;
        this.CP = CP;
        this.rating = rating;
    }

    public int getMRP() {
        return MRP;
    }

    public void setMRP(int MRP) {
        this.MRP = MRP;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of books : ");
        int number = sc.nextInt();
        Books totalBooks = new Books();
        for(int i=0;i<number;i++){
//            System.out.println("Enter MRP of the book : ");
            int MRP = sc.nextInt();
//            System.out.println("Enter CP of the book : ");
            int CP = sc.nextInt();
//            System.out.println("Enter rating of the book : ");
            int rating = sc.nextInt();
            Book book = new Book(MRP,CP,rating);
            totalBooks.addBook(book);
        }
//        Sorting books based on the MRP
        totalBooks.sortMRP();
        Books bookBasedOnCp = new Books();
        for(int i=0;i<number;i++){
//            If the MRP >= 500 it is being added to the object booksbasedOnCp
            if(totalBooks.getBooks().get(i).getMRP()>=500){
                bookBasedOnCp.addBook(totalBooks.getBooks().get(i));
            }
        }
//        Sorting the books based on the CP
        bookBasedOnCp.sortCP();
//        PART 1 : Printing 3 books where MRP >= 500 and the CP is minimum
        System.out.println("MRP\tCP\tRating");
        for(int i=0;i<3;i++){
            System.out.println(bookBasedOnCp.getBooks().get(i).getMRP()+"\t"+
                    bookBasedOnCp.getBooks().get(i).getCP()+"\t"+
                    bookBasedOnCp.getBooks().get(i).getRating());
        }
        System.out.println("-----------------");
        Books booksBasedOnRating = new Books();
        for(int i=0;i<bookBasedOnCp.getBooks().size();i++){
//            If ith book CP is greater than 400 it won't come under the list so skipping the next iterations
            if(bookBasedOnCp.getBooks().get(i).getCP()>400){
                continue;
            }
            boolean temp_i = false;
            for(int j=i+1;j<bookBasedOnCp.getBooks().size();j++){
//                If sum of ith and jth book CP is greater than 400 it won't come under the list so skipping the next iteration
                if(bookBasedOnCp.getBooks().get(i).getCP()+bookBasedOnCp.getBooks().get(j).getCP()>400){
                    continue;
                }
                boolean temp_j = false;
                for(int k=j+1;k<bookBasedOnCp.getBooks().size();k++){
                    if(bookBasedOnCp.getBooks().get(i).getCP()+bookBasedOnCp.getBooks().get(j).getCP()+
                            bookBasedOnCp.getBooks().get(k).getCP() <=400){
                        booksBasedOnRating.addBook(bookBasedOnCp.getBooks().get(k));
                        bookBasedOnCp.getBooks().remove(bookBasedOnCp.getBooks().get(k));
//                        K is decremented because the book above is deleted and the pointer should stay here
                        k--;
                        temp_j = true;
                    }
                }
                if(temp_j){
                    booksBasedOnRating.addBook(bookBasedOnCp.getBooks().get(j));
                    bookBasedOnCp.getBooks().remove(bookBasedOnCp.getBooks().get(j));
                    temp_i = true;
//                    Same explanation of K
                    j--;
                }
            }
            if(temp_i){
                booksBasedOnRating.addBook(bookBasedOnCp.getBooks().get(i));
                bookBasedOnCp.getBooks().remove(bookBasedOnCp.getBooks().get(i));
//                Same explanation of K
                i--;
            }
        }
//        Sorting based on the rating in order to get the Highest average rating
        booksBasedOnRating.sortRating();
//        PART 2 : Printing the books based on MRP >= 500 and sum of three books <= 400 and average rating of three books is high
        System.out.println("MRP\tCP\tRating");
        for(int i=booksBasedOnRating.getBooks().size()-1;i>=booksBasedOnRating.getBooks().size()-3;i--){
            System.out.println(booksBasedOnRating.getBooks().get(i).getMRP()+"\t"+
                    booksBasedOnRating.getBooks().get(i).getCP()+"\t"+
                    booksBasedOnRating.getBooks().get(i).getRating());
        }
    }
}