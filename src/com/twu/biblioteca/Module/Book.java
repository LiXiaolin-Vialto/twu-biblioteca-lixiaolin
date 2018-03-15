package com.twu.biblioteca.Module;

public class Book {
    private int Id;
    private String name;
    private String author;
    private String publishCompany;
    private boolean isChecked;

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public Book(int id, String name, String author, String publishCompany) {
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
