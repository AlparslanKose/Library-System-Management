package com.example.alpbaba.models;

public class Book {
    private int id;
    private String title;
    private String author;
    private String genre;
    private String inventoryNumber;

    public Book(int id, String title, String author, String genre, String inventoryNumber) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.inventoryNumber = inventoryNumber;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }
}
