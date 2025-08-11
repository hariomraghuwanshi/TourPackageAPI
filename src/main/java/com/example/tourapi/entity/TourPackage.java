package com.example.tourapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tour_packages")
public class TourPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String image;
    private String title;
    private String description;
    private String price;
    private String location;
    private String discountInPercentage;

    public TourPackage() {}

    public TourPackage(Long id, String image, String title, String description, String price, String location, String discountInPercentage) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.description = description;
        this.price = price;
        this.location = location;
        this.discountInPercentage = discountInPercentage;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getPrice() { return price; }
    public void setPrice(String price) { this.price = price; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getDiscountInPercentage() { return discountInPercentage; }
    public void setDiscountInPercentage(String discountInPercentage) { this.discountInPercentage = discountInPercentage; }
}
