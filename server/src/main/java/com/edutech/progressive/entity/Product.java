package com.edutech.progressive.entity;

public class Product {
private int productId;
private int warehousehold;
private String productName;
private String productDescription;
private int quantity;
private Long price;
public Product() {
}
public Product(int productId, int warehousehold, String productName, String productDescription, int quantity,
        Long price) {
    this.productId = productId;
    this.warehousehold = warehousehold;
    this.productName = productName;
    this.productDescription = productDescription;
    this.quantity = quantity;
    this.price = price;
}
public int getProductId() {
    return productId;
}
public void setProductId(int productId) {
    this.productId = productId;
}
public int getWarehousehold() {
    return warehousehold;
}
public void setWarehousehold(int warehousehold) {
    this.warehousehold = warehousehold;
}
public String getProductName() {
    return productName;
}
public void setProductName(String productName) {
    this.productName = productName;
}
public String getProductDescription() {
    return productDescription;
}
public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
}
public int getQuantity() {
    return quantity;
}
public void setQuantity(int quantity) {
    this.quantity = quantity;
}
public Long getPrice() {
    return price;
}
public void setPrice(Long price) {
    this.price = price;
}


}