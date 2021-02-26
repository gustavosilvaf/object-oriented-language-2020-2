package com.gustavo;

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("Barack Obama", "Uma terra prometida", 764);

        b1.printAuthor();
        b1.printTitle();

        System.out.println();

        b1.printDetails();
    }
}
