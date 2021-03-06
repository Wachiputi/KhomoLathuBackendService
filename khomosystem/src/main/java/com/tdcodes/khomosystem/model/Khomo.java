package com.tdcodes.khomosystem.model;

//import from the java libraries
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//class khomo
public class Khomo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //declaration of class variables
    private int id;
    private String name;
    private String Property;
    private int price;
    private int phone_number;
    private String address;
    private String description;

    //a no arg constructor
    public Khomo() {
    }
    //a set of getters and setters to access accessible datafields and methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProperty() {
        return Property;
    }

    public void setProperty(String property) {
        Property = property;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
