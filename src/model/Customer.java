package model;


import java.util.List;

public class Customer {
    String name;
    String userName;
    String password;
    List<MenuItem> cart;
    String deliveryAddress;
    String paymentMode;

    public Customer() {
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Customer(String name, String userName, String password, List<MenuItem> cart) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.cart = cart;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<MenuItem> getCart() {
        return cart;
    }

    public void setCart(List<MenuItem> cart) {
        this.cart = cart;
    }
}
