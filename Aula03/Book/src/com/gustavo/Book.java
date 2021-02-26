package com.gustavo;

public class Book {
    private String author;
    private String title;
    private int pages;
    private String numReference;
    private int borrowed;

    public Book(String bookAuthor, String bookTitle, int bookPages){
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        numReference = "";
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getBorrowed() {
        return borrowed;
    }

    public String getNumReference() {
        return numReference;
    }

    public void setNumReference(String numReference) {
        if(numReference.length() >= 3)
            this.numReference = numReference;
        else
            System.out.println("Número de referência dever ter pelo menos 3 caracteres");
    }

    public void printAuthor() {
        System.out.println("Author: " + getAuthor());
    }

    public void printTitle() {
        System.out.println("Title: " + getTitle());
    }

    public void loan() {
        borrowed += 1;
    }

    public void printDetails() {
        printAuthor();
        printTitle();
        System.out.println("Pages: " + getPages());
        if(getNumReference().length() > 0)
            System.out.println("Reference Number: " + getNumReference());
        else
            System.out.println("Reference Number: ZZZ");
        System.out.println("Número de empréstimos: " + borrowed);
    }
}
