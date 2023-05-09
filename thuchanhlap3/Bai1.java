/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhlap3;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Bai1 {
    Scanner sc = new Scanner(System.in);
    
    class Product {
        String description, productId;      double price;
        @Override
        public String toString() {
            return "Product{" + "description=" + description + ", productId=" + productId + ", price=" + price + '}'; }
        public Product() { }
        public Product(String description, String productId, double price) {
            this.description = description;
            this.productId = productId;
            this.price = price; }
        public String getDescription() { return description; }
        public String getProductId() { return productId; }
        public double getPrice() { return price; }
        public void setDescription(String description) { this.description = description; }
        public void setProductId(String productId) { this.productId = productId; }
        public void setPrice(double price) { this.price = price; }
    }
    
    class OrderDetail {
        int quatily;        Product product;
        @Override
        public String toString() {
            return "OrderDetail{" + "quatily=" + quatily + ", product=" + product + '}'; }
        public double calcTotalPrice() { return quatily * product.getPrice(); }
        public Product getProduct() { return product; }
        public int getQuatily() { return quatily; }
        public void setQuatily(int quatily) { this.quatily = quatily; }
        public OrderDetail(Product product, int quatily) {
            this.product = product; this.quatily = quatily; }
    }
    
    class Order {
        int ordedID, count;     LocalDate orderDate;        OrderDetail[] lineItems;
        public Order(int ordedID, LocalDate orderdate) {
            this.ordedID = ordedID;
            this.orderDate = orderdate;
            lineItems = new OrderDetail[10];
            count = 0; }
        public void addLineItem(Product p, int q) {
            lineItems[count] = new OrderDetail(p, q);
            count++; }
        double calcTotalCharge() {
            double calcTotalCharge = 0;
            for(int i=0; i<count; i++) {
                calcTotalCharge += lineItems[i].calcTotalPrice(); }
            return calcTotalCharge(); }
        @Override
        public String toString() {
            return "Order{" + "ordedID=" + ordedID + ", orderdate=" + orderDate + ", lineItems=" + lineItems + ", count=" + count + '}'; }
        public int getOrdedID() { return ordedID; }
        public LocalDate getOrderDate() { return orderDate; }
        public OrderDetail[] getLineItems() { return lineItems; }
        public void setOrderDate(LocalDate orderDate) {
            this.orderDate = orderDate; }
    }
    
    class Main {
        public static void main(String[] args) {
            
        }
    }
}