package com.mycompany.ecomercesystem;
import javax.swing.*;
public class Order {
     int customerId;   
     int orderId;
     product[] products;  
     float totalPrice;
    public Order(int customerId, int orderId, product[] products, float totalPrice) {  
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);       
        this.products = products;
        this.totalPrice = Math.abs(totalPrice);    }
    public void printOrderInfo() { 
       JOptionPane.showMessageDialog(null,"Here's your order's summary:\n");
       JOptionPane.showMessageDialog(null,"Order ID:"+ orderId+"\n");
       JOptionPane.showMessageDialog(null,"Customer ID:"+customerId+"\n");
       JOptionPane.showMessageDialog(null,"Products:\n");
        for (product product : products) {        
            if (product != null) {
                JOptionPane.showMessageDialog(null,"" +product.getName()+" -$"+ product.getPrice());      
            }
        }
        JOptionPane.showMessageDialog(null,"Total price: $"+ totalPrice);
    }
}