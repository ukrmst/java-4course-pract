package edu.uu.project.pract2;

public class Main {
    public  static void main(String[] args) {
        Book book = new Book("Java Basics", "James Gosling", 45.0);
        //book.setPrice(10);
        System.out.println(book.getPrice());
    }
}
