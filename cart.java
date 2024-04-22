package com.mycompany.ecomercesystem;
public class cart { 
    private int customerId;
    private int nProducts; 
    private product[] products;
    public cart(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId);     
        this.nProducts = Math.abs(nProducts);
        this.products = new product[nProducts];    }
    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);    }
    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);    }
    public void setProducts(product[] products) {
        this.products = products;    }
    public int getCustomerId() {
        return customerId;    }
    public int getnProducts() {
        return nProducts;    }
    public product[] getProducts() {
        return products;  }   
    public void addProduct(product product, int index) {
        if (index >= 0 && index < nProducts) {     
            products[index] = product;
        } else {         
            System.out.println("Invalid index.");  }  }
    public void removeProduct(int index) {     
        if (index >= 0 && index < nProducts) {
            products[index] = null;   
        } else {
            System.out.println("Invalid index.");        }
    }
    public double calculatePrice() {     
        double totalPrice = 0;
        for (product product:products) {    
            if (product != null) {
                totalPrice += product.getPrice();            }
        }        return totalPrice;
    }
    public void placeOrder() {    
        
        Order order=new Order(customerId, 1, products, (float) calculatePrice());      
        order.printOrderInfo();
    }}