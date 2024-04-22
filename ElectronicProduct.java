package com.mycompany.ecomercesystem;
public class ElectronicProduct extends product {   
    protected String brand;
    protected int warrantyPeriod;
    public ElectronicProduct(int warrantyPeriod, String brand, double price, String name, int productId) { 
        super(productId, name, price);
        this.brand = brand;       
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }
    public void setBrand(String brand) {   
        this.brand = brand;
    }    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = Math.abs(warrantyPeriod);    }
    public String getBrand() {
        return brand;    }
    public int getWarrantyPeriod() {
        return warrantyPeriod;    }
}
