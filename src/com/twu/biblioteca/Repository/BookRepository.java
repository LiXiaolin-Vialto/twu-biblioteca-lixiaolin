package com.twu.biblioteca.Repository;

import com.twu.biblioteca.Module.Book;

public class BookRepository {
    private Book[] books;
    public BookRepository() {
        books = new Book[10];

        createBooks();
    }

    private void createBooks() {
        for (int i = 0; i < 10; i++) {
            this.books[i] = new Book(i,"Book-"+i,"Author-"+i,"PC-"+i);
        }
    }

    public String[] getAllBookName() {
        String[] result = new String[10];
        for (int i = 0; i < this.books.length; i++) {
            result[i] = books[i].getName();
        }
        return result;
    }

    public Book getBookById(int bookId) {
        return this.books[bookId];
    }
}
