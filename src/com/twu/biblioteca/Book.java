package com.twu.biblioteca;

public class Book {
    private String name;
    private String author;
    private String publishCompany;

    public Book(String name, String author, String publishCompany) {
        this.name = name;
        this.author = author;
        this.publishCompany = publishCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishCompany() {
        return publishCompany;
    }

    public void setPublishCompany(String publishCompany) {
        this.publishCompany = publishCompany;
    }
}
