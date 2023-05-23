package com.example.dpr;

import java.io.Serializable;

public class Medicines implements Serializable {
    private String name;
    private String prep;
    private String price;
    private String key;
    // private String image;

    public Medicines() {

    }

  /*  public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrep() {
        return prep;
    }

    public void setPrep(String prep) {
        this.prep = prep;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Medicines(String name, String prep, String price, String image) {
        if (name.trim().equals("")) {
            name = "Medicines NoName";
        }
        this.name = name;
        this.prep = prep;
        this.price = price;
        //this.image = image;
    }
}
