package com.example.thedessert;

public class dessertmenu {
   private String dessert_name,dessert_price;
   private int image_id;

    public dessertmenu(String dessert_name, String dessert_price, int image_id) {
        this.dessert_name = dessert_name;
        this.dessert_price = dessert_price;
        this.image_id = image_id;
    }

    public dessertmenu(int donuts, String string) {

    }


    public int getImage() {
        return image_id;
    }

    public void setIamge(int image_id) {
        this.image_id = image_id;
    }

    public String getText1() {
        return dessert_name;
    }

    public void setText1(String dessert_name) {
        this.dessert_name = dessert_name;
    }

    public String getText2() {
        return dessert_price;
    }

    public void setText2(String dessert_price) {
        this.dessert_price = dessert_price;
    }
}