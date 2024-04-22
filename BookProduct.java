package com.mycompany.ecomercesystem;
public class BookProduct extends product{  
    protected String author;
    protected String publisher;
    public BookProduct(int productId, String author, double price, String publisher, String name) {     
        super(productId, name, price);
        this.author = author;        
        this.publisher = publisher;
    }
    public void setAuthor(String author) {  
        this.author = author;
    }
    public void setPublisher(String publisher) {   
        this.publisher = publisher;
    }    public String getAuthor() {
        return author;    }
    public String getPublisher() {
        return publisher;    }
}